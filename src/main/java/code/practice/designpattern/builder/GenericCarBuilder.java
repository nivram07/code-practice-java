package code.practice.designpattern.builder;

public class GenericCarBuilder implements CarBuilder {

  private Car car;

  public GenericCarBuilder() {
    this.car = new Car("generic");
  }

  @Override
  public void color(Color color) {
    this.car.color = color;
  }

  @Override
  public void engine(Engine engine) {
    this.car.engine = engine;
  }

  @Override
  public void seats(int num) {
    this.car.seats = num;
  }

  @Override
  public void extraWheels(int num) {
    this.car.extraWheels = num;
  }

  @Override
  public void type(CarType type) {
    this.car.type = type;
  }

  @Override
  public void cupHolders(int num) {
    this.car.cupHolders = num;
  }

  @Override
  public void soundSystem(SoundSystem soundSystem) {
    this.car.soundSystem = soundSystem;
  }

  @Override
  public Car getCar() {
    return this.car;
  }

  @Override
  public void restartManufacture(String model) {
    this.car = new Car(model);
  }
}
