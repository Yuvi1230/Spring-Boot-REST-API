package in.sb.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sb.main.model.CloudVendor;

//the jpa repo retrives and saves data in mysql
public interface CloudVendorRepo extends JpaRepository<CloudVendor, String> {

}
