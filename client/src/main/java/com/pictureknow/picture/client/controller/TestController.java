package com.pictureknow.picture.client.controller;

import com.pictureknow.picture.api.EchoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource
    private EchoService echoService;

    @GetMapping("/test")
    public String test(@RequestParam String name) {
        return echoService.echo(name);
    }

}