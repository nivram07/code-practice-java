package code.practice.designpattern.iterator;

public class IteratorApp {

  public static void main(String[] args) {
    IterableCollection<Profile> profileCollection = new ProfileCollection();
    profileCollection.add(new Profile("Marvin", 32, "www.pixelconic.com"));
    profileCollection.add(new Profile("Vin", 21, "www.amazon.com/vin"));
    profileCollection.add(new Profile("Ashley", 21, "www.ashley.com/me"));

    Iterator<Profile> iterator = profileCollection.iterator();
    while(iterator.hasNext()) {
      System.out.format("%s\n", iterator.next().toString());
    }
  }

}
