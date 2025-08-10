
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address();
		Customer c = new Customer();
		
		// customer
		c.setSno(1);
		System.out.println(c.getSno());
		
		c.setName("haritha");
		System.out.println(c.getName());
		
		c.setEmail("haritha@gmail.com");
		System.out.println(c.getEmail());
		
		c.setAddr("Andhra Pradesh");
		System.out.println(c.getAddr());
		System.out.println("----------");
		//address
		a.setDoorno(21);
		System.out.println(a.getDoorno());
		
		a.setCityName("Ongole");
		System.out.println(a.getCityName());
		
		a.setPincode("523001");
		System.out.println(a.getPincode());
		
		a.setStreetAddr("Ongole");
		System.out.println(a.getStreetAddr());

	}

}
