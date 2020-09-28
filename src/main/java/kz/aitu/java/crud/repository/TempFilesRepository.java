package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.TempFiles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempFilesRepository extends CrudRepository <TempFiles, Long> {
}
