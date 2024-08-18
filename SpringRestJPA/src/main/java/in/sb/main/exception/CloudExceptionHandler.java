package in.sb.main.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//advises responsible to handle exceptions rather multiple exceptions through out this project
@ControllerAdvice
public class CloudExceptionHandler {
	
	@ExceptionHandler(value = {CloudVendorNotFound.class})
	public ResponseEntity<Object> handleCloudVendor(CloudVendorNotFound cloudvendernotfound)
	{
		CloudVendorException cloudvenderException=new CloudVendorException(
				cloudvendernotfound.getMessage(), 
				cloudvendernotfound.getCause(),
				HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(cloudvenderException,HttpStatus.NOT_FOUND);
	}
}
