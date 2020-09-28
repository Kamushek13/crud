package kz.aitu.java.crud.controller;

import kz.aitu.java.crud.entity.CaseIndex;
import kz.aitu.java.crud.service.CaseIndexService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class CaseIndexController {
    private CaseIndexService caseIndexService;

    @GetMapping("/api/case_index")
    public  ResponseEntity<?> getAll() {
        return ResponseEntity.ok(caseIndexService.getAll());
    }

    @PostMapping("/api/case_index")
    public ResponseEntity<?> createCaseIndex(@RequestBody CaseIndex caseIndex){
        return ResponseEntity.ok(caseIndexService.save(caseIndex));
    }

    @GetMapping("/api/case_index")
    public ResponseEntity<?> getById(@PathVariable Long ID){
        return ResponseEntity.ok(caseIndexService.getById(ID));
    }

    @PutMapping("/api/case_index")
    public ResponseEntity<?> update(@RequestBody  CaseIndex caseIndex){
        return ResponseEntity.ok(caseIndexService.update(caseIndex));
    }

    @DeleteMapping("/api/case_index")
    public void deleteById(@PathVariable Long ID){
        caseIndexService.deleteById(ID);
    }
}
