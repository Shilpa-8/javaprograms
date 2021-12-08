class Led{

public static Led led = null;

public static Led getLed(){

return led;
}
static{
led = new Led();

}

}