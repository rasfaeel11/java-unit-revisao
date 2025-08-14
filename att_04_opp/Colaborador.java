package att_04_opp;

public class Colaborador {
    private double salarioColaboradorBruto;
    private String tipoDesconto;
    private int descontoSalarioPorcentagem;
    private double descontoSalarioValor;
    private double salarioLiquido;

    //metodos Getters and Setters
    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getSalarioColaboradorBruto() {
        return salarioColaboradorBruto;
    }

    public String getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(String tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public int getDescontoSalarioPorcentagem() {
        return descontoSalarioPorcentagem;
    }

    public void setDescontoSalarioPorcentagem(int descontoSalarioPorcentagem) {
        this.descontoSalarioPorcentagem = descontoSalarioPorcentagem;
    }

    public double getDescontoSalarioValor() {
        return descontoSalarioValor;
    }

    public void setDescontoSalarioValor(double descontoSalarioValor) {
        this.descontoSalarioValor = descontoSalarioValor;
    }

    public void setSalarioColaboradorBruto(double salarioColaborador) {
        this.salarioColaboradorBruto = salarioColaborador;
    }
    
    // Sub rotinas
    public void definirTipoSalario(double salario){
        if(salario <= 2000){
            this.tipoDesconto = "Isento";
            this.descontoSalarioPorcentagem = 0;
        } else if(salario > 2000 && salario <= 4000){
            this.tipoDesconto = "Minimo";
            this.descontoSalarioPorcentagem = 2;
        } else if (salario > 4000){
            this.tipoDesconto = "Medio";
            this.descontoSalarioPorcentagem = 4;
        }
    }
    public double calcularDesconto(double salario, int percentualDesconto){
        double desconto = (salario * percentualDesconto / 100);
        this.descontoSalarioValor = desconto;
        return desconto;
    }
    public double calcularSalarioLiquido(double salarioBruto, double valorDesconto){
        double salarioLiquido = salarioBruto - valorDesconto;
        this.salarioLiquido = salarioLiquido;
        return salarioLiquido;
    }
    public double salarioMaximoDesconto(double valorDesconto){
        if(valorDesconto > 400){
            valorDesconto = 400;
            this.descontoSalarioValor = valorDesconto;
            this.tipoDesconto = "Maximo";
        }
        return valorDesconto;
    }

}
