package controller;

import com.example.toDolist.UserService;

import javassist.NotFoundException;
import models.User;

import com.example.toDolist.UserRepository;
import java.util.List;
import java.util.NoSuchElementException;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
	UserService userService;
	
	@GetMapping("")
	public List <User> list(){
		return userService.listAllUser();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity <User> get(@PathVariable Integer id) throws EntityNotFoundException{
		User user = userService.getUser(id);
		return new ResponseEntity<User>(user,HttpStatus.OK);
		
	}
	
	@PostMapping("/")
	public void add(@RequestBody User user) {
		userService.saveUser(user);
	}
	@PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody User user, 
    		@PathVariable Integer id) {
        try {
            User existUser = userService.getUser(id);
            user.setId(id);            
            userService.saveUser(user);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {

        userService.deleteUser(id);
    }
}
	
	
	
	

