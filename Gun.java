class Gun{

public Gun(){
System.out.println("Constructor is called");
System.out.println(this.getClass().getSimpleName()+ " object is cretaed");
}
static {
System.out.println("Static block is executed");
}
{
}
{

System.out.println("Instance block is executed");

}

}