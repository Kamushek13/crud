package kz.aitu.java.crud.service;


import kz.aitu.java.crud.entity.CaseIndex;
import kz.aitu.java.crud.repository.CaseIndexRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CaseIndexService {
    private final CaseIndexRepository caseIndexRepository;

    public List<CaseIndex> getAll() {
        return (List<CaseIndex>) caseIndexRepository.findAll();

    }

    public CaseIndex save(CaseIndex caseIndex) {
        return caseIndexRepository.save(caseIndex);
    }


    public CaseIndex getById (Long ID) {

        return caseIndexRepository.findById(ID).orElse(null);

    }

    public CaseIndex update(CaseIndex caseIndex) {
        return caseIndexRepository.save(caseIndex);
    }

    public void deleteById(Long ID) {
        caseIndexRepository.deleteById(ID);

    }
}
