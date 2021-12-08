class HomeAppliances{

public static HomeAppliances homeAppliances = null;

public static HomeAppliances getHomeAppliances(){
return homeAppliances;
}
static{

homeAppliances=new HomeAppliances();
}

}