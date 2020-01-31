package com.siana.docker.dockerspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/dockerapp")
@RestController
public class DockerController {


    @GetMapping
    public String helloworld(){
        return "Hello Docker!!!!";
    }

}
