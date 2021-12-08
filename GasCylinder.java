class GasCylinder{

public String brand;
public String color;
public double weight;

public GasCylinder(String brand,String color,double weight){

this.brand=brand;
this.color=color;
this.weight=weight;
System.out.println(brand + " " + color + "  " + weight);

}
public static void main(String a[]){
System.out.println("--------------------------");
GasCylinder cylinder=new GasCylinder("Indane","Red",17.00);

System.out.println("--------------------------");
GasCylinder cylinder1=new GasCylinder("HP","Blue",25.00);

System.out.println("--------------------------");
GasCylinder cylinder2=new GasCylinder("Bharath Gas","Red",19.00);



}

}