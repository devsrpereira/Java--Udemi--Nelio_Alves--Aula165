package entities;

public abstract class Contribuinte {
    private String name;
    private double renda;

    public Contribuinte(){}
    public Contribuinte(String name, double renda) {
        this.name = name;
        this.renda = renda;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }


    public abstract double impostoPago();
    public double impostoArrecadado(double somaArrecadacao){
        return somaArrecadacao += somaArrecadacao;
    }


}
