package kz.aitu.java.crud.repository;


import kz.aitu.java.crud.entity.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository <Company, Long> {
}
