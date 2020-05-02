package code.practice.designpattern.chainofresponsibility;

public class NameValidationHandler extends RequestHandler<Person> {

  @Override
  protected void process(Request<Person> request) {
    if (request.getData() != null) {
      Person person = request.getData();
      if (person.getFirstName() == null || person.getFirstName().isEmpty()) {
        request.addError(new GenericError("Invalid firstName. firstName can't be null or empty"));
      }
      if (person.getLastName() == null || person.getLastName().isEmpty())
        request.addError(new GenericError("Invalid lastName. lastName can't be null or empty"));
    }
    if (next != null) next.process(request);
  }
}
