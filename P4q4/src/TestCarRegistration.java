
import java.util.Scanner;

public class TestCarRegistration {
    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType objects
        CarType[] typeList={new CarType("Toyota","Vios", 1.5), new CarType("Nissan","Teana", 2.0), new CarType("Honda","City", 1.6)};
        
        
  	//todo:: create an array that will able to store 6 registrations
        Registration[] registration=new Registration[6];
        
  	  	
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i < registration.length; ++i) {

  		System.out.println("\nRegistration number: " + Registration.nextRegNo);
  		
                //todo:: request and read the owner detail
  		System.out.print("Enter owner name : ");
                String name = scanner.nextLine();
                System.out.print("Enter IC number : ");
                String icNo = scanner.nextLine();
                
                //Construct owner object
                 Owner owner=new Owner(name, icNo);
                
  		//todo:: request and read car detail
                System.out.print("Enter Car Plate number: ");
                String platenumber = scanner.nextLine();
                System.out.print("Enter Car color: ");
                String color = scanner.next();
                System.out.print("Enter Year: ");
                int year = scanner.nextInt();
                
                 //Construct car object
                Car car=new Car(platenumber, color, year);
                
  		  		
  		System.out.print("\nCar Types: \n");
  		//todo:: display all available carType
                for(int x=0; x<typeList.length; x++){
                    System.out.println((x+1) + ". " + typeList[x].toString());
                }
                
                 
  		System.out.print("\nSelect car type [1.." +  typeList.length + "]: ");
  		int selection = scanner.nextInt();
  		
                //todo:: get cartype from array (based on selection)
                CarType selectedType = typeList[selection-1];
              
  		//todo:: register the car
                Registration newReg=new Registration(car, selectedType, owner);
                registration[i]=newReg;
                  
                   
  		scanner.nextLine();
  	}
  
  	//todo:: display all registration detail
        displayListing(registration);
  }
  
  public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-8s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
  }
}
