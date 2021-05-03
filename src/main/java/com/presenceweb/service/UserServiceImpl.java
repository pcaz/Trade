package com.presenceweb.service;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.presenceweb.model.Profile;
import com.presenceweb.model.Role;
import com.presenceweb.model.User;
import com.presenceweb.repository.ProfileRepository;
import com.presenceweb.repository.UserRepository;
import com.presenceweb.various.UserAffich;


@Service
public class UserServiceImpl implements UserService, ProfileService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private ProfileRepository profileRepository;
	
	public List<UserAffich> findAll() {
	
	Iterable<User> users=userRepository.findAll();
    
	
	
	 
	List<User> userList = StreamSupport
  		  .stream(users.spliterator(), false)
  		  .collect(Collectors.toList());
 
	List<UserAffich> ret=new ArrayList<UserAffich>();
	
	
	

    for(int i=0; i<userList.size();i++) {
    	User uu=userList.get(i);
    	UserAffich rr=new UserAffich();
    	
    	rr.setUserName(uu.getUsername());
    	
    	Long id=uu.getProfile();
    	//Long id=Repository.getProfile(idi);
    	if(id != null) {
    	Optional<Profile> p=profileRepository.findById(id);

    	if(p.isPresent()) {
    		rr.setFirstName(p.get().getFirst_name());
    		rr.setLastName(p.get().getLast_name());
    	}
    	}	
     Set<Role> roles=new HashSet<Role>();
     
     roles = uu.getRoles();
     StringBuilder sb=new StringBuilder();
    Iterator itr=roles.iterator();
    		while(itr.hasNext()) {
    			Role pr=(Role) itr.next();
    			sb.append(pr.getName());
    			sb.append(" ");
    		
        
    	}
    	rr.setRole(sb.toString());
    	ret.add(rr);
    	}
    
    	//Long identifiant = userList.get(i).getId();
    	//String username=userRepository.getUserNameById(identifiant);
    
      //	Long user= userRepository.getProfileByUserId(identifiant);
      //	Long user1=user;
//    	Profile profile= userRepository.getProfileByUsername(username);
    
/*  	
    	String firstName= profileRepository.getUserFirstName(identifiant);
    	String lastName= userRepository.getUserLastName(identifiant);
    }
*/
//return (List<User>) users; 
	
    return ret;
	}

	
	

}
