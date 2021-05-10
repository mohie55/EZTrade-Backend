package com.greenwich.eztrade.Repository;

import com.greenwich.eztrade.DTOs.SellerDetailsDTO;
import com.greenwich.eztrade.Models.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query("SELECT * FROM user_table WHERE email = :email AND password = :password")
    User checkUserCredentials(@Param("email") String email, @Param("password") String password);

    @Query("select first_name,email,reviews from user_table where id = :userId")
    SellerDetailsDTO getSellerDetails(int userId);
}
