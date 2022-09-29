package hu.petrik.javaoopdolgozat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Bejegyzes bejegyzes = new Bejegyzes("Füredi Dániel", "lorem ipsum sjsahskahgioaghgahhgigas");

        bejegyzes.like();
        bejegyzes.like();
        bejegyzes.like();

        bejegyzes.setTartalom("lorem ipsum alma");

        System.out.println(bejegyzes);

        List<Bejegyzes> lista1 = new ArrayList<>();
        List<Bejegyzes> lista2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy darabszámot: ");
        int darabSzam = sc.nextInt();
        if (darabSzam < 0){
            System.out.println("Természetes számot adj meg!");
        }
        String tempSzerzo = "";
        String tempTartalom = "";
        for (int i = 0; i < darabSzam; i++){
            System.out.print("Adja meg a(z) " + (i+1) + ". bejegyzés szerzőjét: ");
            tempSzerzo = sc.next();
            System.out.print("Adja meg a(z) " + (i+1) + ". bejegyzés tartalmát: ");
            tempTartalom = sc.next();
            lista1.add(new Bejegyzes(tempSzerzo, tempTartalom));
        }
        for (Bejegyzes b : lista1){
            System.out.println(b);
        }

    }
}
