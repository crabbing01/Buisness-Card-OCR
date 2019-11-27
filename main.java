
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String doc = "Arthur Wilson\r\n" + 
				"Software Engineer\r\n" + 
				"Decision & Security Technologies\r\n" + 
				"ABC Technologies\r\n" + 
				"123 North 11th Street\r\n" + 
				"Suite 229\r\n" +
				"Arlington, VA 22209\r\n" + 
				"Tel: +1 (703) 555-1259\r\n" +
				"Fax: +1 (703) 555-1200\r\n" + 
				"awilson@abctech.com\r\n";
		
		BusinessCardParser parse = new BusinessCardParser();
		ContactInfo per = new ContactInfo();
		
		per = parse.getContactInfo(doc);
		
		String nm = per.getName();
		String num = per.getPhoneNumber();
		String mal = per.getEmailAddress();
		
		System.out.println(nm);
		System.out.println(num);
		System.out.println(mal);
		
	}

}
