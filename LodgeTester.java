import java.util.*;
	class LodgeTester{
	public static void main (String a[]){
		
Scanner sc= new Scanner(System.in);
System.out.println("Enter the size");
int size =sc.nextInt();
	Lodge  lodge = new Lodge(2);
	
for(int i=0; i<size; i++){
	ClientDTO dto =new ClientDTO();
	System.out.println("Enter the Client Details");
	System.out.println("enter the ClientName ");
	String clientName = sc.next();
	dto.setClientName(clientName);
	System.out.println("Enter the Client Age");
	int clientAge=sc.nextInt();
	dto.setClientAge(clientAge);
	System.out.println("Enter the Gender");
	String gender = sc.next();
	dto.setGender(gender);
	System.out.println("enter Checkin");
	boolean checkin =sc.nextBoolean();
	dto.setCheckin(checkin);
	System.out.println ("enter the room number");
	String roomNo = sc.next();
	dto.setRoomNo(roomNo);





 


boolean isAdded= lodge.addClientDetails(dto);
System.out.println(isAdded);

}


//lodge.getAllClients();
System.out.println("Name to search");
String x= sc.next();
System.out.println(lodge.getClientByName(x));

}

}