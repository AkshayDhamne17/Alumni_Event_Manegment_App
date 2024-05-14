package org.AlumniEvent.Model;

public class LoginModel {  
       private String Role;
       private String username;
       private String password;    
       public  LoginModel()
       {
    	   
       }   
       public  LoginModel(String Role, String username, String password)
       {  
    	   this.Role=Role;
    	   this.username=username;
    	   this.password=password;
       } 
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
