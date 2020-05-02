package code.practice.designpattern.proxy;

public class ProxyThirdPartyVideoLib implements ThirdPartyVideoLib {

  private final ThirdPartyVideoLib thirdPartyVideoLib;
  private Video cache; // cache video so we don't need to download it every time. Not expiring for simplicity.

  public ProxyThirdPartyVideoLib(ThirdPartyVideoLib thirdPartyVideoLib) {
    this.thirdPartyVideoLib = thirdPartyVideoLib;
  }

  @Override
  public Video download(String name) {
    if (cache == null) {
      cache = this.thirdPartyVideoLib.download(name);
    }
      return this.cache;
  }
}
