package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.Nomenclature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NomenclatureRepository extends CrudRepository <Nomenclature, Long> {
}
