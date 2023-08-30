package cnuswacademy.balancetalk.domain.game.dto.response;

import cnuswacademy.balancetalk.domain.game.entity.Game;
import lombok.Builder;
import lombok.Data;

@Data
public class GameResponse {

    private String title;

    @Builder
    public GameResponse(Long id, String title) {
        this.title = title;
    }

    public static GameResponse from(Game game) {
        return GameResponse.builder()
                .title(game.getTitle())
                .build();
    }
}
