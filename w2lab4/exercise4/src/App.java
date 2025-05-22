import java.util.Scanner;

public class App {

    public static String aMinusculas(String phrase){
        return phrase.toLowerCase();
    }

    public static String aMayusculas(String phrase){
        return phrase.toUpperCase();
    }

    public static String aReverso(String phrase){
        
        String reversePhrase = new StringBuilder(phrase).reverse().toString();
        
        return reversePhrase;
    }

    public static String options (String phrase, Scanner scanner){

        System.out.println("- Si la opción es 1, devolver la frase en mayúsculas\n - Si la opción es 2, devolver la frase en minúsculas\n - Si la opción es 3, devolver la frase al revés \n");

        Byte opt = scanner.nextByte();

        scanner.close();
        

        switch (opt) {
            case 1:
                return aMayusculas(phrase);
            case 2:
                return aMinusculas(phrase);
            case 3:
                return aReverso(phrase);
            default:
                return "Opcion no valida!";
        }

    }

    public static void main(String[] args) throws Exception {
        
        /* 4- MODIFICAR FRASE

            Métodos sobre frase  enviada por cliente:

            Se pide en el main() una frase (String) y una opcion (int o byte) y se envian a tratarFrase()

            - Si la opción es 1, devolver la frase en mayúsculas

            - Si la opción es 2, devolver la frase en minúsculas

            - Si la opción es 3, devolver la frase al revés (puedes buscar un método directo para esto)

            Retornar el resultado e imprimirlo desde el método main(). */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame tu frase");

        String phrase = scanner.nextLine();

        String results = options(phrase, scanner);

        System.out.println(results);

        scanner.close();
    }
}
