//Alex Díaz Carnet: 2024-1639U

import java.util.Scanner;

public class App {

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condicionsalida = true;

        do {

            try {

                System.out.println(
                        "Ingrese el tamaño del arreglo que no supere los 16 y sea mayor a 1 y que tampoco sea negativo ");
                tamv = leer.nextInt();
                condicionsalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio algo revisar");
                leer.nextLine();
            }

        } while (condicionsalida);

        // Recibimos el array del método
        int array[] = llenado();

        System.out.println("Mostrar");

        Mostrar(array);

        System.out.println("Mostrar invertido");

        int[] arrayInvertido = invertirArray(array);

        Mostrar(arrayInvertido);
    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el valor [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }
    }
    //Aquí se encuentra el método invertido de array.
    public static int[] invertirArray(int[] array) {
        // Creamos un nuevo arreglo del mismo tamaño que el arreglo original
        int[] arrayInvertido = new int[array.length];
        // Iteramos sobre el arreglo original
        for (int i = 0; i < array.length; i++) {
            // Calculamos la posición inversa en el nuevo arreglo
        // La posición inversa es la longitud del arreglo menos la posición actual menos 1
        // Restamos 1 porque los índices en los arreglos comienzan desde 0
        // Por lo tanto, el último elemento del arreglo original estará en la posición 0 del nuevo arreglo invertido
        // Y el primer elemento del arreglo original estará en la última posición del nuevo arreglo invertido
            arrayInvertido[i] = array[array.length - 1 - i];
        }

        return arrayInvertido;
    }
}
