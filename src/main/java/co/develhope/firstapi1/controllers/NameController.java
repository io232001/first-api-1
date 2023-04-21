package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NameController
{
    private String name ="ionut";

    @GetMapping("/getname")
    public String getName()
    {
        return name;
    }

    @PostMapping("/reversename")
    public String reverseUserName(){
        return new StringBuilder(name).reverse().toString();
    }
}