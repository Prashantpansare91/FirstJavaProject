package fileSystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search {
	void search() throws IOException {
		System.out.println("Searching wait...");
		System.out.println("Enter File name you want to search:");
		BufferedReader search = new BufferedReader(new InputStreamReader(System.in));
		String done = search.readLine();
		File sr = new File(done);
		sr.exists();
		if(sr.exists()) {
			System.out.println("File "+done+" is present");
		}
		else {
			System.out.println("Not Present");
		}
		}

}
