package code.practice.designpattern.flyweight;

public class FlyWeightApp {
  public static void main(String[] args) {
    Forest forest = new Forest();
    forest.plantTree(0, 0, "mahogany", "green", "mahogTex1");
    forest.plantTree(1, 1, "bamboo", "green", "bambooText1");
    forest.plantTree(2, 1, "bamboo", "orange", "bambooText2");
    forest.plantTree(2, 2, "mahogany", "green", "mahogTex1");
  }
}
