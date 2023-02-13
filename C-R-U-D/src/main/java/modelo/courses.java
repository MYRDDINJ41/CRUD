package modelo;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class courses {
	
	private String courseName;
	private int cost;
	private int studenstsNum;
	ArrayList<courses> listCourses = new ArrayList<>();
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getStudenstsNum() {
		return studenstsNum;
	}
	public void setStudenstsNum(int studenstsNum) {
		this.studenstsNum = studenstsNum;
	}
	public courses(String courseName, int cost, int studenstsNum) {
		super();
		this.courseName = courseName;
		this.cost = cost;
		this.studenstsNum = studenstsNum;
	}
	public courses() {
	}
	
	public ArrayList<courses> listCourses(){
		listCourses.add(new courses("Java", 20, 30));
		listCourses.add(new courses("JavaScript", 20, 30));
		listCourses.add(new courses("Python", 20, 30));
		listCourses.add(new courses("SQL", 20, 30));
		return this.listCourses;
	}
	
	public ArrayList<courses> addCourses(courses c){

		ArrayList<courses> course = listCourses();
		course = this.listCourses();
		course.add(c);
		return course;
		
	}
	public ArrayList<courses> deleteCourse(String name){
		
		ArrayList<courses> courses = listCourses();
		courses = this.listCourses();
		courses.removeIf(c->c.getCourseName().equals(name));
		this.listCourses = courses;
		
		return this.listCourses;
	}
	
	public ArrayList<courses> putCourse(courses c, String name){
		ArrayList<courses> courses = listCourses();
		courses = this.listCourses();
		courses cursos = null;
		int pos = 0;
		int aux = 0;
		
		for (courses courses2 : courses) {
			if (courses2.getCourseName().equals(name)) {
				cursos = courses2;
				aux = pos;
			}
			pos++;
		}
		
		cursos.setCost(c.getCost());
		cursos.setStudenstsNum(c.getStudenstsNum());
		
		courses.remove(aux);
		courses.add(aux, cursos);
		
		this.listCourses = courses;
		return this.listCourses;
	}
	
	
}
