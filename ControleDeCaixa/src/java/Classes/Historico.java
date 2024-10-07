package Classes;

public class Historico {
    private int id;
    private String descricao;
    private boolean complemento;
    private boolean status;

    public Historico(int id, String descricao, boolean complemento, boolean status) {
        this.id = id;
        this.descricao = descricao;
        this.complemento = complemento;
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

    public boolean isComplemento() {
        return complemento;
    }

    public void setComplemento(boolean complemento) {
        this.complemento = complemento;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}