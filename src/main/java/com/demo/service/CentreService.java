package com.demo.service;

import java.util.List;

import com.demo.model.Centre;

public interface CentreService {

	 public List<Centre> getAllCentres();
	 
	 public Centre findCentreById(int id);
	 
	 public Centre addCentre(Centre centre);
	 
	 public Centre updateCentre(Centre centre);
	 
	 public Centre deleteCentre(int id);
}
