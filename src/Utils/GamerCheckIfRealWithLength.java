package Utils;

import Entities.Gamer;
import Services.GamerCheckIfRealService;

//Simüle edildi.
public class GamerCheckIfRealWithLength implements GamerCheckIfRealService {

	public boolean checkGamer(Gamer gamer) {
		if (gamer.firstName.length() > 2 && gamer.lastName.length() > 2 && gamer.birtOfYear > 1900
				&& gamer.nationalityId.length() == 11) {
			return true;
		} else {
			System.out.println("Böyle bir vatandaþ yok lütfen bilgilerinizi kontrol edin.");
			new Exception("Kullanýcý Oluþturulamadý");
			return false;
		}
	}

}
