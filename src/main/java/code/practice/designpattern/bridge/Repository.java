package code.practice.designpattern.bridge;

import java.util.List;

public interface Repository<K, O, Q> {

  void save(O obj);
  void update(O obj);
  void delete(K key);
  List<O> query(Q query);
  O get(K key);


}
