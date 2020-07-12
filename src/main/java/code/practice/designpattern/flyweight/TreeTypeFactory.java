package code.practice.designpattern.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TreeTypeFactory {

  private volatile static TreeTypeFactory treeTypeFactory;

  private final Map<String, Map<String, Map<String, TreeType>>> cache;

  private TreeTypeFactory() {
    cache = new ConcurrentHashMap<>();
  }

  public static TreeTypeFactory getInstance() {
    TreeTypeFactory instance = treeTypeFactory;
    if (instance == null) {
        synchronized (TreeTypeFactory.class) {
          instance = treeTypeFactory;
          if (instance == null)
            treeTypeFactory = new TreeTypeFactory();
            instance = treeTypeFactory;
        }
    }
    return instance;
  }

  public TreeType getTreeType(String name, String color, String texture) {
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
        synchronized (TreeTypeFactory.class) {
          Map<String, TreeType> textureMap = new ConcurrentHashMap<>();
          TreeType treeType = new TreeType(name, color, texture);
          textureMap.put(texture, treeType);
          colorMap.put(color, textureMap);
          cache.put(name, colorMap);
          return treeType;
        }
      }
    } else {
      synchronized (TreeTypeFactory.class) {
        TreeType treeType = new TreeType(name, color, texture);
        Map<String, TreeType> textureMap = new ConcurrentHashMap<>();
        textureMap.put(texture, treeType);
        Map<String, Map<String, TreeType>> colorMap = new ConcurrentHashMap<>();
        colorMap.put(color, textureMap);
        cache.put(name, colorMap);
        return treeType;
      }
    }
  }
}
