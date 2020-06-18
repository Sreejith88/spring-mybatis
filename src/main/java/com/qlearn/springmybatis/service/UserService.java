package com.qlearn.springmybatis.service;

import com.qlearn.springmybatis.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserService {

    /**
     * <p>
     * Method to get all user details.
     * </p>
     *
     * @return list of {@link com.qlearn.springmybatis.model.User} instance
     */
    List<User> findAll();

    /**
     * <p>
     *     Method to add user details.
     * </p>
     * @param name the name of the user
     * @param salary the user salry
     */
    void addUser(String name, String salary);

    /**
     * <p>
     *     Method to update the salary.
     * </p>
     * @param id the user id
     * @param salary the new salary
     */
    void updateUser(Integer id, String salary);

    /**
     * <p>
     *     Method to delete the user details
     * </p>
     * @param id the user id.
     */
    void deleteUser(Integer id);
}
