public class VehiculoDeCarga extends Vehiculo implements MantenimientoEspecial{
    private int CapMaxCarga;
    private UnidadMedida Medida;

    public VehiculoDeCarga(Marcas marca, String modelo, int patente, int velRecomendada, int kilometraje, int capMaxCarga, UnidadMedida medida) {
        super(marca, modelo, patente, velRecomendada, kilometraje);
        CapMaxCarga = capMaxCarga;
        Medida = medida;
    }

    public int getCapMaxCarga() {
        return CapMaxCarga;
    }

    public UnidadMedida getMedida() {
        return Medida;
    }

    @Override
    public void mantenimiento(int velocidad, int kilometros, int cantidad) {
        setVelRecomendada(velocidad);
        setKilometraje(kilometros);
        this.CapMaxCarga=cantidad;
    }

    @Override
    public String toString() {
        return super.toString()+", cap.Carga: "+this.CapMaxCarga+", tipo de medida: "+this.Medida;
    }
}
