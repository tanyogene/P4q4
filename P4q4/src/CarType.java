
public class CarType {
    private String make;
    private String model;
    private double capacity;
    
    CarType(){
     this("","",0.0);
    }

    public CarType(String make, String model, double capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }
    
    public String toString() {
        return String.format("%-10s %-10s %-5s", this.make, this.model, this.capacity);
    }
    
      
          
}
