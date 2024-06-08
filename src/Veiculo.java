public abstract class Veiculo {
    protected String rodas;
    protected String marca;
    protected String modelo;
    protected double valorPecas;

    public Veiculo(String rodas, String marca, String modelo, double valorPecas) {
        this.rodas = rodas;
        this.marca = marca;
        this.modelo = modelo;
        this.valorPecas = valorPecas;
    }
    public abstract double calculaPrecoMaoDeObra(); 
}
