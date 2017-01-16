package lt.itakademija.candidateCRUD;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CandidateRepository extends JpaRepository<CandidateEntity, Long>{
    
}
