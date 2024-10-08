package com.project.movies.repository;
import java.util.Optional;
import com.project.movies.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

    Optional<User> findByUserid(String userid);

    Optional<User> findById(Long userId);

}
