package com.greenwich.eztrade.Repository;

import com.greenwich.eztrade.Models.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT * FROM user_t WHERE email = :email AND pass = :password")
    User checkUserCredentials(String email, String password);


}
