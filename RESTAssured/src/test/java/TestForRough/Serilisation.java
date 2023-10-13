package TestForRough;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class test implements Serializable {
	int a=10;
	int b=20;
	
}

public class Serilisation {

	public static void main(String[] args) throws Exception {
		
		test ts=new test();
		
		FileOutputStream fos = new FileOutputStream("Serial.txt");
		ObjectOutputStream obs = new ObjectOutputStream(fos);
		obs.writeObject(ts);
		
		
		
		

	}

}
