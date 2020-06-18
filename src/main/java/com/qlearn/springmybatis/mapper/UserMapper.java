package com.qlearn.springmybatis.mapper;

import com.qlearn.springmybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USERS")
    List<User> findAll();

    @Insert("INSERT INTO USERS(name, salary) VALUES(#{name},#{salary})")
    void addUser(String name, String salary);

    @Update("UPDATE USERS SET salary=#{salary} WHERE id=#{id}")
    void updateUser(final Integer id, final String salary);

    @Delete("DELETE FROM USERS WHERE id =#{id}")
    void deleteUser(final Integer id);
}
