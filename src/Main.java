import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empresa e1 = new Empresa();

        Scanner scanner=new Scanner(System.in);
        int opcion;
        int opcion2;
        boolean salida = true;

        do {
            System.out.println("1-agregar vehiculo");
            System.out.println("2-mostrar auto");
            System.out.println("3-quitar vehiculo");
            System.out.println("4-salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("1-vehiculo pasajeros");
                    System.out.println("2-vehiculo de carga");
                    System.out.println("3-vehiculo empresarial");
                    opcion2 = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcion2){
                        case 1:
                            if (e1.añadirVehiculoPasajeros(Marcas.JEEP,"renegade",123,140,0,5,CategoriaDelVehiculo.PREMIUM)){
                                System.out.println("se añadio vehiculo pasajeros");
                            }
                            break;
                        case 2:
                            e1.añadirVehiculoCarga(Marcas.FORD,"f100",456,100,60000,500,UnidadMedida.KILOS);
                            break;
                        case 3:
                            e1.añadirVehiculoEmpresarial(Marcas.DODGE,"challenger",789,170,0,"2025",2);
                            break;
                        default:
                            System.out.println("error de opciones");
                            break;
                    }
                    break;
                case 2:
                    System.out.println(e1.mostrarVehiculo(123));
                    break;
                case 3:
                    if (e1.quitarVehiculo(456)){
                        System.out.println("el vehiculo se elimino");
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