/*
 * @author Gershom Nsengiyumva
 *
 * This project demonstrates Builder Design pattern
 *
 *
 * */
public class Main {
    public static void main(String[] args) {

        User user = new User.Builder("John", "Doe").build();

        System.out.println(user);
    }
}