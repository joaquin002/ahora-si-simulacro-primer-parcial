public abstract class Vehiculo {
    private Marcas Marca;
    private String Modelo;
    private int Patente;
    private int VelRecomendada;
    private int Kilometraje;

    public Vehiculo(Marcas marca, String modelo, int patente, int velRecomendada, int kilometraje) {
        Marca = marca;
        Modelo = modelo;
        Patente = patente;
        VelRecomendada = velRecomendada;
        Kilometraje = kilometraje;
    }

    public Marcas getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public int getPatente() {
        return Patente;
    }

    public int getVelRecomendada() {
        return VelRecomendada;
    }

    public int getKilometraje() {
        return Kilometraje;
    }
}
/* el modelo, la marca, la patente y una velocidad recomendada
y kilometraje.*/