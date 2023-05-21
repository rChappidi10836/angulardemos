package com.example.Sample.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.Sample.demo.entity.meds;
import com.example.Sample.demo.entity.users;
import com.example.Sample.demo.repository.MedsRepository;
import com.example.Sample.demo.repository.UsersRepository;

@RestController
@RequestMapping("")
@CrossOrigin
public class Displaydemo {
	
	@Autowired
	MedsRepository mr;
	
	@Autowired
	UsersRepository ur;
	
	@GetMapping("/display")
//	@ResponseBody
	public String dis() {
		return "success";
	}
	
	@GetMapping("/meds")
	public Iterable<meds> mediciens() {
		Iterable<meds> ms = mr.findAll();
		return ms;
	}
	
	
	@GetMapping("/users")
	public Iterable<users> user(){
		Iterable<users> us = ur.findAll();
		return us;
	}
	 
	@PostMapping("/registeruser")
	public void userpost(@RequestBody users u) {
		ur.save(u);
	}
	
	@GetMapping("/deletemed/{id}")
	public void deletemed(@PathVariable("id") int id) {
		mr.deleteById(id);
	}
	
	
	@PostMapping("/editmeds")
	public void editmed(@RequestBody meds m) {
		mr.save(m);
	}
	
	
	@PostMapping("/addmed")
	public void addmed(@RequestBody meds m) {
		mr.save(m);
	}
	
	@GetMapping("/changemedstatus/{id}")
	public void changestatus(@PathVariable("id") int id) {
		meds m= mr.findById(id).get();
		if(m.getAvail().equals("true")) {
			m.setAvail("false");
		}
		else {
			m.setAvail("true");
		}
		mr.save(m);
	}
	
}


