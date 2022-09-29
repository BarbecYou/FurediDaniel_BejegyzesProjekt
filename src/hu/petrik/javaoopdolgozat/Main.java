package hu.petrik.javaoopdolgozat;

import java.util.ArrayList;
import java.util.List;

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


    }
}
