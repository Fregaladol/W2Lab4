import java.util.Scanner;

public class App {


    public static float metodoSumar(float a, float b){
        return a + b;
    }

    public static float metodoRestar(float a, float b){
        return a - b;
    }

    public static float metodoMultiplicar(float a, float b){
        return a * b;
    }

    public static float metodoDividir(float a, float b){

        if (b == 0) {
            System.out.println("Error: Division entre Cero");
            return 0;
        }
        return a / b;
    }



    public static void main(String[] args) throws Exception {
        
        /* 2- CALCULAR
        Con switch, preguntar la operación ( ‘sumar’, ‘restar’, ‘multiplicar’ y ‘dividir’ ), y desde cada caso, envíalo a una función diferente ( ‘metodoSumar’, ‘metodoRestar’, ‘metodoMultiplicar’ y ‘metodoDividir’ ) que retorne el resultado a esa opción del switch y se muestre en terminal.

        Resumen: desde cada caso del switch, llamas a un método u otro, y lo imprimes desde ese caso.


        +EXTRA: Opcional: colocar todo el programa en un bucle que siga funcionando mientras que el usuario no escriba “s” (salir).

        +EXTRA: usar char y (+, -, *,/) cuando le pides al usuario qué quiere hacer */

        Scanner scanner = new Scanner(System.in);
        Character quitProgram;

        

        do {
            System.out.println("Este pequeño Script recibe dos números que pueden ser enteros o no y realiza una serie de operaciones básicas. \nDependiendo de la operacion escribe su simbolo.\nSuma (+) \nResta (-) \nMultiplicación (*) \nDivisión (/)");

            System.out.println("Escribe el primer valor:");
            float a = scanner.nextFloat();

            System.out.println("Escribe el segundo valor");
            float b = scanner.nextFloat();

            System.out.println("Que operación quieres realizar +,-,*,/?");
            Character operation = scanner.next().charAt(0);

            switch (operation) {
            case '+':
                float sum = metodoSumar(a,b);
                System.out.printf("La suma de tus valores %.2f y %.2f es %.2f.\n", a,b,sum);
                break;
            case '-': 
                float sustract = metodoRestar(a,b);
                System.out.printf("La resta de tus valores %f y %f es %f.\n", a,b,sustract);
                break;
            case '*':
                float mult = metodoMultiplicar(a,b);
                System.out.printf("La multiplicación de tus valores %.2f y %.2f es %.2f.\n", a,b,mult);
                break;
            case '/':
                float division = metodoDividir(a,b);
                System.out.printf("La división de tus valores %.2f y %.2f es %.2f.\n", a,b,division);
                break;
            default:
                System.out.println("Esa opción no es valida");
                break;
        }

        System.out.println("Escribe S para salir");
        quitProgram = scanner.next().charAt(0);

        } while (quitProgram != 's' && quitProgram != 'S');

        scanner.close();

        



    }
}
