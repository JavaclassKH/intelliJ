package com.example.demo5.service;

import com.example.demo5.dao.HomeDAO;
import com.example.demo5.domain.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeService {

  final private HomeDAO homeDAO;

  public List<UserDTO> getUserList() {
    return homeDAO.getUserList();
  }

}
