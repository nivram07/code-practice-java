package code.practice.designpattern.iterator;

public interface IterableCollection<O> {
  O[] getCollection();
  Iterator<O> iterator();
  void add(O o);
}
