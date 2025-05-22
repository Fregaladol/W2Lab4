import java.util.Scanner;

public class App {

    public static void dormirse(){
        System.out.println("ZZZzzZZZzzZZzz");
    }


    public static void pideComida(){
        System.out.println("cacatúa cacahuetes!");
    }


    public static void alimentar(boolean done){

        Scanner scanner = new Scanner(System.in);
        String food;
        do {
            System.out.println("¿Qué comida le das a la cacatúa?");
            food = scanner.nextLine();

            if (!food.equalsIgnoreCase("cacahuetes")) {
                pideComida();
            }

        } while (!food.equalsIgnoreCase("cacahuetes"));
        
        dormirse();
        
        scanner.close();
    }


    public static void main(String[] args) throws Exception {
        /* 3- CACATÚA CACAHUETES!


        Tienes una cacatúa que todo el rato te pide comer cacahuetes, diciendo “cacatúa cacahuetes!”.


        El programa te pregunta qué comida le das.


        Mientras NO sean cacahuetes, sigue diciendo “cacatúa cacahuetes!”


        Pero si le das cacahuetes, llama al método ‘dormirse’ y se calla, y en vez del mensaje anterior,
        vemos ‘zzZzzzz…’ (aquí acaba el programa)

        *EXTRA: realizar no solo el método 'dormirse()', sino también el de 'pideComida()' */


        boolean done = false;

        alimentar(done);
       
      




    }
}
