package com.hotel.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.beans.Reservation;
import com.hotel.repositories.ReservationRespository;
import com.hotel.services.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	private ReservationRespository rr;
	
	@Override
	public List<Reservation> getAllRes() {
		// TODO Auto-generated method stub
		return rr.findAll();
	}

	@Override
	public Reservation findResById(int id) {
		// TODO Auto-generated method stub
		return rr.getOne(id);
	}

	@Override
	public Reservation addRes(Reservation res) {
		// TODO Auto-generated method stub
		return rr.save(res);
	}

	@Override
	public Reservation updateRes(Reservation res) {
		// TODO Auto-generated method stub
		return rr.save(res);
	}

	@Override
	public String deleteResById(int id) {
		rr.deleteById(id);
		return "Reservation id number " +id + " has been deleted";
	}

}
