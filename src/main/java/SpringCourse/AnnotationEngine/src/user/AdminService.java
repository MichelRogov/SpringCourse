package user;


import engine.RequestBody;
import engine.Service;
import engine.StartMethod;

@Service
public class AdminService{

    @StartMethod
    public void run(@RequestBody Admin admin) {
        System.out.println("Admin service -> run() -> input");
        System.out.println(admin);
    }
}