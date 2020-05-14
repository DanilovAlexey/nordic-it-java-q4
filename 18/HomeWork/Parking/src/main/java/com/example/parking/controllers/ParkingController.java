package com.example.parking.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.parking.model.Parking;

@RestController
@RequestMapping("/parking")
class ParkingController {

	@Autowired
	Parking parking;

	@GetMapping(path = "/free")
	public ResponseEntity<Object> getFree() {

		var response = new HashMap<String, Object>();
		response.put("data", parking.getFreePlaces());
		response.put("message", parking.getFreePlaces().isEmpty() ? "No free places" : "Free places");

		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}

	@PostMapping("/park")
	public ResponseEntity<Object> setReserved() {
		var response = new HashMap<String, Object>();

		if (parking.getFreePlaces().isEmpty()) {
			response.put("message", "No free place");
		} else {
			response.put("data", parking.setPlaceReserved());
			response.put("message", "Your place number");
		}

		return new ResponseEntity<Object>(response, HttpStatus.OK);
	};

	@PostMapping("/unpark")
	public ResponseEntity<Object> setFree(@RequestParam(name = "id", required = true) Integer id) {
		var response = new HashMap<String, Object>();

		response.put("message", parking.setPlaceFree(id) ? "This place was freed" : "No such place");

		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}

}
