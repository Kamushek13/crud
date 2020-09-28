package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.Catalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends CrudRepository <Catalog, Long> {
}
