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

import com.bhushan.fleetapp.models.Invoice;
import com.bhushan.fleetapp.services.ClientService;
import com.bhushan.fleetapp.services.InvoiceService;
import com.bhushan.fleetapp.services.InvoiceStatusService;

@Controller
public class InvoiceController {
	
	@Autowired	private InvoiceService invoiceService;
	@Autowired	private ClientService clientService;
	@Autowired	private InvoiceStatusService invoiceStatusService;
	
	@GetMapping("/invoices")
	public String getInvoices(Model model) {
		
		model.addAttribute("invoiceList", invoiceService.getInvoices());
		model.addAttribute("clientList", clientService.getClients());
		model.addAttribute("invoiceStatusList", invoiceStatusService.getInvoiceStatuss());
		
		return "invoice";
	}
	
	@PostMapping("/invoices/addNew")
	public String addNew(Invoice invoice) {
		invoiceService.save(invoice);
		
		return "redirect:/invoices";
	}
	
	@GetMapping("/invoices/findById")
	@ResponseBody
	public Optional<Invoice> findById(int id) {
		return invoiceService.findById(id);
	}
	
	@RequestMapping(value="/invoices/update", method= {RequestMethod.PUT, RequestMethod.GET})
	public String update(Invoice invoice) {
		invoiceService.save(invoice);
		return "redirect:/invoices";
	}
	
	@RequestMapping(value="/invoices/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		invoiceService.delete(id);
		return "redirect:/invoices";
	}
}
