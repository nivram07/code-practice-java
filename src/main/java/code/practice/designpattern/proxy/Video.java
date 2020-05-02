package code.practice.designpattern.proxy;

import java.util.Objects;

public class Video {
  private String name;
  private Object video;

  public Video(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object getVideo() {
    return video;
  }

  public void setVideo(Object video) {
    this.video = video;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if (!(o instanceof Video)) return false;
    Video video = (Video) o;
    return Objects.equals(this.name, video.name)
        && Objects.equals(this.video, video.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.video);
  }
}
