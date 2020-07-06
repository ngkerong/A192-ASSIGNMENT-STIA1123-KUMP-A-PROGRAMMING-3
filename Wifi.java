/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetgui;

/**
 *
 * @author HP
 */
public class Wifi {
  private String Internet;
    private int Valid;
    
    Wifi(){
        
        this.Internet = "Unlimited";
        this.Valid = 30;
    }
    
    String getInternet(){
        
        return Internet;
    }
    
    int getValid(){
        
        return Valid;
    }
    
    
    public String special(){
        
        return "It is ecosystem.\nIt can reduce Human's effect.\nIt connectes each of computers together.\nIt easily communicate though worldwide.\nIt can share data and resources";
        
    }
    
    
}
