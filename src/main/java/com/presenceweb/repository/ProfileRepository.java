package com.presenceweb.repository;

import com.presenceweb.model.Profile;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ProfileRepository extends CrudRepository<Profile,Long> {
	
	
}
