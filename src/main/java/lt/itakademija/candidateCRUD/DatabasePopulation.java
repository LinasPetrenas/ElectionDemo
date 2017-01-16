package lt.itakademija.candidateCRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabasePopulation implements CommandLineRunner {
    private CandidateRepository candidateRepository;

    @Autowired
    public DatabasePopulation(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<CandidateEntity> candidates = new ArrayList<>();

        candidates.add(new CandidateEntity("Petras", "Petraitis"));
        candidates.add(new CandidateEntity("Jonas", "Jonaitis"));
        candidates.add(new CandidateEntity("Ona", "Onaite"));

        candidateRepository.save(candidates);
    }
}
