package com.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.beans.Reservation;

@Repository
public interface ReservationRespository extends JpaRepository<Reservation, Integer>{

}
