package org.AlumniEvent.Service;

import org.AlumniEvent.Model.LoginModel;
import org.AlumniEvent.Repository.LoginRepository;

public class LoginService {
	
	LoginRepository Lr=new LoginRepository();
	
	public int isAdminLogin(LoginModel Lm)
	{ 
         int value=Lr.isAdminLogin(Lm);
         if(value==1)
         {  
        	
        	 return 1;
         }
         else {
        	
        	 return 0;
         }
	}

    public int isOrganizerLogin(LoginModel Lm)
    {
    	int value=Lr.isOrganizerLogin(Lm);
    	 if(value==1)
         {
        	 return 1;
         }
         else 
         {
        	 return 0;
         }
    }
    
    public int isAlumniLogin(LoginModel Lm)
    {
    	int value=Lr.isAlumniLogin(Lm);
    	 if(value==1)
         {
        	 return 1;
         }
         else 
         {
        	 return 0;
         }
    }
}
