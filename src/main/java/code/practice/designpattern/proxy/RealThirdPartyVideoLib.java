package code.practice.designpattern.proxy;

public class RealThirdPartyVideoLib implements ThirdPartyVideoLib {

  @Override
  public Video download(String name) {
    for (int i = 0; i < 10000; i++) /* simulate expensive operation */;
    return new Video(name);
  }
}
