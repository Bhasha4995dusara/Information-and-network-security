package monoalphabetic;
import java.util.*;
public class Monoalphabetic 
{
public static char p[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; public static char ch[] = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
  public static String doEncrypt(String s)
    {char c[] = new char[s.length()];
        for(int i = 0; i<s.length(); i++)
        {for(int j = 0; j < 26; j++)
            {if(p[j] == s.charAt(i))  
                { c[i]=ch[j];   // replace the character encryption
                    break;
                }//end of if
            }//end of inner for
        }//end of outer for
        return(new String(c));
    }// end of function
  public static String doDecrypt(String s){
        char c1[] = new char[s.length()];
        for(int i = 0; i<s.length(); i++)
        {for(int j = 0; j < 26; j++)
            { if(ch[j] == s.charAt(i))  
                {c1[i]=p[j];   // replace the character decryption
                    break;
                }//end of if
  }//end of inner for
        }//end of outer for
        return(new String(c1));
    }// end of function
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Message You want to encrypt");
        String m = sc.next();
        System.out.println("message is:"+m);
        String enm = doEncrypt(m.toLowerCase());
        System.out.println("Encrypted Message is:"+enm);
  System.out.println("Decrypetd Message is:"+doDecrypt(enm));
    }}
