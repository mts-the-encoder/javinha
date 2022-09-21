package school.sptech.projetoormads.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.sptech.projetoormads.entities.MusicaEntity;

@Repository
public interface MusicaRepository extends JpaRepository<MusicaEntity, Integer> {
}
