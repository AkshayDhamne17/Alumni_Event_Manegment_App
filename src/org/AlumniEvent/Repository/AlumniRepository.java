package org.AlumniEvent.Repository;

import java.util.List;

import org.AlumniEvent.Model.AlumniModel;


public class AlumniRepository extends DBConfig{
	
	LoginRepository lr=new LoginRepository();
	
	   public int isUpdateAlumni(String Contact,String Address)
	   {  
		 int uaid=lr.getAlumniIDByUserName();
	
		 try {
			 stmt=conn.prepareStatement("update alumni set acontact=?,Address=? where Aid= "+uaid);
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
			 System.out.println("Exception is"+ex);
			 return 0;
		 }   
	   }
	   public AlumniModel viewMyProfile()
	   {
		   AlumniModel amodel=null;
		 int vaid=lr.getAlumniIDByUserName();
		 try {
			 stmt=conn.prepareStatement("select *from alumni where aid ="+vaid);
			 rs=stmt.executeQuery();
			 while(rs.next())
			 {
				 amodel=new AlumniModel();
				 amodel.setAid(rs.getInt(1));
				 amodel.setBid(rs.getInt(2));
				 amodel.setAname(rs.getString(3));
				 amodel.setAemail(rs.getString(4));
				 amodel.setAcontact(rs.getString(5));
				 amodel.setPasswo(rs.getInt(6));
				 amodel.setAddress(rs.getString(7));
				 amodel.setGender(rs.getString(8));
				 amodel.setPassout_year(rs.getInt(9));
			 }
			 if(amodel!=null)
			 {
				 return amodel;
			 }
			 else {
				 return null;
			 }
		 }
		 catch(Exception ex)
		 {
			 System.out.println("Exception is"+ex);
			 return null;
		 } 
	   }
	   
	    public List<AlumniModel>getAlumniDetails()
	   {
		   return null;
	   }
}
