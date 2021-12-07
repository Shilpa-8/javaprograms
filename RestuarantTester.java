class RestuarantTester{

public static void main(String a[]){
 
 Restuarant rest=new Restuarant("Empire","veg","Malleshwaram","Sadanand Gowda",456);
 
 rest.serveFood();
 rest.displayRestuarantDetails();


 Restuarant rest1=new Restuarant("Hotel Areca","Non veg","BTM Layout","Somesh",1999);
 
 rest1.serveFood();
 rest1.displayRestuarantDetails();
}


}