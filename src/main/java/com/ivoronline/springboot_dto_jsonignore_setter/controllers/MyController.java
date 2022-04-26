package com.ivoronline.springboot_dto_jsonignore_setter.controllers;

import com.ivoronline.springboot_dto_jsonignore_setter.DTO.PersonDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {

  //================================================================
  // ADD PERSON
  //================================================================
  @RequestMapping("AddPerson")
  String addPerson(@RequestBody PersonDTO personDTO) {
    return personDTO.propName + " is " + personDTO.propAge + " years old: " + personDTO.propComment;
  }

}
