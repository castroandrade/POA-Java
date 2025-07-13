public class ContaPoupanca extends Conta{

    public ContaPoupanca(String tipoConta, String tipoCliente, double saldoInicial) {
        super(tipoConta, tipoCliente, saldoInicial);
    }

    @Override
    public void calculaValorTarifaManutencao() {

    }
}
