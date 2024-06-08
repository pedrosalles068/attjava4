public class Carro extends Veiculo{
    private static final double PORCENTAGEM = 0.15;
    public Carro(String rodas,String marca, String modelo, double valorPecas){
        super(rodas, marca, modelo, valorPecas);
    }
    @Override
    public double calculaPrecoMaoDeObra() {
        return valorPecas * PORCENTAGEM;
    }
}

