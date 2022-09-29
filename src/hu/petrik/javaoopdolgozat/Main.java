package hu.petrik.javaoopdolgozat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Bejegyzes> lista1 = new ArrayList<>();
    public static List<Bejegyzes> lista2 = new ArrayList<>();

    public static void main(String[] args) {

        //osztalyTesztelesFeladat();
        //listaFeltoltesFeladat();
        fileBeolvasFeladat();
    }

    private static void fileBeolvasFeladat() {

        Scanner sc = null;
        try {
            sc = new Scanner(new File("bejegyzesek.csv"));
        } catch (FileNotFoundException e){
            System.out.println("error");
        }
        while (sc.hasNext()){
            String[] temp = sc.nextLine().split(";");
            lista2.add(new Bejegyzes(temp[0], temp[1]));
        }
        for (Bejegyzes b : lista2){

            System.out.println(b);
        }
    }

    private static void listaFeltoltesFeladat(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy darabszámot: ");
        int darabSzam = sc.nextInt();
        if (darabSzam < 0){
            System.out.println("Természetes számot adj meg!");
        }
        String tempSzerzo;
        String tempTartalom;
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

    private static void osztalyTesztelesFeladat(){
        Bejegyzes bejegyzes = new Bejegyzes("Füredi Dániel", "lorem ipsum sjsahskahgioaghgahhgigas");

        bejegyzes.like();
        bejegyzes.like();
        bejegyzes.like();

        bejegyzes.setTartalom("lorem ipsum alma");

        System.out.println(bejegyzes);
    }
}
