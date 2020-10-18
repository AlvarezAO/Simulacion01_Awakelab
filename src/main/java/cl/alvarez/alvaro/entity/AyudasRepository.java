package cl.alvarez.alvaro.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AyudasRepository extends JpaRepository<Ayudas, Integer> {

}
