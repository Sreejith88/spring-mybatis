package com.qlearn.springmybatis.mapper;

import com.qlearn.springmybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * <p>
     *     Select All user details.
     * </p>
     * @return list of User
     */
    @Select("SELECT * FROM USERS")
    List<User> findAll();

    /**
     * <p>
     *     Insert the user details.
     * </p>
     * @param name the user name
     * @param salary the user salary.
     */
    @Insert("INSERT INTO USERS(name, salary) VALUES(#{name},#{salary})")
    void addUser(String name, String salary);

    /**
     * <p>
     *     Update the user details.
     * </p>
     * @param id the user id.
     * @param salary the user new salary.
     */
    @Update("UPDATE USERS SET salary=#{salary} WHERE id=#{id}")
    void updateUser(final Integer id, final String salary);

    /**
     * <p>
     *     Delete the user details.
     * </p>
     * @param id the user id to be deleted.
     */
    @Delete("DELETE FROM USERS WHERE id =#{id}")
    void deleteUser(final Integer id);
}
