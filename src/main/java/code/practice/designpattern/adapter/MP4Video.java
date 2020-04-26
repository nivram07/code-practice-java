package code.practice.designpattern.adapter;

public class MP4Video implements DigitalVideo {

  private int totalTime;
  private int currentTime = 0;

  public MP4Video(int totalTime) {
    this.totalTime = totalTime;
  }

  @Override
  public void seek(int time) {
    this.currentTime = Integer.min(time, this.totalTime);
    this.currentTime = Integer.max(0, this.currentTime);
  }

  @Override
  public void showFrame() {
    System.out.format("frame %d\n", this.currentTime);
  }

  @Override
  public int getTotalTime() {
    return this.totalTime;
  }

  @Override
  public int getCurrentTime() {
    return this.currentTime;
  }
}
