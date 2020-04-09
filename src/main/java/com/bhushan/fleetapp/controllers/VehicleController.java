package com.bhushan.fleetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhushan.fleetapp.models.Vehicle;
import com.bhushan.fleetapp.services.EmployeeService;
import com.bhushan.fleetapp.services.LocationService;
import com.bhushan.fleetapp.services.VehicleMakeService;
import com.bhushan.fleetapp.services.VehicleModelService;
import com.bhushan.fleetapp.services.VehicleService;
import com.bhushan.fleetapp.services.VehicleStatusService;
import com.bhushan.fleetapp.services.VehicleTypeService;

@Controller
public class VehicleController {
	
	//Vehicles
	@Autowired	private VehicleService vehicleService;
	
	//Locations
	@Autowired	private LocationService locationService;
	
	//Employee
	@Autowired	private EmployeeService employeeService;
	
	//Vehicle Make
	@Autowired	private VehicleMakeService vehicleMakeService;
	
	//Vehicle Status
	@Autowired	private VehicleStatusService vehicleStatusService;
	
	//Vehicle Type
	@Autowired	private VehicleTypeService vehicleTypeService;
	
	//Vehicle Model
	@Autowired	private VehicleModelService vehicleModelService;
	
	@GetMapping("/vehicles")
	public String getVehicles(Model model) {
		
		model.addAttribute("vehicleList", vehicleService.getVehicles());
		model.addAttribute("locationList", locationService.getLocations());
		model.addAttribute("employeeList", employeeService.getEmployees());
		model.addAttribute("vehicleMakeList", vehicleMakeService.getVehicleMakes());
		model.addAttribute("vehicleStatusList", vehicleStatusService.getVehicleStatuss());
		model.addAttribute("vehicleTypeList", vehicleTypeService.getVehicleTypes());
		model.addAttribute("vehicleModelList", vehicleModelService.getVehicleModels());
		
		return "vehicle";
	}
	
	@PostMapping("/vehicles/addNew")
	public String addNew(Vehicle vehicle) {
		vehicleService.save(vehicle);
		
		return "redirect:/vehicles";
	}
	
	@GetMapping("/vehicles/findById")
	@ResponseBody
	public Optional<Vehicle> findById(int id) {
		return vehicleService.findById(id);
	}
	
	@RequestMapping(value="/vehicles/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Vehicle vehicle) {
		vehicleService.save(vehicle);
		return "redirect:/vehicles";
	}
	
	@RequestMapping(value="/vehicles/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		vehicleService.delete(id);
		return "redirect:/vehicles";
	}
}
