import java.util.Scanner;

public class App {

    //Nombre: Ninfa Isabel Rodríguez Briceño
    // Carnet: 2024-1649U

    public static int tamv = 0;
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean condiciosalida = true;

        do {

            try {

                System.out.println( "Ingrese el tamaño del arreglo");
                System.out.println("(Condiciones: que el numero que se ingrese no supere los 16, que sea mayor a 1 y que no sea negativo)");

                tamv = leer.nextInt();//10
                condiciosalida = (tamv >= 2 && tamv <= 16) ? false : true;

            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Ocurrio un error, intentalo denuevo");
                leer.nextLine();
            }

        } while (condiciosalida);

        //recibimos el array del metodo
        int array[] = llenado();

        System.out.println("-----------------------------------------------------------------");

        System.out.println("Los valores del arreglo son: ");

        Mostrar(array);

        System.out.println("");

        System.out.println("Los valores del arreglo de forma inversa son:");

        inverso(array);

    }

    public static int[] llenado() {

        int[] arreglo = new int[tamv];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("ingrese el valor [" + i + "]");
            arreglo[i] = leer.nextInt();
        }

        return arreglo;
    }

    public static void Mostrar(int[] a) {

        for (int i : a) {
            System.out.println(i);
        }


    }

    public static void inverso(int[] a) {

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

}
