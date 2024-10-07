package Classes;

public class Conta {
    private int id;
    private String descricao;
    private String natureza;
    private boolean principal;
    private boolean status ;

    public Conta(int id, String descricao, String natureza, boolean principal, boolean status) {
        this.id = id;
        this.descricao = descricao;
        this.natureza = natureza;
        this.principal = principal;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNatureza() {
        return natureza;
    }

    public void setNatureza(String natureza) {
        this.natureza = natureza;
    }

    public boolean isPrincipal() {
        return principal;
    }

    public void setPrincipal(boolean principal) {
        this.principal = principal;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}