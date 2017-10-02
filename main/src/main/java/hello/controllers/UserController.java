package hello.controllers;

import hello.models.response_model.UserResponseModel;
import hello.utils.RandomizerUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.*;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.POST, path = "/user")
    public ResponseEntity<String> createUser(@RequestParam(value = "login") String login, @RequestParam(value = "password") String password) {
        String token = RandomizerUtil.generateToken();

        return new ResponseEntity<>("ok", HttpStatus.OK);
    }


}
