package cnuswacademy.balancetalk.domain.game.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cnuswacademy.balancetalk.domain.game.application.GameService;
import cnuswacademy.balancetalk.domain.game.dto.request.GameRequest;
import cnuswacademy.balancetalk.domain.game.dto.response.GameResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class GameController {

    private final GameService service;

    @PostMapping("/game")
    public GameResponse createGame(@RequestBody GameRequest request) {
        return service.createGame(request);
    }
}
