import java.time.LocalDate;


public abstract class Conta {
    private String tipoConta;
    private String tipoCliente;
    private double saldo;
    LocalDate dataAbertura;

    public Conta(String tipoConta, String tipoCliente, double saldoInicial) {
        this.tipoConta = tipoConta;
        this.tipoCliente = tipoCliente;
        this.dataAbertura = LocalDate.now();
        this.saldo = saldoInicial;
    }

    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
        System.out.println("Operação de saque processada. Saldo atual: " + this.saldo);
    }

    public void depositar(double valorDeposito){
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            System.out.println("Depósito de R$" + valorDeposito + " efetuado com sucesso. Saldo atual: " + this.saldo);
        } else System.out.println("Valor de Depósito inválido!");
    }

    public abstract void calculaValorTarifaManutencao();

    // Getters
    public String getTipoConta() {
        return tipoConta;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }


}
