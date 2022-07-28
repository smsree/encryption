package encryption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class ImageEncryption {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner sc = new Scanner(System.in);
        System.out.println("Note : Encryption Key act as Password to Decrypt the same Image,otherwise it will corrupt the Image.");
      
        
        System.out.print("Enter key for Encryption : ");
        int key = sc.nextInt();
                            
        
        FileInputStream fis = new FileInputStream(
        		"C:\\Users\\Welcome\\Desktop\\Green home Foods\\images\\addmeal.jpg");
       
                            
        byte data[] = new byte[fis.available()];
                            
       
        fis.read(data);
        int i = 0;
                            
       
        for (byte b : data) {
            data[i] = (byte)(b ^ key);
            i++;
        }
                            
       
        FileOutputStream fos = new FileOutputStream(
            "C:\\Users\\Welcome\\Desktop\\Green home Foods\\images\\encrypted1.jpg");
                            
        
                            
        fos.write(data);
                            
       
        fos.close();
        fis.close();
        System.out.println("Encryption Done...");
    


	}

}
