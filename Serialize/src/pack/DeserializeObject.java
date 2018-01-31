package pack;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializeObject {

    public static void main(String[] args) {
	
	String fileName = "object.ser";
	
	Company company = null;
	
	try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName))) {
	    
	    company = (Company) is.readObject();
	    
	}
	catch (IOException i) {
	    i.printStackTrace();
	}
	catch (ClassNotFoundException n) {
	    System.out.println("class Company not found");
	}
	
	if (company != null) {
	    System.out.println("Deserialized data: \n");
	    System.out.println(company);
	    
	}
	
    }

}
