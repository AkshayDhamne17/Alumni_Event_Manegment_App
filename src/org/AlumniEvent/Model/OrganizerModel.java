package org.AlumniEvent.Model;

public class OrganizerModel {

	    private int oid;
	    private String oname;
	    private String oemail;
	    private String ocontact;
	    private int passw;
	    private String Address;

		public OrganizerModel()
	    {
	    	
	    }
	    
	    public OrganizerModel(int oid,String oname,String oemail,String ocontact,int passw,String Address)
	    {
	    	this.oid=oid;
	    	this.oname=oname;
	    	this.oemail=oemail;
	    	this.ocontact=ocontact;
	    	this.passw=passw;
	    	this.Address=Address;
	    }
	    
		public int getOid() {
			return oid;
		}
		public void setOid(int oid) {
			this.oid = oid;
		}
		public String getOname() {
			return oname;
		}
		public void setOname(String oname) {
			this.oname = oname;
		}
		public String getOemail() {
			return oemail;
		}
		public void setOemail(String oemail) {
			this.oemail = oemail;
		}
		public String getOcontact() {
			return ocontact;
		}
		public void setOcontact(String ocontact) {
			this.ocontact = ocontact;
		}
		public int getPassw() {
			return passw;
		}
		public void setPassw(int passw) {
			this.passw = passw;
		}
	    public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
	    
}
