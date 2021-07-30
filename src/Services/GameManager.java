package Services;

import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void salesGame(Game game, Gamer gamer) {
		System.out.println(game.gameName + " adlý oyunu " + gamer.firstName + " adlý oyuncu satýn aldý.");

	}

}
