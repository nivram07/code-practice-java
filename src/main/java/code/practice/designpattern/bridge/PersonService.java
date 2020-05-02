package code.practice.designpattern.bridge;

import code.practice.model.Person;

import java.util.List;

public class PersonService {

  protected Repository<String, Person, String> repository;

  public PersonService(Repository<String, Person, String> repository) {
    this.repository = repository;
  }

  public void save(Person person) {
    this.repository.save(person);
  }

  public Person get(String key) {
    return this.repository.get(key);
  }

  public void delete(String key) {
    this.repository.delete(key);
  }

  public List<Person> getPersonByAge(String query) {
    return this.repository.query(query);
  }
}
