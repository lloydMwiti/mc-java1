package com.moringa;

public class Decrypt {
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

}
