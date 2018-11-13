package AccountApplication;

import java.util.HashMap;
import java.util.Map;


public class Service {
	
	
	
	public void createAccount() {
	
	Account account = new Account("Abdullah", "Haider", 123);
	System.out.println("est");
	
	Map<String, Account> numberMapping = new HashMap<String, Account>();

	

	numberMapping.put("1", new Account(account.getFirstName(),account.getLastName(),account.getAccountNumber()));

	System.out.println(numberMapping.values());

}

private Account createObject() {

	Account account = new Account("Abdullah", "Haider", 123);

	return account;

}

}



	
