package com.ivoronline.springboot_dto_jsonignore_setter.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PersonDTO {

  //PROPERTIES
  public String  propName;
  public Integer propAge;
  public String  propComment;

  ////SETTERS
              private void setName   (String  reqName   ) { propName    = reqName + " Setter"; }
              private void setAge    (Integer reqAge    ) { propAge     = reqAge;              }
  @JsonIgnore private void setComment(String  reqComment) { propComment = reqComment;          }

}
