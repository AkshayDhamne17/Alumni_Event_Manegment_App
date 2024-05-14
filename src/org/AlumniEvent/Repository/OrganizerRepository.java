package org.AlumniEvent.Repository;

import org.AlumniEvent.Model.OrganizerModel;

public class OrganizerRepository extends DBConfig{
         
	LoginRepository lr=new LoginRepository();
	
	public int isUpdateOrganizer(String Contact,String Address)
	{
		int uoid=lr.getOrganizerIDByUsername();
		
		try {
			System.out.println("contact is"+Contact);
			System.out.println("Address is"+Address);
			stmt=conn.prepareStatement("update Organizer set ocontact=?,Address=? where oid="+uoid);
			
			stmt.setString(1,Contact);
			stmt.setString(2,Address);

			int value=stmt.executeUpdate();
			if(value==1)
			{
				return 1;
			}
			else {
				return 0;
			}
		}
		catch(Exception ex)
		{
			
			System.out.println("Exception is "+ex);
			return 0;
		}
	}
	
	public OrganizerModel viewMyProfile()
	{
		OrganizerModel omodel=null;
		
		int uoid=lr.getOrganizerIDByUsername();
		try {
			stmt=conn.prepareStatement("select *from Organizer where oid="+uoid);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				omodel=new OrganizerModel();
				omodel.setOid(rs.getInt(1));
				omodel.setOname(rs.getString(2));
				omodel.setOemail(rs.getString(3));
				omodel.setOcontact(rs.getString(4));
				omodel.setPassw(rs.getInt(5));
				omodel.setAddress(rs.getString(6));
			}
			if(omodel !=null)
			{
				return omodel;
			}
			else {
				return null;
			}
			
		}catch(Exception ex)
		{
			System.out.println("Exception is"+ex);
			return null;
		}
		
	}
}
