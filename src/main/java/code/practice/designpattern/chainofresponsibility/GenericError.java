package code.practice.designpattern.chainofresponsibility;

public class GenericError implements Error {

  String message;

  public GenericError(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return this.message;
  }


}
