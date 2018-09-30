package project.user;

import project.engine.ConsoleInput;
import project.engine.Service;
import project.engine.StartMethod;

@Service
public class UserService /*implements MyService*/ {

    @StartMethod
    public void run(@ConsoleInput(displayMessage = "Enter user data:") String input) {
        System.out.println("User service -> run() -> input");
        System.out.println(input);
    }

}
