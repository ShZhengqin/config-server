package com.jv.example.configserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shzhengqin on 2018/5/31
 */
@RestController
public class HomeController {

    @GetMapping(value = "/home")
    public String home() {
        return "Home!";
    }

}
