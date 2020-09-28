package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.CatalogCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogCaseRepository extends CrudRepository <CatalogCase, Long> {
}
