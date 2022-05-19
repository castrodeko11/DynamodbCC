package br.com.aco.DynamodbApp.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
@DynamoDBDocument
public class Spec {

    public Spec() {
    }

    public Spec(String profissao, String status) {
        this.profissao = profissao;
        this.status = status;
    }

    private String profissao;

    private String status;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
