package code.practice.designpattern.adapter;

public interface OldVideoPlayer<V> {
  void play(V v);
  void rewind(V v);
  void fastForward(V v, int sec);
}
