package school.hei.geotiler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.geotiler.repository.model.DetectedTile;

@Repository
public interface DetectedTileRepository extends JpaRepository<DetectedTile, String> {}