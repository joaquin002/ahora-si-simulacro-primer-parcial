public class Chofer {
    private String Nombre;
    private String Apellido;
    private int Dni;
    private int SalarioPorKm;

    public Chofer(String nombre, int salarioPorKm, int dni, String apellido) {
        Nombre = nombre;
        SalarioPorKm = salarioPorKm;
        Dni = dni;
        Apellido = apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getSalarioPorKm() {
        return SalarioPorKm;
    }

    public int getDni() {
        return Dni;
    }

    public String getApellido() {
        return Apellido;
    }
}
