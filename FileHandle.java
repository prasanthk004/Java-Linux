package tamilnadu.chennai;

import java.io.*;

public class FileHandle {
	
	File file = new File("/home/prasanthk/Desktop/kp.txt");
	
	public static void main(String[] args) {
		
		FileHandle f= new FileHandle() ;
		
	  // f.FileWrite();
	//	f.FileRead();
		f.ImageRead();
	}

	private void ImageRead() {
		// TODO Auto-generated method stub
		File file = new File("/home/prasanthk/Desktop/muruga.jpg");
		File output = new File("/home/prasanthk/Desktop/My docs/tamilKadavul.jpeg");
InputStream is;
try {
	is = new FileInputStream(file);
	OutputStream os = new FileOutputStream(output); 
	int result = is.read(); 
	while(result!=-1)
	{
		os.write(result);
		result = is.read();
	}
	os.flush();
	os.close();
	is.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

	private void FileRead() {
		// TODO Auto-generated method stub
		try {
			FileReader r= new FileReader(file);
			
			int result = 0;
			int cc=0,wc=0;
		
			while(result!=-1)
			{
				
				 result=r.read();
				 System.out.print((char)result);
				 if((char)result== ' '||(char)result=='\n'||(char)result=='\t')
				 {
					 wc++;
				 }
				 cc++;
			  
			}
			
			System.out.println(" WC "+wc+" CC "+cc);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void FileWrite() {
		// TODO Auto-generated method stub

		FileWriter fw;
		try {
			file.createNewFile();
			fw = new FileWriter(file,true);
			fw.write("Prasanth K \n"); 
			fw.write("IT TEAM \n"); 
			fw.flush();
			fw.close(); 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally
		{
			
		}
	}

}
