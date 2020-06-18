package com.qlearn.springmybatis.service;

import com.qlearn.springmybatis.mapper.UserMapper;
import com.qlearn.springmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     *  {@inheritDoc}
     */
    @Override
    public List<User> findAll() {
        return this.userMapper.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void addUser(final String name, final String salary) {
        this.userMapper.addUser(name, salary);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateUser(final Integer id, final String salary) {
        this.userMapper.updateUser(id, salary);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteUser(Integer id) {
        this.userMapper.deleteUser(id);
    }
}
