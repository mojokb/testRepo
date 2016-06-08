package btest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import btest.domain.Name;
import btest.repository.NameRepsoitory;

@RestController
public class HomeController {
	
	@Autowired
	private NameRepsoitory repo;
	
	@RequestMapping("/")
	List<Name> home(){

		//update
		Name param = new Name(1L, "mojokb"+Double.toString(Math.random()).substring(0, 3), 38);
		param = repo.save(param);
		System.out.println(param);
		
		//update
		Name param0 = new Name(100L, "mojokb"+Double.toString(Math.random()).substring(0, 3), 38);
		param0 = repo.save(param0);
		System.out.println(param0);
				
		//create
		Name param2 = new Name("mojokb"+Double.toString(Math.random()).substring(0, 3), 38);
		
		Name param3 = new Name();
		param3.setName("mojokb");
		param3.setAge(38);
		
		
		param2 = repo.save(param2);		
		System.out.println(param2);
		
		Name param4 = new Name();
		param4.setName("mojokb");
		param4.setId(1L);
		
		repo.delete(param4);
		
		System.out.println("delete cnt : " +repo.removeByName("mojokb"));
		
		List<Name> name = (List<Name>) repo.findAll();
		
		return name;
	}
}
