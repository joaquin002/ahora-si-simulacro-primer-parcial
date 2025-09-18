public class Viaje {
    private int IdViaje=0;
    private int PatenteVehiculo;
    private int DniChofer;
    private int CantPas_Carga;
    private String Destino;
    private int Distanciakm;
    private int TarifaViaje;

    public Viaje(int tarifaViaje, int distanciakm, String destino, int cantPas_Carga, int dniChofer, int patenteVehiculo) {
        this.IdViaje = IdViaje++;
        TarifaViaje = tarifaViaje;
        Distanciakm = distanciakm;
        Destino = destino;
        CantPas_Carga = cantPas_Carga;
        DniChofer = dniChofer;
        PatenteVehiculo = patenteVehiculo;
    }

}
/*la patente del vehículo que lo realiza,el dni del chofer que maneja,
 la cantidad de pasajeros o de carga que lleva, el destino del viaje, la distancia del viaje en kms,
  tarifa del viaje y se le va a asignar un id automáticamente*/