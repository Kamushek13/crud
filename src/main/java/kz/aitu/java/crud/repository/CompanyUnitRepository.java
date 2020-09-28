package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.CompanyUnit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyUnitRepository extends CrudRepository<CompanyUnit, Long> {
}
