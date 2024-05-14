package org.AlumniEvent.Service;

import org.AlumniEvent.Model.OrganizerModel;
import org.AlumniEvent.Repository.OrganizerRepository;

public class OraganizerService {
      
	 OrganizerRepository Or=new OrganizerRepository();
	 
	 public OrganizerModel viewMyProfile()
	 {
		 OrganizerModel model=Or.viewMyProfile();
		if(model !=null)
		{
			return model;
		}
		else {
			return null;
		}
	 }
	 public int isUpdateOrganizer(String Contact,String Address)
	 {
		return Or.isUpdateOrganizer(Contact,Address)>0?1:0;
	 }
	 
}
