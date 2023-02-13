package controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.modelCalculator;

@RestController
public class calculatorController {

	modelCalculator c;

	// http://localhost:8080/sumar?n1=5&n2=10

	@PostConstruct
	public void init() {
		c = new modelCalculator();
	}

	@RequestMapping(value = "sumar", method = RequestMethod.GET)
	public double sumar(@RequestParam("n1") double n1, @RequestParam("n2") double n2) {
		return c.sumar(n1, n2);
	}

	@RequestMapping(value = "restar", method = RequestMethod.GET)
	public double restar(@RequestParam("n1") double n1, @RequestParam("n2") double n2) {
		return c.restar(n1, n2);
	}
	
	@RequestMapping(value = "multiplicar", method = RequestMethod.GET)
	public double multiplicar(@RequestParam("n1") double n1, @RequestParam("n2") double n2) {
		return c.multiplicar(n1, n2);
	}
	
	@RequestMapping(value = "dividir", method = RequestMethod.GET)
	public double dividir(@RequestParam("n1") double n1, @RequestParam("n2") double n2) {
		return c.dividir(n1, n2);
	}
	@RequestMapping(value = "exponente", method = RequestMethod.GET)
	public double expo(@RequestParam("n1") double n1, @RequestParam("n2") double n2) {
		return c.expo(n1, n2);
	}
	
}
