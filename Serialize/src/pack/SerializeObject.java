package pack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeObject {

    public static void main(String[] args) {
	
	Company amazon = new Company("Amazon.com", "Seattle, Washington USA", 69_100, 163_000_000_000L, 123456789);

	String fileName = "object.ser";	
	
	try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fileName))) {
	    
	    o.writeObject(amazon);
	    
	    System.out.println("Data successfully serialized in file " + fileName);
	    
	}
	catch (IOException e) {
	   e.printStackTrace();
	}
	
    }

}
