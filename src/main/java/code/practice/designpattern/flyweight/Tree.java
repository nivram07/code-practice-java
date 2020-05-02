package code.practice.designpattern.flyweight;

public class Tree {
  private int x;
  private int y;
  private TreeType type;

  public Tree(int x, int y, TreeType treeType) {
    this.x = x;
    this.y = y;
    this.type = treeType;
  }

  public void draw() {
    System.out.format("tree(%d,%d) %s\n", x, y, type.toString());
  }
}
