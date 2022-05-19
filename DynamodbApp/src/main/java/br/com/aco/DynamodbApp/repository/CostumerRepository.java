package br.com.aco.DynamodbApp.repository;

import br.com.aco.DynamodbApp.entity.Costumer;
import br.com.aco.DynamodbApp.entity.Spec;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

@EnableScan
public interface CostumerRepository
extends CrudRepository<Costumer, String> {
    List<Costumer> findByCompanyName(String companyName);
    Optional<Costumer> findByCompanyDocumentNumber(String companyDocumentNumber);

}
