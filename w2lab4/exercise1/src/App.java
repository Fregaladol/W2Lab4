import java.util.Scanner;

public class App {

    /*   1.1- Llamas al método desde el main, sin parámetros, y sin return, y te hace el programa entero, incluyendo scanner etc (resultado ejemplo: ‘Hola Andrés’).

    Resumen: llamas al método y allí haces todo


    1.2 -- Llamas al método, con parámetros (saludo y nombre) (scanner en el main antes de llamar al método), y sin return, y muestra el resultado DENTRO del método (resultado ejemplo: ‘Hola Andrés’).

    Resumen: pides saludo y nombre, lo pasas al método y imprimes el resultado desde el método


    1.3- Llamas al método, con parámetros (saludo y nombre), y con return, y muestra el resultado FUERA de ese método, y dentro del main() (resultado ejemplo: ‘Hola Andrés’).

    Resumen: pasas saludo y nombre al método, creas la frase en el método y lo retornas al main(), donde imprimes el resultado. */

    public static void fun1 (){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Método 1.1");
        System.out.println("Escribe tu saludo");
        String greetings = scanner.nextLine();
        
        System.out.println("Escribe el nombre de quien saludas");
        String name = scanner.nextLine();

        System.out.println( greetings + " " + name);

        scanner.close();
    }

    public static void fun12(String saludo, String name){
        System.out.println("Método 1.2");

        System.out.println(saludo + " " + name);
    }

    public static String fun13(String saludo, String name){
        System.out.println("Método 1.3");
        return saludo + " " + name;
    }





    public static void main(String[] args) throws Exception {

        
        Scanner scanner = new Scanner(System.in);

        fun1();

        System.out.println("Escribe tu saludo");
        String greetings = scanner.nextLine();
        
        System.out.println("Escribe el nombre de quien saludas");
        String name = scanner.nextLine();

        fun12(greetings, name);

        String returnMetodo13 = fun13(greetings, name);
        System.out.println(returnMetodo13);

        scanner.close();

    }
}
