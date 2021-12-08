class Showroom{

public String name;
public String item;
public double noOfStocks;

public Showroom(String name,String item,double noOfStocks){

this.name=name;
this.item=item;
this.noOfStocks=noOfStocks;
System.out.println(name + " " + item + "  " + noOfStocks);

}
public static void main(String a[]){
System.out.println("--------------------------");
Showroom show=new Showroom("Maruthi Suzuki","car",1700.00);

System.out.println("--------------------------");
Showroom show1=new Showroom("Orian","Shoping",250.00);

System.out.println("--------------------------");
Showroom show2=new Showroom("TATA","vehicles",19000.00);



}

}