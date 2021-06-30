package tax;

public class FormasDeImplementarUmaInterface {

    public static void exemplo1() {
        // Criado uma classe TaxImp e feito a implementação do metodo atrasves do override
        Taxi taxiIml = new TaxIml();

        // Chamada do metodo para teste que a implemetação funcionou
        taxiIml.reservar("teste1");
    }

    // OBS: dois exemplos abaixo so funciona quando a interface tem um unico metodo e abstrato

    public static void exemplo2() {
        // Feito a implementação direto na classe que sera usada e também usando override
        Taxi taxiIml = new Taxi() {
            @Override
            public void reservar(String parametro) {
                System.out.println("TaxiImpl12" + " - " + parametro);
            }
        };

        // Chamada do metodo para teste que a implemetação funcionou
        taxiIml.reservar("teste2");
    }

    public static void exemplo3() {
        // Feito a implementação dcom lambda utilizando arow function
        Taxi taxiIml = (parametro) -> {
            System.out.println("TaxiImpl13" + " - " + parametro);
        };

        // Chamada do metodo para teste que a implemetação funcionou
        taxiIml.reservar("teste3");

        // exemplo de metodo dafault
        taxiIml.detodoDefault();
    }

}
