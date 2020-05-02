package code.practice.designpattern.iterator;

public class ProfileIterator implements Iterator<Profile> {

  private final Profile[] collection;
  private int currentIndex;

  public ProfileIterator(final IterableCollection<Profile> collection) {
    this.collection = collection.getCollection();
    currentIndex = 0;
  }
  @Override
  public boolean hasNext() {
    return currentIndex < collection.length;
  }

  @Override
  public Profile next() {
    Profile current = collection[currentIndex];
    currentIndex++;
    return current;
  }
}
