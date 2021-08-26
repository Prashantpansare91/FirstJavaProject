package fileSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		System.out.println(" ");
		System.out.println("WELCOME TO FILE HANDLING SYSTEM BY: \n          PRASHANT PANSARE");
		System.out.println(" ");
		
		Main mn = new Main();
		Create cr = new Create();
		
		Read re = new Read();
	
		Delete dl = new Delete();
		
		Search se = new Search();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Which operation you would like to perform: \n1.Create \n2.Delete \n3.Read all files \n4.Search \nPlease write name of operation:");
		String name = reader.readLine();
		

//		if(name =="Create" | name =="Delete" | name =="Read") {
//			System.out.println("Proper input");	
//		}
//		else if(name =="Delete") {
//			//System.out.println("Proper input");	
//		}
//		else if(name =="Read") {
//			//System.out.println("Proper input");	
//		}
//		else {
//			System.out.println("ImProper input");
//		}
		String check = name;
		switch(check) {
		case "Create" :
			System.out.println("Proper input");
			break;
		case "Delete" :
			System.out.println("Proper input");
			break;
		case "Read" :
			System.out.println("Proper input");
			break;
		case "exit" :
			System.out.println("Proper input");
			break;
		case "Search" :
			System.out.println("Proper input");
			break;
		default:
			System.out.println("ImProper input");
			System.out.println(" ");
			mn.main(null);
			
		}
		
		System.out.println(" ");
		String sw = name;
		switch(sw) {
		case "Create" :
			cr.crt();
			break;
		case "Delete" :
			dl.del();
			break;
		case "Read" :
			re.rea();
			break;
		case "Search" :
			se.search();
			break;
		case "exit":
			mn.main(null);
			System.out.println(" ");
		}
		System.out.println(" ");
		
	}

}
