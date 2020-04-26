package code.practice.designpattern.builder;

import static code.practice.designpattern.builder.Color.BLACK;
import static code.practice.designpattern.builder.Color.RED;

public class BuilderApp {

  public static void main(String[] args) {
    CarBuilderDirector director = new CarBuilderDirector(new GenericCarBuilder());

    Car sportsCar = director.createSportsCar("V1-2100", RED);
    System.out.println("sports car: " + sportsCar.toString());
    Car sedan = director.createSedan("V1-22", BLACK);
    System.out.println("sedan: " + sedan.toString());
  }
}
