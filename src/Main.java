//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo onibus = new Onibus("6", "Mercedes", "Citaro", 1000);
        Veiculo carro = new Carro("4", "Toyota", "Hilux", 900);
        Veiculo motocicleta = new Motocicleta("2", "Honda", "CRF", 500);

        System.out.println("Preço mínimo da mão de obra para ônibus: R$ " + onibus.calculaPrecoMaoDeObra());
        System.out.println("Preço mínimo da mão de obra para carro: R$ " + carro.calculaPrecoMaoDeObra());
        System.out.println("Preço mínimo da mão de obra para moto: R$ " + motocicleta.calculaPrecoMaoDeObra());
    } 
}