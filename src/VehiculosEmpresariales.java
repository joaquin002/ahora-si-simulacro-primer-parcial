public class VehiculosEmpresariales extends Vehiculo{
    //no usados para viajes comerciales
    private int CantButacas;
    private String AñoAdquisicion;

    public VehiculosEmpresariales(Marcas marca, String modelo, int patente, int velRecomendada, int kilometraje, String añoAdquisicion, int cantButacas) {
        super(marca, modelo, patente, velRecomendada, kilometraje);
        AñoAdquisicion = añoAdquisicion;
        CantButacas = cantButacas;
    }

    public int getCantButacas() {
        return CantButacas;
    }

    public String getAñoAdquisicion() {
        return AñoAdquisicion;
    }
}
