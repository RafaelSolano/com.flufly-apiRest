package com.flufly.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holaMundo {

  @GetMapping("/saludo")
  public String saludo (){
    return "Hola Mundo";
  }
}
