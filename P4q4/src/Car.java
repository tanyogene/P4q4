
public class Car {
    private String platenumber;
    private String color;
    private int year;
   

    public Car(String platenumber, String color, int year) {
        this.platenumber = platenumber;
        this.color = color;
        this.year = year;
       
    }
    
    
    
    public String toString(){
        return String.format("%-10s %-8s %-8d" , platenumber, color , year);
        
        
    }
    
      
          
        
}
