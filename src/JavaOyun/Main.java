package JavaOyun;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Services.CampaignManager;
import Services.GameManager;
import Services.GamerManager;
import Utils.GamerCheckIfRealWithLength;

public class Main {

	public static void main(String[] args) {

		GamerManager gamerManager = new GamerManager(new GamerCheckIfRealWithLength());

		Gamer gamer = gamerManager.register(new Gamer(0, "12345678765", "Okan", "Karadað", 1995));
				

		if( gamer != null) {
			Campaign campaign = new Campaign(0, "3 Al 1 Öde");

			Game game = new Game(0, "Call Of Duty", 199, campaign);

			GameManager gameManager = new GameManager();

			gameManager.salesGame(game, gamer);
			
			gamerManager.delete(gamer);
			
			CampaignManager campaignManager=new CampaignManager();
			campaignManager.deleteCampaign(campaign);
			
			Campaign campaign2=new Campaign(1, "Saat 24.00 a kadar indirim");
			
			campaignManager.addCampaign(campaign2);
		}
		
		

	}

}
