package com.example.demo5.controller;

import com.example.demo5.domain.UserDTO;
import com.example.demo5.service.HomeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Slf4j
@Controller
@RequiredArgsConstructor //  생성자 생성시 필요한 요소를 lombok이 찾아서 자동으로 가져온다
public class HomeController {

  final private HomeService homeService;

//  public HomeController(HomeService homeService) {
//    this.homeService = homeService;
//  }

  @GetMapping("/")
  public String indexGet() {
    return "index";
  }

  @GetMapping("/user/userInput")
  public String userInputGet() {
    return "user/userInput";
  }

  @GetMapping("/userList")
  public String userListGet(Model model) {
    ArrayList<UserDTO> vos = (ArrayList<UserDTO>) homeService.getUserList();
    model.addAttribute("vos", vos);
    //log.trace("trace : ");
//    for (UserDTO userDTO : vos) {
//      System.out.println(userDTO+"\n");
//    }

    return "user/userList";
  }
  @GetMapping("/userDelete")
  public String userDeleteGet(Model model) {

    return "user/userList";
  }




}
