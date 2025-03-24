package filecollection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	String FileName = "C:\\Users\\rsudh\\OneDrive\\Desktop\\ADDON_JAVA\\Final core\\src\\filecollection\\test.txt";
	
	public void WriteHelloWorld() {
		FileWriter f = null;
		try {
			f = new FileWriter(FileName);
			BufferedWriter bw = new BufferedWriter(f);
			bw.write("Hello....");
			bw.newLine();
			bw.close();
			bw = null;			
			System.out.println("File Creation completed.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			if(f != null) {
				try {
					f.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				f=null;
			}
		}

		
		
		
		
		
		
		
		
		
		
	}

	public void ReadFile() {
		FileReader r = null;
		try {
			r = new FileReader(FileName);
			BufferedReader br = new BufferedReader(r);
			String data = br.readLine();
			br = null;
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (r != null) {
				try {
					r.close();
					r = null;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
