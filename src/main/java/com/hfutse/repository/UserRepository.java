package com.hfutse.repository;

import com.hfutse.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface User repository.
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer>{

}
