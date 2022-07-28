package encryption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

public class Main {

	public static void main(String[] args) throws IOException {
		String text="hello world i am sree sangamesh this is my reporrt about the text edition found in this world";
		AES aes=new AES();
		
		//String cipherText = aes.encrypt(text);
		//System.out.println(cipherText);
		//System.out.println(aes.decrypt(cipherText));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Welcome\\Desktop\\Green home Foods\\images\\addmeal.jpg");
		
		String encryptedimg = aes.encryptFile(fis);
		
		System.out.println(encryptedimg);
		
		try {
			aes.decryptFile(encryptedimg);
		} catch (IllegalBlockSizeException | BadPaddingException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
