package code.practice.designpattern.adapter;

public class MP4toVHSAdapter implements VHS {

  private DigitalVideo video;

  public MP4toVHSAdapter(DigitalVideo video) {
    this.video = video;
  }
  @Override
  public void show() {
    this.video.showFrame();
  }

  @Override
  public boolean reachedEnd() {
    return this.video.getCurrentTime() == this.video.getTotalTime();
  }

  @Override
  public boolean reachedStart() {
    return this.video.getCurrentTime() == 0;
  }

  @Override
  public void rotateCCW() {
    this.video.seek(this.video.getCurrentTime() - 1);
  }

  @Override
  public void rotateCW() {
    this.video.seek(this.video.getCurrentTime() + 1);
  }
}
