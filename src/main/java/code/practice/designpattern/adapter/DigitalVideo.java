package code.practice.designpattern.adapter;

public interface DigitalVideo {
  void seek(int time);
  void showFrame();
  int getTotalTime();
  int getCurrentTime();
}
