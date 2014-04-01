
import java.io.Serializable;

public class FormBean implements Serializable{
    String fName="kevin";
    String lName="qi";
    String telephone="1231231234";
    String email = "a@yahoo.com";
    public FormBean(){
        
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
