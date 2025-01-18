package in.sb.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sb.main.entity.Contractor;
import in.sb.main.repo.Contractor_Repository;


@Service
public class ServiceImpl implements ContractorService
{
	@Autowired 
	private Contractor_Repository contractorRepository;

	@Override
	public Contractor saveContractor(Contractor contractor) 		//save
	{
		return contractorRepository.save(contractor);
	}

	@Override
	public List<Contractor> fetchAllContractors() {						//getall
		List<Contractor>allContractors=contractorRepository.findAll();
		return allContractors;
	}

	@Override
	public Contractor getContractorById(Integer id) {						//getbyId
		Optional<Contractor>contractor =contractorRepository.findById(id);

				if(contractor.isPresent())
				{
					return contractor.get();
				}
				return null;
	}

	@Override
	public Contractor updateContractorById(Integer id, Contractor contractor) 			//update
	{
		
		return null;
	}

	@Override
    public Contractor deleteContractorById(Integer id) 			//deleteById
	{
        if (contractorRepository.findById(id).isPresent()) 
        {
            contractorRepository.deleteById(id);
            return null;
        }
        return null;
    }

	
	
	
	
}
