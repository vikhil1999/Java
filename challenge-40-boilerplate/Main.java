import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Planner plan= new Planner();
        System.out.println("Enter the no of routes..");
        int noOfRoute= input.nextInt();
        String[] routeDetails= plan.getRouteData(noOfRoute);
        Route[] routeobj=plan.retriveRouteDetails(noOfRoute,routeDetails);
      ArrayList RouteAl= plan.addToArrayList(routeobj);
         plan.showDirectFlights(RouteAl);
        plan.showAllConnections(RouteAl);
        
      
    }

   
}
