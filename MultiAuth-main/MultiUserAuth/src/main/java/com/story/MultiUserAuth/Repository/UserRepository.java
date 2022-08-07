package com.story.MultiUserAuth.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.story.MultiUserAuth.Model.User;

public interface UserRepository extends JpaRepository<User, java.lang.String> {

	Optional<User> findById(String username);

	User save(User user);
}
