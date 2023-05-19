package com.java.solidprinciples;

public class SingleResponsibility {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = new User("Jhon", "pwd1", "jhon@email.com");
        userService.addUser(user);
        userService.deleteUser(user);

        EmailService emailService = new EmailService();
        emailService.sendEmail(user, "welcome");

    }
}

record User(String username, String password, String email) {
}

/**
 * UserService class is responsible for user operations only
 * which has single responsibility , we didn't club EmailService details here
 */
class UserService {

    /*Save user*/
    public void addUser(User user) {
        System.out.println("User got added.."+user.username());
    }

    /*delete user*/
    public void deleteUser(User user) {
        System.out.println("User got deleted.."+user.username());
    }
}

/**
 * EmailService is handling single responsibility i.e, sending email, here we didn't club
 * UserService details with EmailService
 */
class EmailService {
    public void sendEmail(User user, String message) {
        System.out.println("Email with subject "+message+" sent successfully for "+user.email());
    }
}
