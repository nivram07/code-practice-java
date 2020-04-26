package code.practice.designpattern.singleton;

public class SingletonAppExample {

  public static void main(String[] args) {
    Database database = Database.getInstance();
    database.getStore().put("A", "some value");

    Database sameDatabase = Database.getInstance();
    String value = sameDatabase.getStore().get("A");
    System.out.println("Value: " + value);
  }
}
