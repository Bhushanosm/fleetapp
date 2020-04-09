package com.bhushan.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhushan.fleetapp.models.Country;
import com.bhushan.fleetapp.services.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService service;
	
	@GetMapping("/countries")
	public String getCountries(Model model) {
		
		List<Country> countryList = service.getCountries();
		
		model.addAttribute("countries", countryList);
		
		return "country";
	}
	
	@PostMapping("/countries/addNew")
	public String addNew(Country country) {
		service.save(country);
		
		return "redirect:/countries";
	}
	
	@GetMapping("/countries/findById")
	@ResponseBody
	public Optional<Country> findById(int id) {
		return service.findById(id);
	}
	
	@RequestMapping(value="/countries/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Country country) {
		service.save(country);
		return "redirect:/countries";
	}
	
	@RequestMapping(value="/countries/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		service.delete(id);
		return "redirect:/countries";
	}
}
