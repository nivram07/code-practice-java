package code.practice.java;

// You can't extend me now
public final class FinalClassExample {
  private final String name;

  public FinalClassExample(final String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
