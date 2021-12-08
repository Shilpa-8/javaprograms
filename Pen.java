class Pen{

private static Pen pen= null;

public static Pen getPen(){
return pen;
}
static{

pen=new Pen();

}
}