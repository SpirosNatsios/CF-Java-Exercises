package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentials;

public class Main {

    public static void main(String[] args) {
        User spiros = new User(1354, "Spiros", "Natsios");
        UserCredentials george = new UserCredentials(5462, "george", "123asdf@@!sad");

        System.out.println("User Fields");
        System.out.println("Id: " + spiros.getId());
        System.out.println("Firstname " + spiros.getFirstname());
        System.out.println("Lastname " + spiros.getLastname());

        System.out.println("UserCredentials Fields");
        System.out.println("Id: " + george.getId());
        System.out.println("Username " + george.getUsername());
        System.out.println("Password " + george.getPassword());


    }
}
