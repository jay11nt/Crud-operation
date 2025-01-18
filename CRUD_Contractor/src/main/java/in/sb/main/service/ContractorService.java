package in.sb.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.sb.main.entity.Contractor;


public interface ContractorService 
{
	Contractor saveContractor(Contractor contractor);   //@postmapping
	
	List<Contractor> fetchAllContractors();		//@getmapping all
	
	Contractor getContractorById(Integer id);	//@getmapping ById
	
	Contractor updateContractorById(Integer id, Contractor contractor);	//@putmapping
	
	Contractor deleteContractorById(Integer id);	//@deletemapping
}
