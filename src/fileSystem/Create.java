package fileSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Create {
	Main mn = new Main();
	Search se = new Search();
	void crt() throws IOException {
		System.out.println("Creating A new File for you.");
		System.out.println(" ");
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("If you want to add file in new location provide the proper location"
				+ " \nFor example\" c:\\FolderName\\ FileName\" ");
		System.out.println(" ");
		
		System.out.println("Please type file name you want to add: ");
		String filename = read.readLine();
		System.out.println("Your file input name is: "+filename);
		
		try {
		File add = new File(filename);
		if(add.createNewFile()) {
			System.out.println("Successfully Created the file");
		}
		else {
			System.out.println("NOT CREATED: Please provide proper name for file.\nFile Already Present!!!");
		}
		}catch(Exception e){
			System.out.print("Error Occured Try Again");
		}
		System.out.println(" ");
		
		Read re = new Read();
		BufferedReader next = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Would you like to see Available files OR You can exit and"
				+ " start from beginning. \nYou can check presence of file"
				+ "\n(yes/no/exit/search) ");
		
		String check = next.readLine();
		
		switch(check) {
		case "yes":
			re.rea();
			break;
		case "no":
			System.out.println("Thank for visiting");
			System.out.println(" ");
			mn.main(null);
			
		case "search":
			se.search();
			
		case "exit":
			mn.main(null);
			System.out.println(" ");
			
		}
		
		
	}
}
