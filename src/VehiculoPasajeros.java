public class VehiculoPasajeros extends Vehiculo {
    private int CantPasajeros;
    private CategoriaDelVehiculo Categoria;

    public VehiculoPasajeros(Marcas marca, String modelo, int patente, int velRecomendada, int kilometraje, int cantPasajeros, CategoriaDelVehiculo categoria) {
        super(marca, modelo, patente, velRecomendada, kilometraje);
        CantPasajeros = cantPasajeros;
        Categoria = categoria;
    }

    public int getCantPasajeros() {
        return CantPasajeros;
    }

    public CategoriaDelVehiculo getCategoria() {
        return Categoria;
    }
}
/*Los vehículos que transportan pasajeros cuentan con una cantidad de pasajeros que pueden
llevar,la categoría del vehículo que puede ser: standard, premium y deluxe
 */