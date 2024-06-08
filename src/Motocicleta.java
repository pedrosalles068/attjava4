public class Motocicleta extends Veiculo {
    private static final double PORCENTAGEM = 0.10;
    public Motocicleta(String rodas,String marca,String modelo, double valorPecas) {
        super(rodas, marca, modelo, valorPecas);
    }
    @Override
    public double calculaPrecoMaoDeObra() {
        return valorPecas * PORCENTAGEM;
    }  
}

