package sg.dbs.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import sg.dbs.seed.model.Loan;

@Component
public interface LoanRepo extends JpaRepository<Loan, Integer> {
}