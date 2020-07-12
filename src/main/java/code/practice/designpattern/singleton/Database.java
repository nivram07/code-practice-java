package code.practice.designpattern.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Database {
  private static Database instance;
  private final Map<String, String> store;
  private Database() {
    store = new ConcurrentHashMap<>();
  }

  public synchronized static Database getInstance() {
    if (instance == null) {
      instance = new Database();
    }
    return instance;
  }

  public void put(String key, String value) {
    store.put(key, value);
  }

  public String get(String key) {
    return store.get(key);
  }
}
