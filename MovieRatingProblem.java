public class MovieRatingProblem {

  static int getRatings(int ratings[]) {
    // 1. if rating > 0 , add it
    // 2. if skipped, choose between ratings[i] and ratings[i-1]
    //        set skipped = false;
    // 3. if rating < 0
    //      set skipped = true;
    int totalRatings = 0;
    boolean skipped = false;
    for (int i = 0; i < ratings.length; i++) {
      if (ratings[i] > 0) {
        System.out.println("Picked: " + ratings[i]);
        totalRatings += ratings[i];
        skipped = false;
      } else if (skipped) {
        if (ratings[i] < ratings[i-1]) {
          System.out.println("Picked: " + ratings[i-1]);
          totalRatings += ratings[i-1];
        } else {
          System.out.println("Picked: " + ratings[i]);
          totalRatings += ratings[i];
        }
        skipped = false;
      } else {
        skipped = true;
      }
    }
    return totalRatings;
  }

  public static void main(String args[]) {
    int sampleInput[] = {5, -1, -3, 6, 9, 2, -4, -1};
    for (int i = 0; i < sampleInput.length; i++) {
      System.out.println(sampleInput[i]);
    }
    int movieRating = getRatings(sampleInput);
    System.out.println("Ratings: " + movieRating);
  }
}
