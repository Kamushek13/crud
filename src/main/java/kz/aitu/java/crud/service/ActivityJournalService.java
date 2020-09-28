package kz.aitu.java.crud.service;

import kz.aitu.java.crud.entity.ActivityJournal;
import kz.aitu.java.crud.repository.ActivityJournalRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ActivityJournalService {
    private final ActivityJournalRepository activityJournalRepository;

    public List<ActivityJournal> getAll(){
        return (List<ActivityJournal>) activityJournalRepository.findAll();
    }


    public ActivityJournal save(ActivityJournal activityJournal) {
        return activityJournalRepository.save(activityJournal);
    }

    public ActivityJournal getById (Long ID) {

        return activityJournalRepository.findById(ID).orElse(null);

    }

    public ActivityJournal update(ActivityJournal activityJournal) {
        return activityJournalRepository.save(activityJournal);
    }

    public void deleteById(Long ID) {
        activityJournalRepository.deleteById(ID);
    }


}
