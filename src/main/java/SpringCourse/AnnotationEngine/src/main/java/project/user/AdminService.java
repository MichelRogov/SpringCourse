package project.user;


import project.engine.RequestBody;
import project.engine.Service;
import project.engine.StartMethod;

@Service
public class AdminService{

    @StartMethod
    public void run(@RequestBody Admin admin) {
        System.out.println("Admin service -> run() -> input");
        System.out.println(admin);
    }
}