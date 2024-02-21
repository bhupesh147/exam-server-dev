package com.exam.services.implematation;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.entity.User;
import com.exam.entity.UserRole;
import com.exam.repo.RoleRepository;
import com.exam.repo.UserRepository;
import com.exam.services.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepo;
	@Autowired
	private RoleRepository roleRepo;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		// TODO Auto-generated method stub
		
		User local = this.userrepo.findByUsername(user.getUsername());
		
		if(local != null) {
			System.out.println("User is already there !!");
			throw new Exception("User already Present !!");
		}else {
			
			for(UserRole ur:userRoles) {
				roleRepo.save(ur.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			local = this.userrepo.save(user);
			
		}
		return local;
	}

	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		return this.userrepo.findByUsername(username);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		this.userrepo.deleteById(userId);
	}
	
	

}
