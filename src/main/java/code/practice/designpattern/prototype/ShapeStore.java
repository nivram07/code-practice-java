package code.practice.designpattern.prototype;

import code.practice.model.Shape;
import code.practice.model.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeStore {
  private static Map<String, Shape> map = null;


 public static Shape getShape(String name) {
   if (map == null) {
     map = new HashMap<>();
     map.put(Square.class.getSimpleName(), new Square());
   }
   return (Shape) map.get(name).clone();
 }
}
