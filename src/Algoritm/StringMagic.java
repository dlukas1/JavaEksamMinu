package Algoritm;

/**

 */
public class StringMagic {

    public static void main(String[] args) {
        System.out.println(everyNth("Abrabam",2));
    }

    public static String missingChar(String str, int n) {
        String front = str.substring(0, n);
        //StringMagic("kitten", 1) → "ktten"
        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());

        return front + back;
    }

    public static String backAround (String str){
        /*
        Given a string, take the last char and return a new string with the last char added at the front and back,
        so "cat" yields "tcatt". The original string will be length 1 or more.
               backAround("cat") → "tcatt"
         */
        String back = str.substring(str.length()-1);
        String full = back+str+back;

        return full;
    }

    public boolean stringE(String str) {
        //Return true if the given string contains between 1 and 3 'e' chars.
        //stringE("Hello") → true

        int es = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'e'){
                es++;
            }
        }
        if (es >0 && es < 4){
            return true;
        } else {
            return false;
        }
    }

    public static String everyNth(String str, int n) {
        String result = "";

        // Look at every nth char
        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }


}
