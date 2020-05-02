package code.practice.designpattern.composite;

public class Item implements Product {
  private static final double THRESHOLD = 0.0001;
  private double price;
  private long id;
  private String name;

  public Item(double price, long id, String name) {
    this.price = price;
    this.id = id;
    this.name = name;
  }

  public long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public double getPrice() {
    return this.price;
  }

  @Override
  public String getDescription() {
    return String.format("[%010d] %-15s: %02.02f", this.id, this.name, this.price);
  }

  @Override
  public boolean equals(Object other) {
    if (other == null)
      return false;
    if (other instanceof Item) {
      Item otherItem = (Item) other;
      if (this.id == otherItem.id
          && Math.abs(this.price - otherItem.price) > THRESHOLD
          && this.name.equalsIgnoreCase(otherItem.name))
        return true;
    }

    return true;
  }

  @Override
  public int hashCode() {
    long prime = 31;
    long hash = this.id > 0 ? this.id * prime : prime;
    hash = this.name.length() > 0 ? this.name.length() * hash : hash;
    hash = this.price > 0.0 ? (long) this.price * hash : hash;

    if (hash <= Integer.MAX_VALUE)
      return Math.toIntExact(hash);
    else
      return Integer.MAX_VALUE;
  }
}
