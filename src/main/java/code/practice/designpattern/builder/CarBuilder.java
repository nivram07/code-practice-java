package code.practice.designpattern.builder;

public interface CarBuilder {
  void color(Color color);
  void engine(Engine engine);
  void seats(int num);
  void extraWheels(int num);
  void type(CarType type);
  void cupHolders(int num);
  void soundSystem(SoundSystem soundSystem);
  void restartManufacture(String model);
  Car getCar();
}
