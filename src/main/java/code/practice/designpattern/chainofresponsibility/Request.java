package code.practice.designpattern.chainofresponsibility;

import java.util.List;

public interface Request<O> {
  O getData();
  List<Error> getErrors();
  void addError(Error error);

  default boolean isValid() {
    return getErrors() == null || getErrors().isEmpty();
  }
}
