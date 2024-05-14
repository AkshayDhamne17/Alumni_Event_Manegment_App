package org.AlumniEvent.Model;

public class AlumniModel {
      
	  private int aid;
	  private int Bid;
	  private String aname;
	  private String aemail;
	  private String acontact;
	  private int passwo;
	  private String Address;
	  private String Gender;
	  private int passout_year;
	  
	  public AlumniModel()
	  {
		 
	  }
	  public AlumniModel(int aid,int Bid,String aname,String aemail,String acontact,int passwo,String Address,String Gender,int passout_year )
	  {
		  this.aid=aid;
		  this.Bid=Bid;
		  this.aname=aname;
		  this.aemail=aemail;
		  this.acontact=acontact;
		  this.passwo=passwo;
		  this.Address=Address;
		  this.Gender=Gender;
		  this.passout_year=passout_year;
	  }
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAemail() {
		return aemail;
	}
	public void setAemail(String aemail) {
		this.aemail = aemail;
	}
	public String getAcontact() {
		return acontact;
	}
	public void setAcontact(String acontact) {
		this.acontact = acontact;
	}
	public int getPasswo() {
		return passwo;
	}
	public void setPasswo(int passwo) {
		this.passwo = passwo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getPassout_year() {
		return passout_year;
	}
	public void setPassout_year(int passout_year) {
		this.passout_year = passout_year;
	}
	  
	  
}
