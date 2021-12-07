class Google{

public int googleID;
public String googleCeo;
public String app;

public Google(int gID,String gCeo,String ap){
System.out.println("Google Constructor Created");
googleID=gID;
googleCeo=gCeo;
app=ap;
}

public void searchNews(){
System.out.println("en beko adna search madkoli");
}

public void displayGoogleDetails(){
System.out.println(googleID+"\n"+googleCeo+"\n"+app+"\n");
}
}