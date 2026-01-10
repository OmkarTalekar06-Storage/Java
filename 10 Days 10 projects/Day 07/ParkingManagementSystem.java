import java.util.*;
class ParkingManagementSystem{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int totalSlots = 10;
        int occupidSlots = 0;

        while (true) { 
            System.out.println("\n---PARKING MANAGEMENT SYSTEM---");
            System.out.println("1.Park Vehicle");
            System.out.println("2.Remove Vehicle");
            System.out.println("3.View Available Slots");
            System.out.println("4.Exit");
            System.out.println("Enter choice : ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1->{
                    if (occupidSlots<totalSlots) {
                        occupidSlots++;
                        System.out.println("Vehicle Parked");
                    }else{
                        System.out.println("Parking is Full");
                    }
                    break;
                }
                case 2->{
                    if(occupidSlots>0){
                        occupidSlots--;
                        System.out.println("Vehicle removed");
                    }else{
                        System.out.println("No Vehicle to remove");
                    }
                    break;
                }

                case 3->{
                    System.out.println("Total Slots : " + totalSlots);
                    System.out.println("Occupid Slots : " + occupidSlots);
                    System.out.println("Available Slots : " + (totalSlots-occupidSlots));
                }

                case 4->{
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default->{
                    System.out.println("Please enter a vaild choice");
                    break;
                }
            }
        }

    }
}
