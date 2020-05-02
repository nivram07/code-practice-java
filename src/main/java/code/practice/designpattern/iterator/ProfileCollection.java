package code.practice.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProfileCollection implements IterableCollection<Profile> {

  private List<Profile> collection; // lazy init

  @Override
  public Iterator<Profile> iterator() {
    initCollection();
    return new ProfileIterator(this);
  }

  private void initCollection() {
    if (collection == null) collection = new ArrayList<>();
  }

  @Override
  public void add(Profile profile) {
    initCollection();
    this.collection.add(profile);
  }

  @Override
  public Profile[] getCollection() {
    return collection.toArray(new Profile[0]);
  }
}
