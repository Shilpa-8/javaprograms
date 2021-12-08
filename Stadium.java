class Stadium{

public String name;
public String place;
public double noOfSeatings;

public Stadium(String name,String place,double noOfSeatings){

this.name=name;
this.place=place;
this.noOfSeatings=noOfSeatings;
System.out.println(name + " " + place + "  " + noOfSeatings);

}
public static void main(String a[]){
System.out.println("--------------------------");
Stadium stadium=new Stadium("NehruStadium","Shivmogga",15000.00);

System.out.println("--------------------------");
Stadium stadium1=new Stadium("ChinnaswamyStadium","Bangalore",25000.00);

System.out.println("--------------------------");
Stadium stadium2=new Stadium("ChidambaramStadium","Delhi",19000.00);



}

}