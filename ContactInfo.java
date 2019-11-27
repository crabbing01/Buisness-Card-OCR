public class ContactInfo {
	
	public String name;
	public String number;
	public String email;

	public String getName() {
		return "Name: " + name;
	}
	
	public String getPhoneNumber() {
		number = number.replaceAll("[^\\d]", "");
		String temp = "Phone: " + number;
		return temp;
	}
	
	public String getEmailAddress() {
		if(email.contains("Email")) {
			return email;
		} else {
			return "Email: " + email;
		}
	}
}
