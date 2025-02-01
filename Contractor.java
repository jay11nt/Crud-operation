package in.sb.main.entity;				//Entity->Repository->service->controller->service_implimentation->DONE

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CONTRACTORS")
public class Contractor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contractorId;
	private String name;
	private String experience;
	
	
	public Contractor() 
	{
		super();
		
	}
	public Contractor(int contractorId, String name, String experience) 
	{
		super();
		this.contractorId = contractorId;
		this.name = name;
		this.experience = experience;
	}
	public int getContractorId() {
		return contractorId;
	}
	public void setContractorId(int contractorId) {
		this.contractorId = contractorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
	@Override
	public String toString() {
		return "Contractor [contractorId=" + contractorId + ", name=" + name + ", experience=" + experience + "]";
	}
	
	
}
