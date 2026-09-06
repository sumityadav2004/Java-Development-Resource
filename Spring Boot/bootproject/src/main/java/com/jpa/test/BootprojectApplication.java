	package com.jpa.test;
	
	import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.dao.userrepo;
import com.jpa.test.entities.user;
	
	@SpringBootApplication
	public class BootprojectApplication {

		public static void main(String[] args) { 
			ConfigurableApplicationContext context = SpringApplication.run(BootprojectApplication.class, args);
			
			
			    userrepo userrepository=context.getBean(userrepo.class);
			  //  user user1=new user();
			   //  user1.setName("Lokesh");
			   //  user1.setCity("Palwal");
			   //  user1.setStatus("Java Developer");
			      
			   //  user user2 = new user();
			   //  user2.setName("Danish");
			   //  user2.setCity("Mathura");
			   //  user2.setStatus("BussinesMan");
			      
			   //  List<user> userss=List.of(user1,user2);
			   //  userrepository.saveAll(userss);
			     
			     
			    // userrepository.save(user1);
			     // System.out.println("saved" + user1);
			
			//	Optional<user> optional = userrepository.findById(102);
			
			//	user user = optional.get();
			//	System.out.println(user);
				
		    //		user.setName("Lucky");
				
			//	user result = userrepository.save(user);
				
			//	System.out.println(result);
			    
			   //  for use the forall method
			    
			  //  Iterable<user> itr = userrepository.findAll();
			  //  itr.forEach(user->{System.out.println(user);});
			    
			    
			    // deleting operation
	
	            //userrepository.deleteById(1);
			    //System.out.println("delete");
			    
			    // by implementing the custom querry 
			    
			    List<user> result = userrepository.findByNameAndCity("sumit yadav", "faridabad");
			    result.forEach(e->{System.out.println(e);});
			    
			    System.out.println("__________________________________");
			    
			    List<user> users = userrepository.getUsers();
			    users.forEach(e->{System.out.println(e);});
			    
			    System.out.println("__________________________________________");
			    
			    
			    
			    List<user> result1 = userrepository.findByNameAndCity("Sumit yadav", "faridabad");
			     
			    result1.forEach(e->{System.out.println(e);});
			    
			    
			    System.out.println("_______________________________________");
			    
			    List<user> getuser = userrepository.getuser();
			    getuser.forEach(e->{System.out.println(e);});
			    
			    
		}
	
	}
