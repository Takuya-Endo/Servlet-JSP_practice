package siteEV.model;

public class SiteEVLogic {
	
	public void addLike(SiteEV siteEV) {
		siteEV.setLike(siteEV.getLike() + 1);
	}
	
	public void addDislike(SiteEV siteEV) {
		siteEV.setDislike(siteEV.getDislike() + 1);
	}
	
}
