package Services;

import Entities.Campaign;

public class CampaignManager implements CampaignService{
	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+" kampanyasý aktif edildi");
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+" kampanyasý silindi");
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println(campaign.campaignName+" güncellendi.");
	}
}