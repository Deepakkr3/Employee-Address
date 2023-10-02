package com.example.test.repo;

import com.example.test.model.UserModel;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepo extends JpaRepository<UserModel,Integer> {
}
