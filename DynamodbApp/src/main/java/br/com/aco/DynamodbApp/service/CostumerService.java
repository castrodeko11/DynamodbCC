package br.com.aco.DynamodbApp.service;

import br.com.aco.DynamodbApp.Dto.CostumerDTO;
import br.com.aco.DynamodbApp.entity.Costumer;

import java.util.List;

public interface CostumerService {
    Costumer saveCostumer(CostumerDTO costumerDTO);

    List<Costumer> findAllCostumers();

    List<Costumer> findByCompanyName(String companyName);

    Costumer updateCostumer(CostumerDTO costumerDTO);

    Costumer disableCostumer(String companyDocumentNumber);
}