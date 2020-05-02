package code.practice.designpattern.bridge;

public class BridgeApp {
  public static void main(String[] args) {
    PersonService personService = new PersonService(new GenericPersonRepository());
    personService.getPersonByAge("SELECT * FROM person WHERE person.age = 32 ORDER BY person.age");

    ComplexQueryPersonService complexQueryPersonService = new ComplexQueryPersonService(new RedisPersonRepository());
    complexQueryPersonService.complexQueryOne("complex query");
  }
}
