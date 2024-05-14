package org.AlumniEvent.Application;
import java.util.List;
import java.util.Scanner;
import org.AlumniEvent.Model.AlumniModel;
import org.AlumniEvent.Model.LoginModel;
import org.AlumniEvent.Model.OrganizerModel;
import org.AlumniEvent.Service.AlumniService;
import org.AlumniEvent.Service.LoginService;
import org.AlumniEvent.Service.OraganizerService;

public class MainApplication {

	public static void main(String[] args) {
		
		AlumniService As=new AlumniService();
		OraganizerService Os=new OraganizerService ();
	   Scanner sc=new Scanner(System.in);
	   LoginService Ls=new LoginService();
		do {
			System.out.println("Login for AlumniEvent Manaegment System");
			System.out.println("============================================================");
			System.out.println("1.Login for Admin");
			System.out.println("2.Login for Organizer");
			System.out.println("3.Login for Alumni");
			System.out.println("============================================================");
			System.out.println("Enter your choice");
          	int choice=sc.nextInt();
			
    		sc.nextLine();
			System.out.println("Enter your role");
			String role=sc.nextLine();
			System.out.println("Enter your username");
			String username=sc.nextLine();
			System.out.println("Enter your password");
			String password=sc.nextLine();
			
			LoginModel Lm=new LoginModel();
			Lm.setRole(role);
			Lm.setUsername(username);
			Lm.setPassword(password);
	     	
		switch(choice)
			{
         case 1:
     			int b=Ls. isAdminLogin(Lm);
     			if(b==1)
     			{ 
     				System.out.println(" Admin Login Successful");
     				do {
     					System.out.println("Welcome Admin");
     					System.out.println("1.Perform Operations on Alumni");
     					System.out.println("2.Take Attendance of Alumni");
     					System.out.println("3.View All Alumnia on the Events");
     					System.out.println("4.View All Absent Alumni");
     					System.out.println("5.Take Feedback From Alumni");
     					System.out.println("6.Sort Alumni by Year");
     					System.out.println("7.Find Most Senior Alumni In the Meet");
     					
     					System.out.println("Enter your choice");
     					int achoice=sc.nextInt();
     					
     					switch(achoice)
     					{
     					
     					case 1:
     						
     						do {
     							System.out.println("Perform Operation on Alumni");
         						System.out.println("1.View Alumni");
         						System.out.println("2.Add Alumni");
         						System.out.println("3.Update Alumni");
         						System.out.println("4.Delete Alumni");
     							System.out.println("Enter Your Choice");
     							int cchoice=sc.nextInt();
     							
         						switch(cchoice)
         						{
         						case 1:
         							System.out.println("The Details of Alumni is");
         							List <AlumniModel> list=As.getAlumniDetails();
         							
         							break;
         						case 2:
         							
         							break;
         						case 3:
         							
         							break;
         						case 4:
         							
         							break;
         							default:
         								System.out.println("Wrong Choice");
         						}
         						
     						    }while(true);
     						
						case 2:
     						
     						break;
     						
     					case 3:
     						
     						break;
     						
     					case 4:
     						
     						break;
     						
     					case 5:
     						
     						break;
     						
     						default:
     							System.out.println("Wrong Choice");
     							break;
     					}
     					  }while(true);
     			}
     			else {
     				System.out.println("not valid");
     			}
		break;
				
		case 2:
				int c=Ls.isOrganizerLogin(Lm);
		     	if(c==1)
				{
			       System.out.println("Organizer Login Successful");
			       
			       do {
			    	   System.out.println("Hello Organizer");
			    	   System.out.println("1.View My Profile");
			    	   System.out.println("2.Update My Profile");
			    	   System.out.println("3.Organize An Event");
			    	   System.out.println("4.Show The Events");
			    	   System.out.println("Enter Your Choice");
			    	   int ochoice=sc.nextInt();
			    	   
			    	   switch(ochoice)
			    	   {
			    	   case 1:
			    		   sc.nextLine();
			    		   System.out.println("Organizer Your Information");
			    		   System.out.println("============================================================================================");
			    		   OrganizerModel Om=Os.viewMyProfile();
			    		   System.out.println("ID"+"\t"+"Name"+"\t"+"Email"+"\t"+"Contact"+"\t\t"+"Password"+"\t"+"Address");
			    		   System.out.println(Om.getOid()+"\t"+Om.getOname()+"\t"+Om.getOemail()+"\t"+Om.getOcontact()+"\t"+Om.getPassw()+"\t"+Om.getAddress());
			    		   System.out.println("============================================================================================");
			    		   break;
			    		   
			    	   case 2:
			    		   sc.nextLine();
			    		   System.out.println("Enter Your Information To Update");
			    		   System.out.println("Enter Updated Contact");
			    		   String Contact=sc.nextLine();
			    		   System.out.println("Enter Updated Address");
			    		   String Address=sc.nextLine();
			    		   int ou=Os.isUpdateOrganizer(Contact,Address);
			    		   if(ou==1)
			    		   {
			    			   System.out.println("Your Information Is Updated SucessFully");
			    		   }
			    		   else {
			    			   System.out.println("Some Problem Is There..........");
			    		   }
			    		   
			    		   break;
			    		   
			    	   case 3:
			    		   
			    		   break;
			    		   
			          default:
			    		      System.out.println("Wrong Choice");
			    	   }
			       }while(true); 
			    }
			   else 
     			{
			    System.out.println("not valid");
			    }
		      break;
				
		case 3:
		     	int d=Ls.isAlumniLogin(Lm);
		     	if(d==1)
				{
			       System.out.println("Alumni Login Successful");
			       do {
			    	   System.out.println("Welcome Alumni....");
			    	   System.out.println("1.View My Profile");
			    	   System.out.println("2.Update My Profile");
			    	   System.out.println("3.Show My Events/Meets");
			    	   System.out.println("Enter Your Choice");
			    	   int achoice=sc.nextInt();
			    	   switch(achoice)
			    	   {
			    	   case 1:
			    		   sc.nextLine();
			    		   System.out.println("Alumni your Information");
			    		   System.out.println("=============================================================================================================================================");
			    		     AlumniModel am=As.viewMyProfile();
			    		     System.out.println("Id"+"\t"+"BranchId"+"\t"+"Name"+"\t"+"Email"+"\t"+"Contact"+"\t"+"Password"+"\t"+"Address"+"\t"+"Gender"+"\t"+"Passout_Year");
			    		     System.out.println(am.getAid()+"\t"+am.getBid()+"\t"+am.getAname()+"\t"+am.getAemail()+"\t"+am.getAcontact()+"\t"+am.getPasswo()+"\t"+am.getAddress()+"\t"+am.getGender()+"\t"+am.getPassout_year());
			    		     System.out.println("=============================================================================================================================================");
			    		   break;
			    		   
			    	   case 2:
			    		   
			    		   sc.nextLine();
			    		   
			    		   System.out.println("Enter Your Information to Update");
			    		   System.out.println("Enter your Contact");
			    		   String Contact=sc.nextLine();
			    		  System.out.println("Enter your Address");
			    		  String Address=sc.nextLine();
			    		
			    		  int Au=As.isUpdateAlumni(Contact,Address);
			    		if(Au==1)
			    		{
			    			System.out.println("Your Information Is Updated Successfully");
			    		}
			    		else {
			    			
			    			System.out.println("Some Problem is there.....................");
			    		}
			    				
			    		   break;
			    		   
			    	   case 3:
			    		   
			    		   break;
			    		   
			    		   default:
			    			   System.out.println("Wrong choice");
			    			   break;
			    	   }
			    	   
			       }while(true);
			    }
			   else 
			   {
			      System.out.println("not valid");
			   }
	    break;
				
		default:
		    	System.out.println("Wrong choice");
		break;
 	    }
		
		}while(true);	
	}
}
