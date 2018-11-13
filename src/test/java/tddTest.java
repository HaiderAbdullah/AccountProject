import static org.junit.Assert.*;

import org.junit.Test;

import AccountApplication.Account;
import AccountApplication.Service;

public class tddTest {

	@Test
	public void test() {
		Service service = new Service();
		Account m1 = new Account("Abdullah", "Haider", 1);
		Account m2 = new Account("Nimesh", "Ch", 2);
		Account m3 = new Account("Manish", "Se", 3);
		Account m4 = new Account("Tom", "hello", 4);
		

		service.add_user(m1);
		service.add_user(m2);
		service.add_user(m3);
		service.add_user(m4);
		assertEquals(1, service.get_person("Abdullah"));
		
	}

}
