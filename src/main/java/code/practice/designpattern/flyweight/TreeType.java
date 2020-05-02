package code.practice.designpattern.flyweight;

import java.util.Objects;

// stores intrinsic parts of the Tree
public class TreeType {
  private String name;
  private String color;
  private String texture; // use string for simplicity, this should usually a big object.

  public TreeType(String name, String color, String texture) {
    this.name = name;
    this.color = color;
    this.texture = texture;
  }

  @Override
  public String toString() {
    return String.format("%s %s %s", name, color, texture);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof TreeType)) return false;
    TreeType treeType = (TreeType) o;
    return Objects.equals(name, treeType.name) &&
        Objects.equals(color, treeType.color) &&
        Objects.equals(texture, treeType.texture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, color, texture);
  }
}
