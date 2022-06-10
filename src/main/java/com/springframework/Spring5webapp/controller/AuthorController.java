package com.springframework.Spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springframework.Spring5webapp.repo.AuthorRepository;

@Controller
public class AuthorController {

  private final AuthorRepository authorRepository ;

  

  public AuthorController(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }


  @RequestMapping("/authors")
  public String getAuthors(Model model){

    model.addAttribute("authors", authorRepository.findAll());
    return "AuthorsList";
  }
  
}
