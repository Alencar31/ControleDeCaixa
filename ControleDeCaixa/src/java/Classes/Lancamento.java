package Classes;

public class Lancamento {
    private int id;
    private Conta conta;
    private double valor;
    private String debCre;
    private Historico historico;
    private String complemento;
    private boolean status;

    public Lancamento(int id, Conta conta, double valor, String debCre, Historico historico, String complemento, boolean status) {
        this.id = id;
        this.conta = conta;
        this.valor = valor;
        this.debCre = debCre;
        this.historico = historico;
        this.complemento = complemento;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDebCre() {
        return debCre;
    }

    public void setDebCre(String debCre) {
        this.debCre = debCre;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}