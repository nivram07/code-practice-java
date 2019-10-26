package code.practice.java.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Uber {

  public static void main(String args[]) {

    String input[] = new String[]{
          "#START English.log",
          "San Francisco",
          "San jose",
          "#START Spanish.log",
          "Miami",
          "#END Spanish.log",
          "#END English.log"};
    Set<String> languages = new HashSet<>();
    Map<String, List<String>> citiesMap = new HashMap<>();


    for (int i = 0; i < input.length ; i++) {
      if (input[i].startsWith("#START")) {
        String language[] = input[i].split(" ");
        languages.add(language[1]);
      } else if (input[i].startsWith("#END")) {
        String language[] = input[i].split(" ");
        languages.remove(language[1]);

      } else {
        for (String language : languages) {
              List<String> currentCities = citiesMap.get(language);
              if ( currentCities == null || currentCities.isEmpty()) {
                currentCities = new ArrayList<>();
              }
          currentCities.add(input[i]);
          citiesMap.put(language, currentCities);
        }
      }
    }

    citiesMap.entrySet().forEach((entry) -> {
      System.out.println(entry.getKey() + "Cities: " + entry.getValue().toString());
    });
  }


}
