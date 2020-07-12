package code.practice.designpattern.singleton;

public class SingletonAppExample {

  public static void main(String[] args) {
    Database database = Database.getInstance();
    database.put("A", "some value");

    Database sameDatabase = Database.getInstance();
    String value = sameDatabase.get("A");
    System.out.println("Value: " + value);
  }
}
