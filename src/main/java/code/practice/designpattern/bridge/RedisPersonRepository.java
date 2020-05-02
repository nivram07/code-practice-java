package code.practice.designpattern.bridge;

import code.practice.model.Person;

import java.util.List;

public class RedisPersonRepository implements Repository<String, Person, String> {
  @Override
  public void save(Person obj) {

  }

  @Override
  public void update(Person obj) {

  }

  @Override
  public void delete(String key) {

  }

  @Override
  public List<Person> query(String query) {
    return null;
  }

  @Override
  public Person get(String key) {
    return null;
  }
}
