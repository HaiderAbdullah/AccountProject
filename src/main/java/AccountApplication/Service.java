package AccountApplication;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Service {
	
	
	
	public void createAccount() {
	
	Account account = new Account("Abdullah", "Haider", 123);
	System.out.println("");
	
	Map<String, Account> numberMapping = new HashMap<String, Account>();

	

	numberMapping.put("1", new Account(account.getFirstName(),account.getLastName(),account.getAccountNumber()));

	System.out.println(numberMapping.values());
	
	
	Service obj = new Service();

	obj.run();

}
	
	private void run() {

		ObjectMapper mapper = new ObjectMapper();

		Account account = createObject();

		

		try {

			mapper.writeValue(new File("C:\\Users\\Admin\\eclipse-workspace\\AccountProject\\Account.json"), account);

			

			String jsonInString = mapper.writeValueAsString(account);

			System.out.println(jsonInString);

			

			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(account);

			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {

			e.printStackTrace();

		} catch (JsonMappingException e) {

			e.printStackTrace();

	} catch (IOException e) {

		e.printStackTrace();

	}

}

private Account createObject() {

	Account account = new Account("Abdullah", "Haider", 123);

	return account;

}

}



	
