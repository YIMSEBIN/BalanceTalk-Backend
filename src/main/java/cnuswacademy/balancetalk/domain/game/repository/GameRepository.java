package cnuswacademy.balancetalk.domain.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cnuswacademy.balancetalk.domain.game.entity.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
}
