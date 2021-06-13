package com.ozturksezgin.service;

import com.ozturksezgin.model.Campaign;

public class CampaignService {
    public void addCampaign(Campaign campaign){
        System.out.println(campaign.getCampaignCode() + " kampanyası eklendi.");
    }

    public void updateCampaign(Campaign campaign){
        System.out.println(campaign.getCampaignCode() + " kampanyası güncellendi.");
    }

    public void deleteCampaign(Campaign campaign){
        System.out.println(campaign.getCampaignCode() + " kampanyası silindi.");
    }
}
