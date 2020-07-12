package code.practice.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {
  final String name;
  final int age;
  private List<Employee> underlings;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void addUnderLing(Employee employee) {
    if (underlings == null) this.underlings = new ArrayList<>();
    this.underlings.add(employee);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Employee employee = (Employee) o;
    return age == employee.age &&
        name.equals(employee.name) &&
        Objects.equals(underlings, employee.underlings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age, this.underlings);
  }
}
