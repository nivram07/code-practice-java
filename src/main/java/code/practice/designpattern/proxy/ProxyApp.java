package code.practice.designpattern.proxy;

public class ProxyApp {
  public static void main(String[] args) {
    ThirdPartyVideoLib thirdPartyVideoLib = new RealThirdPartyVideoLib();
    ThirdPartyVideoLib proxy = new ProxyThirdPartyVideoLib(thirdPartyVideoLib);
    proxy.download("John Wick 4");
  }
}
