
//Criar o objeto da classe Carro

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Azul", "BMW", 59);

        System.out.println("Carro 01:");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Capacidade do tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Total do valor para encher o tanque: R$ " + carro1.totalValorTanque(6.39));


        Carro carro2 = new Carro("Cinza", "Golf", 60);

        System.out.println("\nCarro 02");
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Capacidade do tanque: " + carro2.getCapacidadeTanque());
        System.out.println("Total do valor para encher o tanque: R$ " + carro2.totalValorTanque(6.39));




    }


}
