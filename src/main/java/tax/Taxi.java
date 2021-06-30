package tax;

// anotação que valida que a interface so pode ter um metodo
@FunctionalInterface
public interface Taxi {
    void reservar(String parametro);

    default void detodoDefault() {
        System.out.println("Metodo Default");
    }
}
