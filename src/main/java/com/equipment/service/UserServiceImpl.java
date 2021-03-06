package com.equipment.service;

import com.equipment.mapper.UserMapper;
import com.equipment.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userDao;
    public List<User> list(User user) {
        return userDao.getUsers(user);
    }
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }
    public void  deleteUser(String u_id) {
         this.userDao.deleteUser(u_id);
    }
    @Override
    @Transactional
    public int updateUser(User user) {
        return this.userDao.updateUser(user);
    }
    @Override
    @Transactional
    public List<User> oneUser(String u_id,String u_sex) {
        return this.userDao.oneUser(u_id,u_sex);
    }

    @Override
    public void deleteMany(String[] id_arr) {
        this.userDao.deleteMany(id_arr);
    }
}
