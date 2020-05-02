package code.practice.designpattern.chainofresponsibility;

public class AgeValidationHandler extends RequestHandler<Person> {
  @Override
  protected void process(Request<Person> request) {
    if (request.getData() != null) {
      Person person = request.getData();
      if (person.getAge() < 0 || person.getAge() > 120)
        request.addError(new GenericError(String.format("Invalid age: %d", person.getAge())));
    }
    if (next != null) next.process(request);
  }
}
