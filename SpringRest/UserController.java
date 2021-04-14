package org.padmini.springrest.user;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController 
{

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/user")
	public List<User> getAllUsers()
	{
		return userRepo.findAll();	
	}
	
	@GetMapping("/user/{userId}")
	public User getUserById(@PathVariable Integer userId)
	{
		return userRepo.findById(userId).get();
	}
	
	@PostMapping("/user")
	public void addUser(@RequestBody User user)
	{
		userRepo.save(user);
	}
	
	@PutMapping("/user")
	public void updateUser(@RequestBody User user)
	{
		userRepo.save(user);
	}
	
	@DeleteMapping("/user/{userId}")
	public void deleteUserById(@PathVariable Integer userId)
	{
		userRepo.deleteById(userId);
	}
	

}
