/*NAME:NG KE RONG*/
/*No.Matrik:271063*/

package internetgui;

import java.text.DecimalFormat;

public class Time extends Wifi{
    
    private final String newName = "Time";
    private final double newPrice = 89.00;
    private final int newSpeed = 60;
    
    public String getName() {
        
        return newName;
    }
    
    public double getPrice() {
        
        return newPrice;
    }
    
    public int getSpeed() {
        
        return newSpeed;
    }
     
     public String special(String cable){
         
         return cable;
    }
    
    @Override
    public String special(){
        
        return "Free of changes for first two month\nFree TV Box and 20+ channels";
    }

    
    public String display(){
        
        DecimalFormat DF = new DecimalFormat ("0.00");
        return "Category you pick : " + newName + "\n" + 
               "Amount Price : RM" + DF.format(newPrice) + "\n" +
               "Internet Speed : " + newSpeed + " Mbps" + " " + getInternet() + "\n" +
               "Valid Day : " + getValid() + "\n" + 
               "Special :" + "\n" + super.special() + "\n" + special() + "\n";
    }
        
    
}

