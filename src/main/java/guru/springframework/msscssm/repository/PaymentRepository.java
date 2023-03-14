package guru.springframework.msscssm.repository;

import guru.springframework.msscssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Danillo Postatni Moreno on 13/03/2023
 */
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
