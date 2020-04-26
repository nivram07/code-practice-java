package code.practice.designpattern.builder;

import code.practice.model.Person;

public class InPlaceBuilderExample {

  public static void main(String[] args) {
    Person person1 = new Person.PersonBuilder()
        .withAge(32)
        .withFirstName("Marvin")
        .withLastName("Flores")
        .withGender(Person.Gender.MALE)
        .build();
    System.out.println(person1.toString());

  }
}
