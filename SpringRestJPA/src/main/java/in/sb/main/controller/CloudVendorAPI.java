package in.sb.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sb.main.model.CloudVendor;
import in.sb.main.service.CloudVendorService;

@RestController
@RequestMapping("/cloudVendor")
public class CloudVendorAPI 
{
	//Controller is talking with service layer
	//and service referring to repo layer
	CloudVendorService cloudvendorService;
	
	public CloudVendorAPI(CloudVendorService cloudvendorService) {
		this.cloudvendorService = cloudvendorService;
	}
	
	//Read Specific CLoud vendor Details
	@GetMapping("{vendorId}")
	public CloudVendor getCLoudVEndorDetails(@PathVariable("vendorId") String vendorId) {
		
		return cloudvendorService.getCloudVendor(vendorId);
//		return new CloudVendor("C1", "Villi",
//				"Karnataka", "735473746");
	}
	
	//Read all information in cloud Vendor
	@GetMapping()
	public List<CloudVendor> getAllCLoudVEndorDetails() {
		
		return cloudvendorService.getAllCloudVendors();
	}
	@PostMapping
	public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
		cloudvendorService.createCloudVendor(cloudVendor);
		return "Cloud Vendor Created";
	}
	@PutMapping
	public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
		cloudvendorService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor Updated";
	}
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendor(@PathVariable("vendorId")String vendorId) {
		cloudvendorService.deleteCloudVendor(vendorId);
		return "Cloud Vendor deleted";
	}
	

}
