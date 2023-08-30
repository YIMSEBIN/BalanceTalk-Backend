package cnuswacademy.balancetalk.domain.game.application;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cnuswacademy.balancetalk.domain.game.dto.request.GameRequest;
import cnuswacademy.balancetalk.domain.game.dto.response.GameResponse;
import cnuswacademy.balancetalk.domain.game.entity.Game;
import cnuswacademy.balancetalk.domain.game.repository.GameRepository;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public GameResponse createGame(GameRequest gameRequest) {
        Game game = gameRepository.save(Game.from(gameRequest));
        return GameResponse.from(game);
    }
}
