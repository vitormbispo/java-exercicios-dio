package exclasses.ex1;

import exclasses.ex1.exception.SaldoInsuficienteException;

public class ContaBancaria {
    private float saldo;
    private final float limiteChequeEspecial;
    private float chequeEspecialUtilizado;

    public ContaBancaria(float saldo) {
        this.saldo = saldo;
        if(saldo <= 500.0f) limiteChequeEspecial = 50.0f;
        else limiteChequeEspecial = saldo * 0.5f;

        chequeEspecialUtilizado = 0.0f;
    }

    public void ConsultarSaldo() {
        System.out.printf("\n\n-> Seu saldo é de: R$%s\n\n",saldo);
    }
    public void ConsultarChequeEspecial() {
        System.out.printf("\n\n-> Seu limite do cheque especial é de: R$%s.\n-> O valor utilizado do cheque especial é de: R$%s\n\n",limiteChequeEspecial,chequeEspecialUtilizado);
    }

    public void Depositar(float quantia) {
        this.saldo += quantia;
        if(this.VerificarChequeEspecial() && saldo >= chequeEspecialUtilizado * 0.2) {
            float taxa = chequeEspecialUtilizado * 0.2f;
            saldo -= taxa;
            chequeEspecialUtilizado = 0;
            System.out.printf("\n\n-> Taxa do cheque especial aplicada. Taxa: R$%s. Novo saldo: R$%s\n\n",taxa,saldo);
        }
    }

    public void PagarBoleto(float valor) throws SaldoInsuficienteException {
        DeduzirSaldo(valor);
        System.out.println("-> Boleto pago com sucesso.\n");
    }

    public void Sacar(float quantia) throws SaldoInsuficienteException {
        DeduzirSaldo(quantia);
        System.out.printf("-> Saque realizado com sucesso: R$%s.\n\n",quantia);
    }

    private void DeduzirSaldo(float quantia) throws SaldoInsuficienteException{
        if(saldo < quantia) {
            float saldoChequeEspecial = saldo + this.limiteChequeEspecial;
            float valorUtilizado = quantia - saldo;
            if(chequeEspecialUtilizado + valorUtilizado <= limiteChequeEspecial
                    && saldoChequeEspecial >= quantia) {

                chequeEspecialUtilizado += valorUtilizado;
                saldo -= quantia;
                System.out.println("/!\\ - Atenção: você não possui saldo em conta suficiente. Utilizando cheque especial...");
            }
            else {
                throw new SaldoInsuficienteException(String.format("Seu saldo não é suficiente para a transação. Solicitado: R$%s. Disponível: R$%s",quantia,this.saldo));
            }
        }
        else {
            this.saldo -= quantia;
        }
    }
    public boolean VerificarChequeEspecial() {
        return chequeEspecialUtilizado > 0;
    }
}
