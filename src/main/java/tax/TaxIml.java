package tax;

public class TaxIml implements Taxi {
    @Override
    public void reservar(String parametro) {
        System.out.println("TaxiImpl11" + " - " + parametro);
    }
}
