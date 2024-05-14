package org.AlumniEvent.Service;


import java.util.List;

import org.AlumniEvent.Model.AlumniModel;
import org.AlumniEvent.Repository.AlumniRepository;

public class AlumniService {
	
	AlumniRepository Ar=new AlumniRepository();
	
	public int isUpdateAlumni(String Contact,String Address)
	{
		
	    return Ar.isUpdateAlumni(Contact,Address)>0?1:0;
	}
    public AlumniModel viewMyProfile()
    {
    	AlumniModel model= Ar.viewMyProfile();
    	if(model != null)
    	{
    		return model;
    	}
    	else {
    		return null;
    }
    
    		
    }
	public List<AlumniModel> getAlumniDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
