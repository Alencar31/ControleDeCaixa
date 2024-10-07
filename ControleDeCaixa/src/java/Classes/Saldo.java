package Classes;

public class Saldo {
    private int id;
    private Conta conta;
    private int ano;
    private int mes;
    private double saldoAnterior;
    private double credito;
    private double debito;
    private double SaldoFinal;
    private boolean status;

    public Saldo(int id, Conta conta, int ano, int mes, double saldoAnterior, double credito, double debito, double SaldoFinal, boolean status) {
        this.id = id;
        this.conta = conta;
        this.ano = ano;
        this.mes = mes;
        this.saldoAnterior = saldoAnterior;
        this.credito = credito;
        this.debito = debito;
        this.SaldoFinal = SaldoFinal;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getSaldoFinal() {
        return SaldoFinal;
    }

    public void setSaldoFinal(double SaldoFinal) {
        this.SaldoFinal = SaldoFinal;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}