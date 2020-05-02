package code.practice.designpattern.chainofresponsibility;

public class NullValidationHandler<T> extends RequestHandler<T> {
  @Override
  protected void process(Request<T> request) {
    if (request != null && request.getData() == null) {
      request.addError(new GenericError("Invalid data. data cannot be null"));
    }
    if (next != null) next.process(request);
  }
}
