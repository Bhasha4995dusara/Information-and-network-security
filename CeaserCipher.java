package ceasercipher;
import java.util.*;
 public class Ceasercipher
{
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String enCipher(String plaintext , int shiftkey) //encryption of plaintext
    {
        plaintext = plaintext.toLowerCase();
        String ciphertext = "";
        for(int i=0; i<plaintext.length();i++)
        {
            int charposition = ALPHABET.indexOf(plaintext.charAt(i));
            int keyval = (shiftkey + charposition)%26;
            char replaceval = ALPHABET.charAt(keyval);
            ciphertext += replaceval; 
        } 
       return ciphertext;
    }
    public static String deCipher(String ciphertext,int shiftkey)
    {
        ciphertext = ciphertext.toLowerCase();
        String plaintext = "";
        for(int i =0;i<ciphertext.length();i++)
        {
            int charposition = ALPHABET.indexOf(ciphertext.charAt(i));
            int val = Math.abs((charposition - shiftkey));
            int keyval = val%26;
            char replaceval = ALPHABET.charAt(keyval);
            plaintext += replaceval;
        }
        return plaintext;
    }
    public static void main(String[] args)
    {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String for encryption");
            String message = new String();
            message = sc.next();
            System.out.println("Enter key for Encryption:");
            int key = sc.nextInt();
            if(key<0 || key>26)
            {
                System.out.println("key is not valid..! Please enter valid key");
            }
            else
            {
                System.out.println(enCipher(message,key));
                String realmessage = enCipher(message,key);
                System.out.println(deCipher(realmessage,key));
            }
    }
    
}
