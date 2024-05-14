package org.AlumniEvent.Model;

public class EventModel {
    private int Eid;
    private int Bid;
    private String ename;
    private String email;
    private String description;
    private String venue;
    
    public EventModel()
    {
    	
    }
    public EventModel(int Eid,int Bid,String ename,String email,String description,String venue)
    {
    	this.Eid=Eid;
    	this.Bid=Bid;
    	this.ename=ename;
    	this.email=email;
    	this.description=description;
    	this.venue=venue;
    }
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
    
}
