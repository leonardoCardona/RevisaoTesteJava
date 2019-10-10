package br.com.drummond;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController


public class soma {
	
@RequestMapping(value = "/soma/{n1}/{n2}", method = RequestMethod.GET)
public String somar (@PathVariable Integer n1, @PathVariable Integer n2) {
	
	Integer resultado;
	resultado = n1 + n2;

	return "O resultado da sua soma é: " + resultado;
	
}


}