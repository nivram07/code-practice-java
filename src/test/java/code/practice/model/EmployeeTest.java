package code.practice.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class EmployeeTest {

  @Test
  public void itShouldSuccessfullyExecuteEqualsAndHashCode() {
    Employee employee1 = new Employee("Marvin", 32);
    Employee employee2 = new Employee("Marvin", 32);

    Assert.assertEquals(employee1, employee2);

    employee1.addUnderLing(new Employee("Todd", 30));

    Assert.assertNotEquals(employee1, employee2);

    employee2.addUnderLing(new Employee("Todd", 30));

    Assert.assertEquals(employee1, employee2);
  }
}
