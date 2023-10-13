package TestForRough;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialise  {

	public static void main(String[] args) throws Exception, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\margo\\eclipse-workspace1\\RESTAssured\\Serial.txt");
		ObjectInputStream obs = new ObjectInputStream(fis);
		test t2=(test) obs.readObject();
		System.out.println("A values After Deserilaisation is:"+ t2.a + " B values After Deserilaisation is: "+t2.b);

	}

}
