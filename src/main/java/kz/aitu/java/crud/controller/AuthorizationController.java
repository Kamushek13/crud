package kz.aitu.java.crud.controller;

import kz.aitu.java.crud.entity.Authorization;
import kz.aitu.java.crud.service.AuthorizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
public class AuthorizationController {

    private AuthorizationService authorizationService;

    @GetMapping("/api/authorization")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(authorizationService.getAll());
    }

    @PostMapping("api/authorization")
    public ResponseEntity<?> createAuthorization(@RequestBody Authorization authorization){
        return ResponseEntity.ok(authorizationService.save(authorization));
    }

    @GetMapping("/api/authorization/{ID}")
    public ResponseEntity<?> getById(@PathVariable Long ID) {
        return ResponseEntity.ok(authorizationService.getById(ID));
    }
    @PutMapping("api/authorization/{ID}")
    public  ResponseEntity<?> update(@RequestBody Authorization authorization){
        return ResponseEntity.ok(authorizationService.update(authorization));

    }
    @DeleteMapping ("/api/authorization/{ID}")
    public void deleteById(@PathVariable Long ID) {
        authorizationService.deleteById(ID);
    }




}
