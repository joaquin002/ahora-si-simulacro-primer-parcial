import java.util.ArrayList;
import java.util.HashSet;

public class Empresa {
    private HashSet<Chofer>Choferes;
    private ArrayList<Viaje> Viajes;

    public Empresa() {
        this.Choferes = new HashSet<>();
        this.Viajes = new ArrayList<>();
    }


}
/*La empresa cuenta con vehículos de transporte de pasajeros, vehículos de carga y vehículos empresariales
(para uso interno de la empresa).
Los vehículos que transportan pasajeros cuentan con una cantidad de pasajeros que pueden llevar,
la categoría del vehículo que puede ser: standard, premium y deluxe
Los vehículos de carga, por el otro lado, van a tener una capacidad máxima de carga y en qué unidad de
 medida se mide su carga: kgs, lts o lbs.
Los vehículos empresariales tienen una cantidad de butacas y año de adquisición. Y no son conducidos
para viajes comerciales.
De todos los vehículos precisamos guardar el modelo, la marca, la patente y una velocidad recomendada
y kilometraje.
Por un contrato de la empresa, solo se pueden adquirir vehículos de las marcas: ford, chevrolet, dodge
 y jeep.
*/
/*La empresa le da un mantenimiento especial a los vehículos que realizan viajes comerciales,
y cuando esto sucede, se actualizan los datos de estos vehículos: velocidad recomendada,
 kilometraje y cantidad de pasajeros(en el caso de los de transporte) o cantidad de carga(en los de carga).
  Por esto, ambos tipos de vehículos deberían implementar esta funcionalidad.
 */
/*Además de la información de los vehículos, la empresa desea llevar un listado de todos sus choferes,
 de quienes guardaremos el nombre, apellido, dni y salario por km. recorrido
 */
/*Por último, la empresa nos solicita poder llevar un registro de todos los viajes que realice.
Precisan de cada viaje: la patente del vehículo que lo realiza,el dni del chofer que maneja,
 la cantidad de pasajeros o de carga que lleva, el destino del viaje, la distancia del viaje en kms,
  tarifa del viaje y se le va a asignar un id automáticamente.
*/