package code.practice.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeTypeFactory {

  private static TreeTypeFactory treeTypeFactory;

  private Map<String, Map<String, Map<String, TreeType>>> cache;

  private TreeTypeFactory() {
    cache = new HashMap<>();
  }

  public static TreeTypeFactory getInstance() {
    synchronized (TreeTypeFactory.class) {
      if (treeTypeFactory == null)
        treeTypeFactory = new TreeTypeFactory();
    }
    return treeTypeFactory;
  }

  public synchronized TreeType getTreeType(String name, String color, String texture) {
    if (cache.containsKey(name)) {
      Map<String, Map<String, TreeType>> colorMap = cache.get(name);
      if (colorMap.containsKey(color)) {
        Map<String, TreeType> textureMap = colorMap.get(color);
        if (textureMap.containsKey(texture))
          return textureMap.get(texture);
        else {
          TreeType treeType = new TreeType(name, color, texture);
          textureMap.put(texture, treeType);
          return treeType;
        }
      } else {
        Map<String, TreeType> textureMap = new HashMap<>();
        TreeType treeType = new TreeType(name, color, texture);
        textureMap.put(texture, treeType);
        colorMap.put(color, textureMap);
        cache.put(name, colorMap);
        return treeType;
      }
    } else {
      TreeType treeType = new TreeType(name, color, texture);
      Map<String, TreeType> textureMap = new HashMap<>();
      textureMap.put(texture, treeType);
      Map<String, Map<String, TreeType>> colorMap = new HashMap<>();
      colorMap.put(color, textureMap);
      cache.put(name, colorMap);
      return treeType;
    }
  }
}
