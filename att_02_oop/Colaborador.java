package att_02_oop;

public class Colaborador {
    private String nome;
    private double rendaMensal;
    private double valorDesejadoEmprestimo;

    public String getNome() {
        return nome;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }

    public double getValorDesejadoEmprestimo() {
        return valorDesejadoEmprestimo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRendaMensal(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }

    public void setValorDesejadoEmprestimo(double valorDesejadoEmprestimo) {
        this.valorDesejadoEmprestimo = valorDesejadoEmprestimo;
    }

    public double calculoEmprestimo(int parcelas, double valorEmprestimo){
        double parcelaMensal = valorEmprestimo / parcelas;

        return parcelaMensal;
    }
}