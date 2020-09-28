package kz.aitu.java.crud.repository;

import kz.aitu.java.crud.entity.ActivityJournal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActivityJournalRepository extends CrudRepository <ActivityJournal, Long> {

}
