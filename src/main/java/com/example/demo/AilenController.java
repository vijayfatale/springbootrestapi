package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AilenController {
	
	
	@RequestMapping("/ailens")
	public List<Ailens> getAilens(){
	
		
		
		List<Ailens> listOfAilens= new ArrayList<Ailens>();
		
		Ailens a1=new Ailens();
		a1.setId(20);
		a1.setName("vijay");
		
		Ailens a2=new Ailens();
		a2.setId(30);
		a2.setName("nijay");
		
		listOfAilens.add(a1);
		listOfAilens.add(a2);
		
		return listOfAilens;
		
		
		
	}

}
