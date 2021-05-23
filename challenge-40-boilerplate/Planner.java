import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Planner {

    static Scanner input = new Scanner(System.in);

    public String[] getRouteData(int noRoute) {

        String routes[] = new String[noRoute];
        // input.nextLine();
        System.out.println(
                "Please enter Source City, Destination City, Distance in kms, Typical flight time, Typical ticket cost");
        for (int i = 0; i < noRoute; i++) {
            String routeInfo = input.nextLine();
            routes[i] = routeInfo;
        }
        return routes;
    }

    public Route[] retriveRouteDetails(int noOfRoute, String[] routeDetails) {

        Route[] routeObj = new Route[noOfRoute];
        for (int i = 0; i < routeDetails.length; i++) {
            String[] spltArray = routeDetails[i].split(", ");
            {
                routeObj[i] = new Route();
                routeObj[i].setFromCity(spltArray[0]);
                routeObj[i].setToCity(spltArray[1]);
                routeObj[i].setDistance(Integer.parseInt(spltArray[2]));
                routeObj[i].setTime(spltArray[3]);
                routeObj[i].setCost(spltArray[4]);
            }

        }
        return routeObj;
    }

    public void displayRoute(Route[] routeobj) {
        System.out.println("--------------------------------------------");
        for (int i = 0; i < routeobj.length; i++) {
            System.out.print(routeobj[i].getFromCity() + " " + routeobj[i].getToCity() + " " + routeobj[i].getDistance()
                    + " " + routeobj[i].getTime() + " " + routeobj[i].getCost() + "\n");
        }
    }

    public ArrayList addToArrayList(Route[] routeobj) {
        ArrayList<Route> al = new ArrayList<Route>();
        for (int i = 0; i < routeobj.length; i++) {
            al.add(routeobj[i]);
        }
        System.out.println("*******************************************************");
        System.out.println(" tFrom    To    Distance(Kms)    Time    tCost");
        System.out.println("*******************************************************");
        for (int i = 0; i < routeobj.length; i++) {
            System.out.println(al.get(i));
        }
        System.out.println("*******************************************************");
        return al;
    }

    public void showDirectFlights(ArrayList<Route> routeAl) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Enter the name of the city on Board");
        String fromCity = input.nextLine();
        Collections.sort(routeAl,Route.CityToCompare);
            System.out.println("*******************************************************");
            System.out.println(" tFrom    To    Distance(Kms)    Time    tCost");
            System.out.println("*******************************************************");
          for (int i = 0; i < routeAl.size(); i++) {
              if(routeAl.get(i).fromCity.equalsIgnoreCase(fromCity)){
                    System.out.println(routeAl.get(i));
              }
              
          }
             
        }

     void showAllConnections(ArrayList<Route> routeAl) {
            // String curFCity="";
            String curTCity="";
            // int frtIndex = 0;
            System.out.println("Please enter Source route");
            String fromCity=input.nextLine();
            System.out.println("Please enter Destination route");
            String toCity=input.nextLine();
            System.out.println();
            System.out.println("*******************************************************");
            System.out.println("Sl.No    tFrom    To    Distance(Kms)    Time    tCost");
            System.out.println("*******************************************************");
            for(int i=0;i<routeAl.size();i++)
            {
                if(routeAl.get(i).getFromCity().equalsIgnoreCase(fromCity) ||routeAl.get(i).getToCity().equalsIgnoreCase(toCity)) {

                
                if(routeAl.get(i).getFromCity().equalsIgnoreCase(fromCity) && routeAl.get(i).getToCity().equalsIgnoreCase(toCity))
                {
                    System.out.println(routeAl.get(i));
                }
                    else
                    {
                     int frtIndex = i;
                    curTCity = routeAl.get(i).getToCity();
                    IterateSpltArray(curTCity,routeAl,toCity,fromCity,frtIndex);
                    }
                    
                }
        }
    }
        private static void IterateSpltArray(String curTCity, ArrayList<Route> routeAl,String toCity,String fromCity,int frtIndex) {
            int secIndex = 0;
            for(int i=0;i<routeAl.size();i++)
            {
                    if(curTCity.equalsIgnoreCase(routeAl.get(i).getFromCity()) && routeAl.get(i).getToCity().equalsIgnoreCase(toCity))
                    {
                        secIndex= i;
                        // System.out.println("Connectig index is  "+ frtIndex);
                        // System.out.println("Connectig index is  "+ secIndex);
                        printConnectedRoute(routeAl,frtIndex,secIndex);
    
                    }
                }
                    }   


                static void printConnectedRoute(ArrayList<Route> routeAl, int frtIndex, int secIndex) {
                    float totCost = 0f;
                    float costOfFrst=0;
                    float costOfSecond = 0 ;
                    String StrcostOfFirst="";
                    String StrcostOfSecond="";
                 //    int totDistance = 0;
                    int frstDistance =0;
                    int secDistance =0;
                    // String[] frstSpltConnected= routeAl.get(frtIndex);
                    // String[] secSpltConnected=routeAl.get(secIndex);
                 System.out.println(  routeAl.get(frtIndex));
                    StrcostOfFirst = routeAl.get(frtIndex).getCost();
                    frstDistance = routeAl.get(frtIndex).getDistance();
                
                    // int distanceInKm = Integer.parseInt(frstSpltConnected[2]) + Integer.parseInt(secSpltConnected[2]);
                   
                    System.out.println( routeAl.get(secIndex));
                        StrcostOfSecond = routeAl.get(secIndex).getCost();
                        secDistance = routeAl.get(secIndex).getDistance();
                    
                   System.out.println();
                   
                   if(StrcostOfFirst.contains("EUR") && (StrcostOfSecond.contains("INR")))
                   {
                     costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                     costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*0.011f;
                         totCost = (costOfFrst+costOfSecond);
                         System.out.println("\n\tTotal----> "+totCost+" EUR"+"  Distance---> "+(frstDistance+secDistance));
     
                   }
                  else if(StrcostOfFirst.contains("INR") && (StrcostOfSecond.contains("EUR")))
                   {
                         costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                         costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*90.49f;
                         totCost = (costOfFrst+costOfSecond);
                         System.out.println("\n\tTotal----> "+totCost+" INR"+"  Distance---> "+(frstDistance+secDistance));
                   }
                   else if(StrcostOfFirst.contains("USD") && (StrcostOfSecond.contains("INR")))
                   {
                         costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                         costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*0.014f;
                         totCost = (costOfFrst+costOfSecond);
                         System.out.println("\n\tTotal----> "+totCost+" USD"+"  Distance---> "+(frstDistance+secDistance));
                   }
                   else if(StrcostOfFirst.contains("INR") && (StrcostOfSecond.contains("USD")))
                   {
                         costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                         costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*73.66f;
                         totCost = (costOfFrst+costOfSecond);
                         System.out.println("\n\tTotal----> "+totCost+" INR"+"  Distance---> "+(frstDistance+secDistance));
                   }
                   else if(StrcostOfFirst.contains("INR") && (StrcostOfSecond.contains("INR")))
                   {
                         costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                         costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3));
                         totCost = (costOfFrst+costOfSecond);
                         System.out.println("\n\tTotal----> "+totCost+" INR"+"  Distance---> "+(frstDistance+secDistance));
                   }
                   else if(StrcostOfFirst.contains("GBP") && (StrcostOfSecond.contains("USD")))
                   {
                         costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                         costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*0.738122f;
                         totCost = (costOfFrst+costOfSecond);
                         System.out.println("\n\tTotal----> "+totCost+" GBP"+"  Distance---> "+(frstDistance+secDistance));
                   }
                   else if(StrcostOfFirst.contains("USD") && (StrcostOfSecond.contains("GBP")))
                   {
                         costOfFrst = Float.parseFloat(StrcostOfFirst.substring(3));
                         costOfSecond = Float.parseFloat(StrcostOfSecond.substring(3))*1.35f;
                         totCost = (costOfFrst+costOfSecond);
                         System.out.println("\n\tTotal----> "+totCost+" USD"+"  Distance---> "+(frstDistance+secDistance));
                   }
     
                   System.out.println();
                 }


    }

    
    
