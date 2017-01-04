package com.terren.dao;

import com.terren.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hasee on 2017/1/1.
 */
@Repository
public interface IUserDao  {
   public List<User> getAllUser();

}
