package entities;

public class PessoaFisica extends Contribuinte {
    private double gastosSaude;

    public PessoaFisica(String name, double renda, double gastosSaude) {
        super(name, renda);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }
    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }


    @Override
    public double impostoPago() {
        double imposto = 0;
        if (getRenda() < 20000){
            imposto = (getRenda() * 0.15)-(getGastosSaude()*0.5);
        } else {
            imposto = (getRenda() * 0.25)-(getGastosSaude()*0.5);
        }
        return imposto;
    }
}

