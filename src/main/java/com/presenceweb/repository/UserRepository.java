package com.presenceweb.repository;

import com.presenceweb.model.Profile;
import com.presenceweb.model.User;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
	
	@Query("SELECT u FROM User u WHERE u.username = :username")
	public User getUserByUsername(@Param("username") String username);
	
	//@Query("Select profiles_id FROM User u WHERE u.id= :id")
	//public Long getProfile(@Param("id") long id);
	
				
}
	


