package model.bean;

import java.sql.Date;

public class Escola {
    private long    idEscola;
    private String  cnpj;
    private String  nomeFantasia;
    private String  razaoSocial;
    private long    idPontuacao;
    private long    idEndereco;
    private Date    data;
    private int     ativo;
    
    public Escola(){
    }

    public long getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(long idEscola) {
        this.idEscola = idEscola;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public long getIdPontuacao() {
        return idPontuacao;
    }

    public void setIdPontuacao(long idPontuacao) {
        this.idPontuacao = idPontuacao;
    }

    public long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getAtivo() {
        return ativo;
    }

    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }    
}