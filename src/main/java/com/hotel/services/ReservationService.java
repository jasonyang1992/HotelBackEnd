package com.hotel.services;

import java.util.List;

import com.hotel.beans.Reservation;

public interface ReservationService {

	public List<Reservation> getAllRes();
	public Reservation findResById(int id);
	public Reservation addRes(Reservation res);
	public Reservation updateRes(Reservation res);
	public String deleteResById(int id);
}
