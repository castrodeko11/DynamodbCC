package br.com.aco.DynamodbApp.Dto;

import br.com.aco.DynamodbApp.entity.Costumer;
import br.com.aco.DynamodbApp.entity.Spec;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

public class CostumerDTO {
    private static final long serialVersionUID = 6318931228062100559L;

    @JsonProperty("company_name")
    @NotNull
    @NotBlank
    private String companyName;

    @JsonProperty("company_document_number")
    @NotNull
    @NotBlank
    private String companyDocumentNumber;

    @JsonProperty("phone_number")
    @NotNull
    @NotBlank
    private String phoneNumber;

    @JsonProperty("active")
    private Boolean active;

    private Spec spec;

    private LocalDate createdDate;

    public Costumer costumerDTOToCostumer() {
        return new Costumer(
                this.companyName,
                this.companyDocumentNumber,
                this.phoneNumber,
                true,
                this.spec,
                this.createdDate

        );
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyDocumentNumber() {
        return companyDocumentNumber;
    }

    public void setCompanyDocumentNumber(String companyDocumentNumber) {
        this.companyDocumentNumber = companyDocumentNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Spec getSpec() {
        return spec;
    }

    public void setSpec(Spec spec) {
        this.spec = spec;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }
}
