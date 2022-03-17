package assitedProjects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		 File file = new File("D:\\New folder\\aravind.txt");
		
		 if(file.createNewFile()) {
			 System.out.println("Files created sucessfully");
		 }else {
			 System.out.println("File is already exist");
		 }
		 String data = "Hello aravind.....";
		 Files.write(Paths.get("D:\\New folder\\aravind.txt"),data.getBytes());
		 System.out.println("Files written Sucessfully");
		 FileWriter writer = new FileWriter(file);
		 writer.append(data);
			writer.append(data);
			writer.append(data);
			writer.close();
			System.out.println("File Append Operation Done Successfully");
			BufferedReader reader = new BufferedReader(new FileReader("D:\\New folder\\aravind.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
			System.out.println("Fiile Readed Successfully");
		}
		   

	}

