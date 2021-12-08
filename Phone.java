class Phone{

public static Phone phone = null;

public static Phone getPhone(){
return phone;
}
static {
phone = new Phone();
}

}
