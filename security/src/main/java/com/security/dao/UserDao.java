package com.security.dao;

import com.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    @Query("select u from User u where u.userName = :userName")
    User findByUserName(@Param("userName") String userName);
}
