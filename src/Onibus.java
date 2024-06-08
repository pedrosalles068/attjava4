public class Onibus extends Veiculo {
    public static final double PORCENTAGEM = 0.20;   
    public Onibus(String rodas,String marca,String modelo, double valorPecas) {
        super(rodas, marca ,modelo, valorPecas);
    }
    @Override
    public double calculaPrecoMaoDeObra(){
        return valorPecas * PORCENTAGEM;
    }
}
