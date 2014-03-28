
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin
 */
public class Beer {
    public List getBrands(String color){
        List brands = new ArrayList();
        if(color.equals("brown")){
            brands.add("Jack Daniels is brown");
        }else if(color.equals("dark")){
            brands.add("You chose dark you voldemort!");
        }
        return brands;
    }
}
