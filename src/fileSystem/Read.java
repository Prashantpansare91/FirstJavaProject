package fileSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read {
	Main mn = new Main();

	void rea() throws IOException{
		System.out.println("Read existing files");
		System.out.println(" ");
		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter File Location : ");
		String Read1 = sc.nextLine();
		
		File folder = new File(Read1);
		
		File[] fol = folder.listFiles();
		System.out.println("Total no. of files available are: "+fol.length);
		System.out.println(" ");
		for(File i:fol) {
			System.out.println(i.getName());
			
		}
		System.out.println(" ");
		Delete dl = new Delete();
		
		BufferedReader next = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Want to delete any Available files? "
				+ "OR You can exit & start from beginning\n(yes/no/exit)");
		
		String check = next.readLine();
		switch(check) {
		case "yes":
			dl.del();;
			break;
		case "no":
			System.out.println("Thank for visiting");
			mn.main(null);
			
		case "exit":
			mn.main(null);
		}
		}catch(Exception e) {
			System.out.println("Error occured");
			mn.main(null);
		}
	}
	
}
