package kz.aitu.java.crud.service;


import kz.aitu.java.crud.entity.Authorization;

import kz.aitu.java.crud.repository.AuthorizationRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorizationService {
    private final AuthorizationRepository authorizationRepository;

    public List<Authorization> getAll(){
        return (List<Authorization>) authorizationRepository.findAll();
    }


    public Authorization save(Authorization authorization) {
        return authorizationRepository.save(authorization);
    }

    public Authorization getById (Long ID) {

        return authorizationRepository.findById(ID).orElse(null);

    }

    public Authorization update(Authorization authorization) {
        return authorizationRepository.save(authorization);
    }


    public void deleteById(Long ID) {
        authorizationRepository.deleteById(ID);
    }



}
