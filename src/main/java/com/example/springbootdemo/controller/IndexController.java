package com.example.springbootdemo.controller;
import com.example.springbootdemo.bean.User;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping(value = "/index")
public class IndexController {
    @Value(value = "${roncoo.secret}")
    private String secret;
    @Value(value = "${roncoo.number}")
    private int number;
    @Value(value = "${roncoo.desc}")
    private String desc;

    @RequestMapping
    public String index(){
        return "hello world !";
    }

    @RequestMapping(value = "/get")
    public Map<String, Object> get(@RequestParam String name){
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", name);
        map.put("value", "hello world");
        map.put("secret", secret);
        map.put("number", number);
        map.put("desc", desc);
        return map;
    }

    @RequestMapping(value = "/find/{id}/{name}")
    public User get(@PathVariable int id, @PathVariable String name){
        User u = new User();
        u.setId(id);
        u.setName(name);
        u.setDate(new Date());
        return u;
    }
}
