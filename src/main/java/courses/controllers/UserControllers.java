package courses.controllers;

import courses.entity.User;
import courses.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user/" )
public class UserControllers {

    @Autowired
     private UserService userService;
    @RequestMapping(value = "user/", method = RequestMethod.POST)
    public ResponseEntity<?> appendUser(@RequestBody User user){
       return new ResponseEntity(user, HttpStatus.OK);
    }

    @RequestMapping(value = "allusers/",method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers(){

        List<User> list = userService.findAllUsers();

        return new ResponseEntity<>(list,HttpStatus.OK);


    }
}
