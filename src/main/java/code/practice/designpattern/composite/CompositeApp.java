package code.practice.designpattern.composite;

public class CompositeApp {
  public static void main(String[] args) {
    Box entireBox = new Box();
    entireBox.add(new Item(2.0, 1, "hand soap"));
    entireBox.add(new Item(2.0, 1, "hand soap"));

    Box miniBox = new Box();
    miniBox.add(new Item(1.0, 2, "paper clip"));
    miniBox.add(new Item(1.0, 2, "paper clip"));
    miniBox.add(new Item(45.50, 3, "gundam mg 001"));
    entireBox.add(miniBox);
    entireBox.add(miniBox);

    double total = entireBox.getPrice();
    System.out.format("total: %03.03f\n", total);
    System.out.format("%s\n", entireBox.getDescription());
  }
}
