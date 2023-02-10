import java.util.Scanner;
public class Exercices {
    public static void main(String[] args) {
        volume();
    }
    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + somme);
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        float premierEntier = scanner.nextFloat();
        System.out.println("Veuillez saisir le deuxième entier");
        float deuxiemeEntier = scanner.nextFloat();
        float somme = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + somme);
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur");
        float longueur = scanner.nextFloat();
        System.out.println("Veuillez saisir la largeur");
        float largeur = scanner.nextFloat();
        System.out.println("Veuillez saisir la hauteur");
        float hauteur = scanner.nextFloat();
        float somme = longueur * largeur * hauteur;
        System.out.println("Le volumes est " + somme);

    }
}



