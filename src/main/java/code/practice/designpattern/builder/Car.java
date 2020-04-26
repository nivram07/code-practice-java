package code.practice.designpattern.builder;

public class Car {
  private final String model;
  Engine engine;
  Color color;
  CarType type = CarType.GENERIC;
  SoundSystem soundSystem = SoundSystem.GENERIC;
  int cupHolders = 0;
  int extraWheels = 0;
  int seats;

  public Car(String model) {
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }

  @Override
  public String toString() {
    return "model: " + this.model
        + ", color: " + this.color.toString()
        + ", type: " + this.type.toString()
        + ", engine: " + this.engine.toString()
        + ", seats: " + this.seats
        + ", cupHolders: " + this.cupHolders
        + ", soundSystem: " + this.soundSystem.toString()
        + ", extraWheels: " + this.extraWheels;
  }
}
