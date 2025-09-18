public class VehiculoPasajeros extends Vehiculo implements MantenimientoEspecial{
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

    @Override
    public void mantenimiento(int velocidad, int kilometros, int cantidad) {
        setVelRecomendada(velocidad);
        setKilometraje(kilometros);
        this.CantPasajeros = cantidad;
    }
}
/*Los vehículos que transportan pasajeros cuentan con una cantidad de pasajeros que pueden
llevar, la categoría del vehículo que puede ser: standard, premium y deluxe
 */