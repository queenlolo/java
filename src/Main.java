import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai recupere un entier: " + unEntier);
        System.out.println("J’ai aussi recupere un reel: " + unReel);

        System.out.println("Bonjour, quel est votre prénom ?");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour " + prenom);
    }
}