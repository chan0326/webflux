package com.example.demo.user.repository;


import com.example.demo.user.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository  {

    Optional<UserModel> findByUsername(String username);


}
