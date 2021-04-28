package akshitone.springtutorial.bootjokeapp;

import akshitone.springtutorial.bootjokeapp.serivces.JokeService;
import akshitone.springtutorial.bootjokeapp.serivces.JokeServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootJokeAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(BootJokeAppApplication.class, args);
        JokeService jokeService = new JokeServiceImpl();
        System.out.println(jokeService.getJoke());
    }

}
