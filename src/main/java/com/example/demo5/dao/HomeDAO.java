package com.example.demo5.dao;

import com.example.demo5.domain.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HomeDAO {

  @Select("select * from user order by idx desc")
  public List<UserDTO> getUserList();

}
