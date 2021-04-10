package com.example.accessingdatamysql.Controllers;

import com.example.accessingdatamysql.AuthenticateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

//    @PostMapping("api/auth/login")
//    public ResponseEntity<?> login (@RequestBody AuthenticateRequest authenticateRequest) throws Exception
//    {
//        try{
//            authenticationManager.authenticate(
//                    new EmailP(authenticateRequest.getUsername(), authenticateRequest.getPassword()));
//        }catch (BadCren)
//
//    }
}
