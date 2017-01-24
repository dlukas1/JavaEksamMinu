package Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class TulpDiagram {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta erinevaid numbreid.");
        System.out.println("Sisestuse lõpetamiseks sisesta 0.");

        ArrayList<Integer> numbrid = new ArrayList<Integer>();
        int i = 1;
        while (true) {

            System.out.println("Sisesa " + i + ". number: ");
        int sisestus = sc.nextInt();
        while (true) {
        if (sisestus < 0) {
            System.out.println("Ära sisesta negatiivset arvu");
            System.out.println("Sisesta uuesti:");
        sisestus = sc.nextInt();
        } else
        break;
        }

        if (sisestus == 0) {
        break;
        } else {
        numbrid.add(sisestus);
        i++;
        }

        }
        for (int j = 0; j < numbrid.size(); j++) {
        System.out.format("%3s", numbrid.get(j) + " ");
        for (int k = 0; k < numbrid.get(j); k++) {
        System.out.format("X");
        }
            System.out.println( );
        }

        }

        }
