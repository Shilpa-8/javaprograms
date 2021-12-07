class Restuarant{

public int restuarantId;
public String restuarantName;
public String type;
public String location;
public String ownerName; 

public Restuarant(String restNme,String tp,String lctn,String ownNme,int restId){
System.out.println("Restuarant Object is created");
restuarantId=restId;
restuarantName=restNme;
type=tp;
location=lctn;
ownerName=ownNme;

}

public void serveFood(){
System.out.println("Serving Food With delicious items");
}

public void displayRestuarantDetails(){
System.out.println(restuarantId+"\n"+restuarantName+"\n"+type+"\n"+location+"\n"+ownerName+"\n");

}

}