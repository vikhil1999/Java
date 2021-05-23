import java.util.Comparator;

class Route {

    String fromCity;
    String toCity;
    int distance;
    String time;
    String cost;

    public Route(String fromCity, String toCity, int distance, String time, String cost) {
        this.fromCity = fromCity;
        this.toCity = toCity;
        this.distance = distance;
        this.time = time;
        this.cost = cost;
    }

    public Route() {
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        
        return  this.getFromCity() +"    "+ this.getToCity()+"   "+ this.getTime() +"    "  + this.getDistance() + "    " + this.getTime() +"    " 
                 + this.getCost() ;
    }

    
    public static Comparator<Route> CityToCompare = new Comparator<Route>() {

        public int compare(Route s1, Route s2) {
           String toCity1 = s1.getToCity().toUpperCase();
           String toCity2 = s2.getToCity().toUpperCase();
    
           //ascending order
           return toCity1.compareTo(toCity2);
    
           //descending order
           
        }

       
    };

    
}