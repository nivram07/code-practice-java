package code.practice.designpattern.composite;

import java.util.HashMap;
import java.util.Map;

public class Box implements Product {

  private final Map<Product, Integer> products = new HashMap<>();


  public void add(Product product) {
    if (products.containsKey(product)) {
      products.put(product, products.get(product) + 1);
    } else {
      products.put(product, 1);
    }
  }

  public void delete(Product product) {
    if (products.containsKey(product)) {
      int count = products.get(product);
      if (count > 1) {
        products.put(product, count - 1);
      } else {
        products.remove(product);
      }
    }
  }

  @Override
  public double getPrice() {
    double total = 0;
    for (Map.Entry<Product, Integer> entry : products.entrySet()) {
      total += entry.getKey().getPrice() * entry.getValue();
    }
    return total;
  }

  @Override
  public String getDescription() {
    StringBuilder builder = new StringBuilder();
    for (Map.Entry<Product, Integer> entry : products.entrySet()) {
      builder.append(entry.getKey().getDescription()).append(": x").append(entry.getValue());
      builder.append("\n");
    }
    return builder.toString();
  }
}
