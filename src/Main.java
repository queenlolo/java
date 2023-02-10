import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        discriminant();
    }

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);

        if (delta < 0) {
            float delta5 = (-b+ (float) Math.sqrt(-delta)) / (2 * a);
            float delta6 = (-b- (float) Math.sqrt(-delta)) / (2 * a);
            System.out.println("Ce polynome a 2 racines complexes : " + delta5 + "i" + " et " + delta6 + "i");
        }

        if (delta == 0) {
            int delta2 = - b / (2*a);
            System.out.println("Ce polynome a une racine double : " + delta2);
        }

        if (delta > 0) {
            float delta3 = (-b+ (float) Math.sqrt(delta)) / (2 * a);
            float delta4 = (-b- (float) Math.sqrt(delta)) / (2 * a);
            System.out.println("Ce polynome a 2 racines : " + delta3 + " et " + delta4);
        }
    }
}


