package kz.aitu.java.crud.controller;

import kz.aitu.java.crud.entity.ActivityJournal;
import kz.aitu.java.crud.service.ActivityJournalService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class ActivityJournalController {

    private ActivityJournalService activityJournalService;

    @GetMapping("/api/journal")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(activityJournalService.getAll());
    }

    @PostMapping("api/journal")
    public ResponseEntity<?> createActiveJournal(@RequestBody ActivityJournal activityJournal){
       return ResponseEntity.ok(activityJournalService.save(activityJournal));
    }

    @GetMapping("/api/journal/{ID}")
    public ResponseEntity<?> getById(@PathVariable Long ID) {
        return ResponseEntity.ok(activityJournalService.getById(ID));
    }
    @PutMapping("api/journal/{ID}")
    public  ResponseEntity<?> update(@RequestBody ActivityJournal activityJournal){
        return ResponseEntity.ok(activityJournalService.update(activityJournal));

    }
    @DeleteMapping ("/api/journal/{ID}")
    public void deleteById(@PathVariable Long ID) {
        activityJournalService.deleteById(ID);
    }




}
