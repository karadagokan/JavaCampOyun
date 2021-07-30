package Utils;

import Entities.Gamer;
import Services.GamerCheckIfRealService;

//Sim�le edildi.
public class GamerCheckIfRealWithLength implements GamerCheckIfRealService {

	public boolean checkGamer(Gamer gamer) {
		if (gamer.firstName.length() > 2 && gamer.lastName.length() > 2 && gamer.birtOfYear > 1900
				&& gamer.nationalityId.length() == 11) {
			return true;
		} else {
			System.out.println("B�yle bir vatanda� yok l�tfen bilgilerinizi kontrol edin.");
			new Exception("Kullan�c� Olu�turulamad�");
			return false;
		}
	}

}
