package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.Catalog;
import kz.aitu.java.crud.entity.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends CrudRepository<File, Long> {
}
