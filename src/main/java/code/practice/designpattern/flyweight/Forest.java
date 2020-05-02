package code.practice.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
  private List<Tree> trees;

  public Forest() {
    trees = new ArrayList<>();
  }

  public void plantTree(int x, int y, String name, String color, String texture) {
    TreeType treeType = TreeTypeFactory.getInstance().getTreeType(name, color, texture);
    Tree tree = new Tree(x, y, treeType);
    trees.add(tree);
    tree.draw();
  }
}
