package com.hfutse.repository;

import com.hfutse.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * The interface User repository.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>{

    @Modifying
    @Transactional//说明该方法是事务性操作
    @Query("update UserEntity us set us.nickname=:qNickName,us.firstName=:qFirstName,us.lastName=:qLastName,us.password=:qPassword where us.id=:qId")
    public void updateUser(@Param("qNickName") String nickName,@Param("qFirstName") String firstName,@Param("qLastName") String qLastName, @Param("qPassword") String password, @Param("qId") Integer id);



}
