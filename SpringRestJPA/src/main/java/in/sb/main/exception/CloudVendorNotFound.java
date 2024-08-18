package in.sb.main.exception;

public class CloudVendorNotFound extends RuntimeException {

	public CloudVendorNotFound(String message) {
		super(message);
	}

	public CloudVendorNotFound(String message, Throwable cause) {
		super(message, cause);
	}
	

}
