package org.AlumniEvent.Repository;

import java.sql.SQLException;



import org.AlumniEvent.Model.LoginModel;

public class LoginRepository extends DBConfig{
   
	private static String Auser;
	private static String Ouser;
	private String A="Admin";
	private String O="Organizer";
	private String Al="Alumni";
	

	public int  isAdminLogin(LoginModel Lm)
	{   
		boolean b=false;
	  
		try {
		     String loginRole=Lm.getRole();
		     
		 if(loginRole.equals(A))
	        {   		
	
			 stmt=conn.prepareStatement("select cemail,pass from admin");
			 rs=stmt.executeQuery();
			 String un=Lm.getUsername();
			 String pw=Lm.getPassword();
		    
			 while(rs.next())
			 {
				String dn= rs.getString(1);
				String dw= rs.getString(2);
				
				 if(un.equals(dn) && pw.equals(dw))
				 {
					
					 b=true;
				 }
			 }
			 if(b)
		        {
				
		        	return 1;
		        }
		        else {
		        	
		        	return 0;
		        }
	  }
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		 	
			return 0;
		}
		return 0;	
	}
	
	public int isOrganizerLogin(LoginModel Lm)
	{     
	   boolean c=false;
	   try {
		   String loginRole=Lm.getRole();  
	      if(loginRole.equals(O))
		 {	
	    	  String un=Lm.getUsername();
			  String pw=Lm.getPassword();
			  Ouser =un; 
				 
			 stmt=conn.prepareStatement("select oemail,passw from Organizer");
			 rs=stmt.executeQuery();
		
			 while(rs.next())
			 {
				String dn= rs.getString(1);
				String dw= rs.getString(2);
				
				 if(un.equals(dn) && pw.equals(dw))
				 {
					
					 c=true;
				 }
			 }
			 if(c)
		        {
			
		        	return 1;
		        }
		        else {
		    
		        	return 0;
		        }
		 }
	   } 
	   catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		 	
			return 0;
		}
		return 0;
	}
	
	public int isAlumniLogin(LoginModel Lm)
	{
		boolean d=false;
		try {
			   String loginRole=Lm.getRole();  
			 if(loginRole.equals(Al)) 
			 {      
				 String un=Lm.getUsername();
				 String pw=Lm.getPassword();
			    Auser=un;
			    //this.Auser=Auser;
			   
			     
				     stmt=conn.prepareStatement("select aemail,passwo from Alumni");
					 rs=stmt.executeQuery();
					
					 while(rs.next())
					 {
					     String dn= rs.getString(1);
						String dw= rs.getString(2);
						
						 if(un.equals(dn) && pw.equals(dw))
						 {
							
							 d=true;
						 }
					 }
					 if(d)
				        {
					
				        	return 1;
				        }
				        else {
				    
				        	return 0;
				        }
			 }
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		 	
			return 0;
		}
		return 0;
		
	}
	public int getAlumniIDByUserName()
	{   
		try {
			stmt=conn.prepareStatement("select aid from alumni where aemail=?");
			stmt.setString(1,Auser);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				int rid= rs.getInt(1);
				return rid;
			}
			
			else {
				return -1;
			}
		}catch(Exception ex)
		{
			System.out.println("Error is"+ex);
		}
		return 0;
	}
	public int getOrganizerIDByUsername()
	{
		try {
			stmt=conn.prepareStatement("select oid from Organizer where oemail=?");
			stmt.setString(1,Ouser);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				int rid=rs.getInt(1);
				return rid;
			}
			else {
				return -1;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is"+ex);
		}
		return 0;
	}
}
