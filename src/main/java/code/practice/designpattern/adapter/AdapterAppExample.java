package code.practice.designpattern.adapter;

public class AdapterAppExample {

  public static void main(String[] args) {
    VHS vhs = new Cassette(10);
    OldVideoPlayer<VHS> oldVideoPlayer = new VHSOldVideoPlayer();
    oldVideoPlayer.play(vhs);
    oldVideoPlayer.rewind(vhs);

    oldVideoPlayer.fastForward(vhs, 5);
    oldVideoPlayer.play(vhs);

    DigitalVideo digitalVideo = new MP4Video(12);
    VHS adapter = new MP4toVHSAdapter(digitalVideo);
    oldVideoPlayer.play(adapter);
  }
}
