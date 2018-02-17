package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long>{

}
