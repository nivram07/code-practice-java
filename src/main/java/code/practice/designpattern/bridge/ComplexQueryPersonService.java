package code.practice.designpattern.bridge;

import code.practice.model.Person;

import java.util.List;

public class ComplexQueryPersonService extends PersonService {

  public ComplexQueryPersonService(Repository<String, Person, String> repository) {
    super(repository);
  }

  List<Person> complexQueryOne(String query) {
    return repository.query(query);
  }

  List<Person> complexQueryTwo(String query) {
    return repository.query(query);
  }
}
