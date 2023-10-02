package com.example.test.repo;

import com.example.test.model.UserAddrs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserAddRepo extends JpaRepository<UserAddrs,Integer> {
}
