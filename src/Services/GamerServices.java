package Services;

import Entities.Gamer;

public interface GamerServices{
	void updateGamer(Gamer gamer);
	void delete(Gamer gamer);
	Gamer register(Gamer gamer);
}
