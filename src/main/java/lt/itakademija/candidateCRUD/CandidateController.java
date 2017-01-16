package lt.itakademija.candidateCRUD;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CandidateController {

    private CandidateRepository candidateRepository;

    @Autowired
    public CandidateController(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)   
    public List<CandidateEntity> getAll(){
        return candidateRepository.findAll();
    }



    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<CandidateEntity> create(@RequestBody CandidateEntity candidate){
    	candidateRepository.save(candidate);

        return candidateRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    
    public List<CandidateEntity> remove(@PathVariable long id){
    	candidateRepository.delete(id);

        return candidateRepository.findAll();
    }
}
