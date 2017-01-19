package OOP;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Dmitry on 19.01.2017.
 */
public class test {

    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<>();

        for (int i = 0; i <5 ; i++) {
            h.put(i+"a", "First");
           i++;
        }



        System.out.println(h);

        ArrayList al = new ArrayList();
        for (int i = 0; i < 5; i++) {
            al.add(i,"name");
        }
        System.out.println(al);

    }
}
