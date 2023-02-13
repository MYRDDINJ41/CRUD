package controlador;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import modelo.courses;

@RestController
public class courseController {
	
	courses c;
	
	@PostConstruct
	public void init() {
		c = new courses();
	}
	
	@GetMapping(
			value = "courses",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<courses> getCourses(){
		return c.listCourses();
	}
	
	@PostMapping(
			value = "course",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<courses> postCourse(@RequestBody courses c){
		return c.addCourses(c);
	}
	
	@DeleteMapping(
			value = "course/{name}")
	public List<courses> deleteCourse(@PathVariable("name") String name){
		return c.deleteCourse(name);
	}
	
	@PutMapping(
			value = "course/{name}",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<courses> putCourse(@RequestBody courses c, @PathVariable String name){
		return c.putCourse(c, name);
	}
	
}





// 
