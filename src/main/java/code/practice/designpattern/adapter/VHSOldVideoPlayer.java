package code.practice.designpattern.adapter;

public class VHSOldVideoPlayer implements OldVideoPlayer<VHS> {

  @Override
  public void play(VHS vhs) {
    while (!vhs.reachedEnd()) {
      vhs.show();
      vhs.rotateCW();
    }
  }

  @Override
  public void rewind(VHS vhs) {
    while (!vhs.reachedStart())
      vhs.rotateCCW();
  }

  @Override
  public void fastForward(VHS vhs, int sec) {
    for (int i = 0; i < sec; i++)
      vhs.rotateCW();
  }
}
