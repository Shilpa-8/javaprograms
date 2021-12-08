class Sofa{

public String type;
public String color;
public double price;

public Sofa(String type,String color,double price){

this.type=type;
this.color=color;
this.price=price;
System.out.println(type + " " + color + "  " + price);

}
public static void main(String a[]){
System.out.println("--------------------------");
Sofa sofa=new Sofa("wodden","Red",35000.00);

System.out.println("--------------------------");
Sofa sofa1=new Sofa("metal","Blue",25000.00);

System.out.println("--------------------------");
Sofa sofa2=new Sofa("fiber","black",19000.00);



}

}