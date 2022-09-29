package hu.petrik.javaoopdolgozat;

public class Main {

    public static void main(String[] args) {
	    Bejegyzes bejegyzes = new Bejegyzes("Füredi Dániel", "lorem ipsum sjsahskahgioaghgahhgigas");

        bejegyzes.like();
        bejegyzes.like();
        bejegyzes.like();

        bejegyzes.setTartalom("lorem ipsum alma");

        System.out.println(bejegyzes);
    }
}
