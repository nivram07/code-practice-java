import java.util.*;
import java.util.stream.Collectors;

public class LambdaPractice {

    public static void main(String[] args) {

        Commander commander = new Commander();
        commander.executeCommand(1, (a) -> System.out.println("Hello lambda " + a));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 6, 3, 2, 1, 8, 7, 10, 9, 4));

        numbers.sort(Comparator.comparingInt(num1 -> num1));

        System.out.println(numbers);

        List<User> users = new ArrayList<>();
        users.add(new User("Marvin", "Flores"));
        users.add(new User("John", "Wick"));
        users.add(new User("John", "Tick"));
        users.add(new User("John", "Sick"));
        users.add(new User("Marvin", "flares"));

        Collections.sort(users);

        users.forEach(user -> System.out.println(user.toString()));

        List<String> firstNames = users.stream().map(user -> user.firstName + " is awesome").collect(Collectors.toList());

        firstNames.forEach(name -> System.out.println(name));



    }

    public interface Executor {
        void execute(int a);
    }

    public static class Commander {
        public void executeCommand(int num, Executor executor) {
            executor.execute(num);
            System.out.println("Command executed");
        }
    }

    public static class User implements Comparable<User> {
        private String firstName;
        private String lastName;

        public User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        @Override
        public int compareTo(User anotherUser) {
            int result = this.firstName.compareToIgnoreCase(anotherUser.firstName);
            if (result == 0) {
                return this.lastName.compareToIgnoreCase(anotherUser.lastName);
            }
            return result;
        }

        @Override
        public String toString() {
            return "User{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}
