package code.practice.designpattern.builder;

public class CarBuilderDirector {
  private final CarBuilder builder;

  public CarBuilderDirector(CarBuilder builder) {
    this.builder = builder;
  }

  public Car createSportsCar(String model, Color color) {
    builder.restartManufacture(model);
    builder.color(color);
    builder.seats(2);
    builder.engine(Engine.V8);
    return builder.getCar();
  }

  public Car createSedan(String model, Color color) {
    builder.restartManufacture(model);
    builder.color(color);
    builder.seats(5);
    builder.engine(Engine.GENERIC);
    builder.extraWheels(1);
    builder.cupHolders(4);
    builder.type(CarType.SEDAN);
    return builder.getCar();
  }
}
