package cnuswacademy.balancetalk.domain.game.entity;

import cnuswacademy.balancetalk.domain.game.dto.request.GameRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Game {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    @Builder
    public Game(String title) {
        this.title = title;
    }

    public static Game from(GameRequest gameRequest) {
        return Game.builder()
                .title(gameRequest.getTitle())
                .build();
    }
}
