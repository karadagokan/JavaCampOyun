package Services;

import Entities.Gamer;


public class GamerManager implements GamerServices{

	GamerCheckIfRealService gamerCheckIfRealService; 
	
	public GamerManager(GamerCheckIfRealService gamerCheckIfRealService) {
		this.gamerCheckIfRealService=gamerCheckIfRealService;
	}
	

	@Override
	public void updateGamer(Gamer gamer) {
		if(gamerCheckIfRealService.checkGamer(gamer)) {
			System.out.println("Updated : "+gamer.firstName);
		}else {
			System.out.println("Bilgilerinizi kontrol ediniz.");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		if(gamerCheckIfRealService.checkGamer(gamer)) {
			System.out.println("deleted : "+gamer.firstName);
		}else {
			System.out.println("Bilgilerinizi kontrol ediniz.");
		}
	}

	@Override
	public Gamer register(Gamer gamer) {
		if(gamerCheckIfRealService.checkGamer(gamer)) {
			System.out.println("Registered : "+gamer.firstName+" "+gamer.lastName);
			return gamer;
		}else {
			System.out.println("Bilgilerinizi kontrol ediniz.");
			return null;
		}
	}
	
}
