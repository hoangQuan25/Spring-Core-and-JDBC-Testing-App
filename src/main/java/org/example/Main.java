package org.example;

import org.example.config.AppConfig;
import org.example.model.User;
import org.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        User user1 = new User();
        user1.setEmail("aksdhfs@gmail.com");
        user1.setName("Haaland");

        User user2 = new User();
        user2.setName("Neymar Jr");
        user2.setEmail("qqagsgsgs@gmail.com");

        userService.registerUser(user1);
        userService.registerUser(user2);

//        for (User user : userService.getAllUsers()) {
//            System.out.println(user.toString());
//        }

        userService.getAllUsers().forEach(System.out::println);

        context.close();

    }
}