package com.example.demo.user.repository;


import com.example.demo.user.model.UserModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends ReactiveMongoRepository<UserModel, String> {
    Flux<UserModel> findByLastName(String lastName);

    Mono<UserModel> findByEmail(String email);
}
