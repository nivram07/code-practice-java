package code.practice.designpattern.chainofresponsibility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonRequest implements Request<Person> {

  private Person data;
  private List<Error> errors;

  public PersonRequest(final Person person) {
    this.data = person;
  }

  @Override
  public Person getData() {
    return this.data;
  }

  @Override
  public List<Error> getErrors() {
    return this.errors == null ? null : Collections.unmodifiableList(this.errors);
  }

  @Override
  public void addError(Error error) {
    if (this.errors == null) this.errors = new ArrayList<>();
    this.errors.add(error);
  }
}
