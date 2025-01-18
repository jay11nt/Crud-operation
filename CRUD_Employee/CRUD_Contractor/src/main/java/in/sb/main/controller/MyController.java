package in.sb.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sb.main.entity.Contractor;
import in.sb.main.service.ContractorService;


@RestController
public class MyController 
{
	@Autowired
	private ContractorService contractorService;
	
	@PostMapping("/contractor")
	public Contractor saveContractor (@RequestBody Contractor contractor)
	{
		return contractorService.saveContractor(contractor);
	}
	
	@GetMapping("/contractor/{id}")
	public Contractor getContractorById(@PathVariable("id") Integer id )
	{
		return contractorService.getContractorById(id);
	}
	
	@GetMapping("/contractors")
	public List<Contractor> getAllContractors()
	{
		return contractorService.fetchAllContractors();
	}
	
	@PutMapping("/contractor/{id}")
	public Contractor updateContractorById(@PathVariable Integer id, @RequestBody Contractor contractor) 
	{		
		return contractorService.updateContractorById(id,contractor);
	}
	
	@DeleteMapping("/contractor/{id}")
	public Contractor deleteContractorById(@PathVariable("id") Integer id)
	{
		return contractorService.deleteContractorById(id);
	}
}
