package code.practice.designpattern.chainofresponsibility;

public abstract class RequestHandler<O> {
  protected RequestHandler<O> next;
  abstract void process(Request<O> request);
  void setNext(RequestHandler<O> next) {
    this.next = next;
  }
}
