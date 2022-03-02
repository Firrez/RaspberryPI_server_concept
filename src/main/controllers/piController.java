package main.controllers;

import main.services.piService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class piController
{
  @Resource piService service;

  @GetMapping(value = "/hw")
  public String helloWorld()
  {
    return "Hello World!";
  }

  @GetMapping(value = "/input")
  public String input()
  {
    return service.getInput();
  }
}
