import java.io.BufferedReader;
import java.io.FileReader;

public class Checkchar {

	public static void main(String[] args) throws Exception {

		 BufferedReader b = new BufferedReader(new FileReader("textfile.txt"));
		 String str = b.readLine();
		  int upper = 0; 
		  int lower = 0;
		  int num = 0; 
		  int spec = 0;
		   for(int i = 0; i < str.length(); i++)
	        {
	            char ch = str.charAt(i);
	            if (ch >= 'A' && ch <= 'Z') {
	            	upper++;
	            }
	                
	            else if (ch >= 'a' && ch <= 'z') {
	            	lower++;
	            }
	                
	            else if (ch >= '0' && ch <= '9') {
	                num++;
	            }else {
	                spec++;
	            } 
	        }
	 
	        System.out.println(" Special Characters : " + spec);
	        System.out.println(" Number : " + num);
	        System.out.println(" Lowercase Characters : " + lower);
	        System.out.println(" Uppercase Characters : " + upper);

	}

}
