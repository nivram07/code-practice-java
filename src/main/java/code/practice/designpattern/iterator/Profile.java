package code.practice.designpattern.iterator;

import java.util.Objects;

public class Profile {
  private String name;
  private Integer age;
  private String url;

  public Profile(String name, Integer age, String url) {
    this.name = name;
    this.age = age;
    this.url = url;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if (!(o instanceof Profile)) return false;
    Profile other = (Profile) o;

    return (Objects.equals(this.name, other.name)
          && Objects.equals(this.age, other.age)
          && Objects.equals(this.url, other.url));
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age, this.url);
  }

  @Override
  public String toString() {
    return "Profile{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", url='" + url + '\'' +
        '}';
  }
}
