package code.practice.designpattern.singleton;

import java.util.HashMap;
import java.util.Map;

public class Database {
  private static Database instance;
  private Map<String, String> store;
  private Database() {
    store = new HashMap<>();
  }

  public static Database getInstance() {
    if (instance == null) {
      instance = new Database();
    }
    return instance;
  }

  public Map<String, String> getStore() {
    return this.store;
  }
}
