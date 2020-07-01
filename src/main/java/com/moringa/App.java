package com.moringa;
import java.io.Console;

public class App {

    public static void main(String[]args){
        Console console=System.console();
        Encrypt enc=new Encrypt();
        Decrypt dec=new Decrypt();


        System.out.println("---------");
        System.out.println("please enter a text to encrypt ");
        String rawText = console.readLine();
        System.out.println("please enter a number to shift the letters( only numbers) ");
        int rawShift=Integer.parseInt(console.readLine());
        System.out.println("---------");

        System.out.println("encryption is "+ enc.encrypt(rawText,rawShift));
        System.out.println("---------");

        String decrypted =dec.decrypt(rawText,rawShift);
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
