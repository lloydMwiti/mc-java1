package com.moringa;
import java.io.Console;

public class App {
    public static String encrypt(String a ,int b){
        if (b >26){
            b = b % 26;
        }
        else if(b<0){
            b = (b % 26) +26;
        }
        String out="";
        char[] raw= a.toCharArray();
        int len=raw.length;
        for(int i=0;i<len;i++){
            char ch = a.charAt(i);
            if(Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c =(char)(ch + b);
                    if(c>'z'){
                        out += (char)(ch -( 26 - b));
                    }else{
                        out +=c;
                    }
                }
                else if(Character.isUpperCase(ch)){
                    char c =(char)(ch + b);
                    if(c>'Z'){
                        out += (char)(ch -( 26 - b));
                    }else{
                        out +=c;
                    }
                }
            }
            else{
                out += ch;
            }
        }return out;
    }

    public static String decrypt(String a ,int b){
        if (b >26){
            b = b % 26;
        }
        else if(b<0){
            b = (b % 26) +26;
        }
        String out="";
        char[] raw= a.toCharArray();
        int len=raw.length;
        for(int i=0;i<len;i++){
            char ch = a.charAt(i);
            if(Character.isLetter(ch)){
                if (Character.isLowerCase(ch)){
                    char c =(char)(ch - b);
                    if(c>'z'){
                        out += (char)(ch +( 26 - b));
                    }else{
                        out +=c;
                    }
                }
                else if(Character.isUpperCase(ch)){
                    char c =(char)(ch - b);
                    if(c>'Z'){
                        out += (char)(ch +( 26 - b));
                    }else{
                        out +=c;
                    }
                }
            }
            else{
                out += ch;
            }
        }return out;
    }

    public static void main(String[]args){
        Console console=System.console();
        String text1 = "abcd 123 efg hij klmnop";
        String cypher = encrypt(text1, 2);

        System.out.println("---------");
        System.out.println("please enter a text to encrypt ");
        String rawText = console.readLine();
        System.out.println("please enter a number to shift the letters( only numbers) ");
        int rawShift=Integer.parseInt(console.readLine());
        System.out.println("---------");

        System.out.println("encryption is "+ encrypt(rawText,rawShift));
        System.out.println("---------");

        String decrypted =decrypt(rawText,rawShift);
        System.out.println("would you like to decrypt the text , type 'yes' or 'y'");
        String res=console.readLine();
            if (res.equals("yes")||res.equals("y")||res.equals("yup")||res.equals("sure")){
                System.out.println("---------");
                System.out.println("Decryption is "+ decrypted);
                System.out.println("---------");
            }
            else{
                System.out.println("didnt understand the comand");
            }



    }

}
