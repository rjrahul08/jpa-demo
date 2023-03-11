
package com.jpatutorial.jpademo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get_users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

    @DeleteMapping("/delete_users")
    public String deleteAllUsers(){
        return userService.deleteAllUsers();
    }
    @DeleteMapping("/delete_user")
    public String deleteUser(@RequestParam("id") int id){
        return userService.deleteUser(id);
    }
}
