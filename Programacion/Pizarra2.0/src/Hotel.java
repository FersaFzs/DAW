import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private Map<Integer, Habitacion> habitaciones;

    public Hotel() {
        this.habitaciones = new HashMap<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.put(habitacion.getNumero(), habitacion);
    }

    public void reservarHabitacion(int numero) {
        if (habitaciones.containsKey(numero)) {
            if (habitaciones.get(numero).isEstado()) {
                habitaciones.get(numero).setEstado(false);
            } else {
                System.out.println("Habitacion ya ocupada");
            }
        }
    }

    public void liberarHabitacion(int numero) {
        if (habitaciones.get(numero).isEstado()) {
            habitaciones.get(numero).setEstado(true);
        } else {
            System.out.println("Habitacion ya ocupada");
        }
    }
}