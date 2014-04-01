
import java.io.Serializable;

public class FormBean implements Serializable{
    String fName;
    String lName;
    String telephone;
    String email;
    String company;
    public FormBean(){
        
    }
    public String getCompany(){
        return company;
    }
    public String getfName(){
        return fName;
    }
    public String getlName(){
        return lName;
    }
    public String getTelephone(){
        return telephone;
    }
    public String getEmail(){
        return email;
    }
    public void setfName(String a){
        fName = a;
    }
    public void setCompany(String a){
        company = a;
    }
    public void setlName(String a){
        lName = a;
    }
    public void setTelephone(String a){
        telephone = a;
    }
    public void setEmail(String a){
        email = a;
    }
    
    
}
