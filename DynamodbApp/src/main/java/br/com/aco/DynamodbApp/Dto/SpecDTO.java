package br.com.aco.DynamodbApp.Dto;

import br.com.aco.DynamodbApp.entity.Costumer;
import br.com.aco.DynamodbApp.entity.Spec;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SpecDTO {

    @NotNull
    @NotBlank
    private String profissao;

    @NotNull
    @NotBlank
    private String status;

    public Spec costumerDTOToCostumer() {
        return new Spec(
                this.profissao,
                this.status

        );
    }

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
