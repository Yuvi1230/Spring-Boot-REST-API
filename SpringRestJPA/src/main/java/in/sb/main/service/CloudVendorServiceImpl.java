package in.sb.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.sb.main.exception.CloudVendorNotFound;
import in.sb.main.model.CloudVendor;
import in.sb.main.repo.CloudVendorRepo;


//all methods are implemented here
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	//This repository layer actually talks to database
	CloudVendorRepo cloudVendorRepo;
	//this repo layer will interact with servce layer
	public CloudVendorServiceImpl(CloudVendorRepo cloudVendorRepo) {
		this.cloudVendorRepo = cloudVendorRepo;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		//Now it will actually create data in the database with the help of repo
		//to save in the database
		cloudVendorRepo.save(cloudVendor);
		return "Success";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepo.save(cloudVendor);
		return "Updated Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepo.deleteById(cloudVendorId);
		return "Deleted Sucessfully";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		if(cloudVendorRepo.findById(cloudVendorId).isEmpty()) {
			throw new CloudVendorNotFound("Requested cloud vendor dont exist");
		}
		return cloudVendorRepo.findById(cloudVendorId).get();
		
	}

	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepo.findAll();
	}

}
