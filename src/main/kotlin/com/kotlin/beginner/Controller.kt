package com.kotlin.beginner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping
import com.kotlin.beginner.UsersRepos;
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.CrossOrigin

@RestController
@RequestMapping("/users")
@CrossOrigin(origins=["http://localhost:3000"])
class Controller(val userRepos:UsersRepos) 
{
	
	
	@DeleteMapping("/{id}")
	@CrossOrigin(origins=["http://localhost:3000"])
	fun deleteEmployee(@PathVariable id:Long)
	{
		userRepos.deleteById(id);
	}
	@PutMapping
	@CrossOrigin(origins=["http://localhost:3000"])
	fun updateUser(@RequestBody user: Users)
	{
		userRepos.save(user)
	}
	
	@PostMapping
	@CrossOrigin(origins=["http://localhost:3000"])
	fun saveUser(@RequestBody user: Users): Users
	{
		return userRepos.save(user)
	}
	
	@GetMapping("/{id}")
	@CrossOrigin(origins=["http://localhost:3000"])
	fun getUser(@PathVariable id: Long):Users
	{
		return userRepos.findById(id).orElse(null);
		
	}
	@GetMapping("/getAll")
	@CrossOrigin(origins=["http://localhost:3000"])
	fun getAllEmployees(): Iterable<Users>
	{
		return userRepos.findAll();
	}
}



