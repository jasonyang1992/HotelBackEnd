package com.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.beans.Reservation;
import com.hotel.services.ReservationService;

@RestController
@RequestMapping
@CrossOrigin
public class ReservationController {

	@Autowired
	private ReservationService rs;
	
	@GetMapping
	public List<Reservation> getAllRes(){
		return rs.getAllRes();
	}
	
	@GetMapping("/{id}")
	public Reservation getResById(@PathVariable("id") int id) {
		return rs.findResById(id);
	}
	
	@PostMapping
	public ResponseEntity<Reservation> createRes(@RequestBody Reservation res){
		return new ResponseEntity<>(rs.addRes(res), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public Reservation updateRes(@RequestBody Reservation res) {
		return rs.updateRes(res);
	}
	
	@DeleteMapping("/{id}")
	public String deleteRes(@PathVariable("id") int id) {
		return rs.deleteResById(id);
	}
}
