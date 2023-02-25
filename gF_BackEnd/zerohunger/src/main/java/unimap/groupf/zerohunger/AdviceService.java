package unimap.groupf.zerohunger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AdviceService {
    
    @Autowired
    private JpaRepository<NutrientAdvice, Long> adviceRepository;
    
    public List<NutrientAdvice> getAllAdvice() {
        return adviceRepository.findAll();
    }
    
    public NutrientAdvice getAdviceById(Long id) {
        return adviceRepository.findById(id).orElse(null);
    }
    
    public void saveAdvice(NutrientAdvice advice) {
        adviceRepository.save(advice);
    }
    
    public void deleteAdviceById(Long id) {
        adviceRepository.deleteById(id);
    }
}
