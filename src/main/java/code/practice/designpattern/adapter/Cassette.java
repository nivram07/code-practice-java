package code.practice.designpattern.adapter;

public class Cassette implements VHS {

  private int totalTime = 0;
  private int currentTime = 0;

  public Cassette(int totalTime) {
    if (totalTime < 0)
      throw new IllegalArgumentException("Your cassette tape is broken!");
    this.totalTime = totalTime;
  }

  @Override
  public void rotateCCW() {
    if (this.currentTime > 0)
      this.currentTime--;
  }

  @Override
  public void rotateCW() {
    if (this.currentTime < totalTime)
      this.currentTime++;
  }

  @Override
  public boolean reachedEnd() {
    return this.currentTime == this.totalTime;
  }

  @Override
  public boolean reachedStart() {
    return this.currentTime == 0;
  }

  @Override
  public void show() {
    System.out.format("oldFrame: %d\n", this.currentTime);
  }
}
