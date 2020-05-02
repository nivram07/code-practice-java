package code.practice.designpattern.chainofresponsibility;

public class ChainOfResponsibilityApp {

  public static void main(String[] args) {
    Person person = new Person();
    person.setAge(-1);

    Request<Person> personRequest = new PersonRequest(person);

    RequestHandler<Person> baseHandler = new NameValidationHandler();
    RequestHandler<Person> ageValidationHandler = new AgeValidationHandler();
    baseHandler.setNext(ageValidationHandler);

    RequestHandler<Person> nullValidationHandler = new NullValidationHandler<>();
    ageValidationHandler.setNext(nullValidationHandler);

    RequestHandler<Person> requestDataHandler = new PersonRequestDataHandler();
    nullValidationHandler.setNext(requestDataHandler);

    baseHandler.process(personRequest);

    for (Error error : personRequest.getErrors()) {
      System.out.format("%s\n", error.getMessage());
    }

    person.setFirstName("Marvin");
    person.setLastName("Flores");
    person.setAge(32);

    Request<Person> validPersonRequest = new PersonRequest(person);
    baseHandler.process(validPersonRequest);
  }
}
