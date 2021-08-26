package fileSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delete {
	Main mn = new Main();
	void reload() {
		
	}
	void del() throws IOException {
		System.out.println(" ");
		
		try {
		BufferedReader delete = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please type file name you want to Delete.");
		
		String del = delete.readLine();
		
		File de = new File(del);
		if(de.delete()) {
			System.out.println("Deleted Successfully");
		}
		else {
			System.out.println("Unsuccessful File cant delete Try again");
			System.out.println(" ");
			mn.main(null);
		}
		Main mn = new Main();
		mn.main(null);
		}catch(Exception e) {
			System.out.println("Error");
			
		}
		
	}

}
