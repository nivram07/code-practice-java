package code.practice.designpattern.chainofresponsibility;

public class PersonRequestDataHandler extends RequestHandler<Person> {
  @Override
  protected void process(Request<Person> request) {
    if (request != null && request.isValid()) {
      System.out.format("%s - saved successfully.\n", request.getData().toString());
    }
    if (next != null) next.process(request);
  }

}
