import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int opcion;
        boolean salida = true;

        do {
            System.out.println("1-agregar vehiculo pasajeros");
            System.out.println("-agregar vehiculo pasajeros");
            System.out.println("4-salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("1-vehiculo pasajeros");
                    System.out.println("2-vehiculo de carga");
                    System.out.println("3-vehiculo empresarial");
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcion){

                    }


                    break;
                case 4:
                    salida = false;
                    break;
                default:
                    break;
            }
        }while (salida);

    }
}