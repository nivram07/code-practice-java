package code.practice.model;

public class Person {
  public enum Gender {MALE, FEMALE}

  private final String firstName;
  private final String lastName;
  private final Gender gender;
  private int age;

  public Person(PersonBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.gender = builder.gender;
    this.age = builder.age;
  }

  @Override
  public String toString() {
    return "firstName: " + firstName
        + ", lastName: " + lastName
        + ", gender: " + gender.toString()
        + ", age: " + age;
  }


  public static class PersonBuilder {

    private String firstName;
    private String lastName;
    private Gender gender = Gender.MALE;
    private int age;



    public PersonBuilder withFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public PersonBuilder withLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public PersonBuilder withAge(int age) {
      this.age = Math.max(0, age);
      return this;
    }

    public PersonBuilder withGender(Gender gender) {
      this.gender = gender;
      return this;
    }

    public Person build() {
      Person person = new Person(this);
      // we can add some validations here;
      return person;
    }
  }
}
