import java.util.Scanner;
public class Route{
    private String sourceCity;
    private String destinationCity;
    private double distanceKM;
    private String flightTime;
    private String currency;
    private double cost;
    public Route(){
    }
    public Route(String sourceCity, String destinationCity, double distanceKM,String flightTime,String currency,double cost){
        this.sourceCity=sourceCity;
        this.destinationCity=destinationCity;
        this.distanceKM=distanceKM;
        this.flightTime=flightTime;
        this.currency=currency;
        this.cost=cost;
    }
    public String getSourceCity(){
        String[] sourceArray=sourceCity.split(" ");
        String str="";
        for(int i=0;i<sourceArray.length;i++){
            sourceArray[i]=sourceArray[i].substring(0,1).toUpperCase()+sourceArray[i].substring(0,1);
            str=str.concat(sourceArray[i]+" ");
        }
        return str;
    }
    public void setSourceCity(String sourceCity){
        this.sourceCity=sourceCity;
    }
    public String getDestinationCity(){
        String[] desArray=destinationCity.split(" ");
        String str="";
        for(int i=0;i<desArray.length;i++){
            desArray[i]=desArray[i].substring(0,1).toUpperCase()+desArray[i].substring(0,1);
            str=str.concat(desArray[i]+" ");
        }return str;
    }
    public void setDestinationCity(String destinationCity){
        this.destinationCity=destinationCity;
    }
    public double getDistanceKm(){
        return distanceKM;
    }
    public void setDistanceKM(double distanceKM){
        this.distanceKM=distanceKM;
    }
    public String getFightTime(){
        return flightTime;
    }
    public void setFlightTime(String flightTime){
        this.flightTime=flightTime;
    }
    public String getCurrency(){
        return currency;
    }
    public void setCurrency(String currency){
        this.currency=currency;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost=cost;
    }
    public void acceptDetails(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the  route details in this format : \n Source City, Desitination City, Distance in kilometers, Travel Time, TYpical Airforce");
        System.out.println();
        String route=scanner.nextLine();
        String[] routeArray=route.split(",");
        sourceCity=routeArray[0];
        destinationCity=routeArray[1];
        distanceKM=Double.parseDouble(routeArray[2]);
        flightTime=routeArray[3];
        currency=routeArray[4];
        cost=Double.parseDouble(routeArray[5]);
        System.out.println();
    }
    public boolean isValid(double value){
        if(value>0){
            return true;
        }
        return false;
    }
    public boolean isValidTime(String time){
        int f=0;
        if(time.contains(":")){
            String[] timeArray=time.split(":");
            if(timeArray.length==2){
                for(int i=0;i<timeArray.length;i++){
                    f=0;
                    if(timeArray[i].length()>=1 && timeArray[i].length()<=2 ){
                        for(int j=0;j<timeArray[i].length();j++){
                            char character=timeArray[i].charAt(j);
                            if(!(character>='0' && character<='9')){
                                f=1;
                                break;
                            }
                        }
                        if(f==1){
                           break;
                        }
                    }else{
                        return false;
                    }    
                }
                if(f==1){
                    return false;
                }else{
                    return true;
                }
            }
        }return false;
    }
    public boolean isValidCurrency(String currencyPrice){
        if(currencyPrice.length()==3){
            return true;
        }return false;
    }
    public String displayDetails(){
        return getSourceCity()+"\t\t\t"+getDestinationCity()+"\t\t\t"+getDistanceKm()+"\t\t\t"+getFightTime()+"\t\t\t"+getCurrency()+"\t\t\t"+getCost();
    }
    public int getTimeMinutes(){
        String[] timeArray=flightTime.split(":");
        int[] timeIntArray=new int[timeArray.length];
        int hrInMin=0;
        int totalTimeInMinutes=0;
        for(int i=0;i<timeArray.length;i++){
            timeIntArray[i]=Integer.parseInt(timeArray[i]);
            if(i==0){
                hrInMin=(timeIntArray[i]*60);
            }
            if(i==1){
                totalTimeInMinutes=hrInMin+timeIntArray[i];
            }
        }
        return totalTimeInMinutes;
    }
    public double getCurrencyConverter(){
        if(currency.equalsIgnoreCase("INR")){
            cost=1.0*cost;
        }else if(currency.equalsIgnoreCase("EUR")){
            cost=88.37*cost;
        }else if(currency.equalsIgnoreCase("GBP")){
            cost=100.68*cost;
        }else if(currency.equalsIgnoreCase("USD")){
            cost=72.86*cost;
        }else if(currency.equalsIgnoreCase("SGD")){
            cost=54.94*cost;
        }else if(currency.equalsIgnoreCase("JPY")){
            cost=0.70*cost;
        }else{
            cost=0.0;
        }
        return cost;
    }    
}
