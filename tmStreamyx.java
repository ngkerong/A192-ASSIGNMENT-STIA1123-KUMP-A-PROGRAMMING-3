/*Name:NG KE RONG*/
/*No.Matrik:271063*/

package internetgui;

import java.text.DecimalFormat;

public class tmStreamyx extends Wifi {
    
    private final String newName = "TM Streaymx";
    private final double newPrice = 66.00;
    private final int newSpeed = 1;
            
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
        
        return "Free local calls\nFree 3 years warranty";
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