package in.sb.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CloudVendor_info")
public class CloudVendor {
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNo;
	
	
	public CloudVendor() {
		
	}
	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNo) {
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNo = vendorPhoneNo;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorPhoneNo() {
		return vendorPhoneNo;
	}
	public void setVendorPhoneNo(String vendorPhoneNo) {
		this.vendorPhoneNo = vendorPhoneNo;
	}
	
	

}
