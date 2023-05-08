package entities;

public class PessoaJuridica extends Contribuinte{
    private int qtdeFuncionaros;

    public PessoaJuridica(String name, double renda, int qtdeFuncionaros) {
        super(name, renda);
        this.qtdeFuncionaros = qtdeFuncionaros;
    }


    public int getQtdeFuncionaros() {
        return qtdeFuncionaros;
    }
    public void setQtdeFuncionaros(int qtdeFuncionaros) {
        this.qtdeFuncionaros = qtdeFuncionaros;
    }


    @Override
    public double impostoPago() {
        double imposto = 0;
        if (getQtdeFuncionaros() <= 10){
            imposto = (getRenda() * 0.16);
        } else {
            imposto = (getRenda() * 0.14);
        }
        return imposto;
    }

}
