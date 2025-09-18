import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Chofer cho = (Chofer) obj;
        return this.Dni == cho.Dni && Objects.equals(Nombre,cho.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nombre, Dni);
    }

    @Override
    public String toString() {
        return "Chofer{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Dni=" + Dni +
                ", SalarioPorKm=" + SalarioPorKm +
                '}';
    }
}
