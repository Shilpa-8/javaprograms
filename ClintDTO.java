class ClientDTO
{
public ClientDTO()
{
System.out.println("object is created");
}

private String clientName;
private int clientAge;
private String gender;
private boolean checkin;
private String roomNo;


public String getClientName()
{
return clientName;
}

public void setClientName(String clientName)
{
this.clientName=clientName;
}

public int getClientAge()
{
return clientAge;
}

public void setClientAge(int clientAge)
{
this.clientAge=clientAge;
}

public String getGender()
{
return gender;
}

public void setGender(String gender)
{
this.gender=gender;
}

public boolean getCheckin()
{
return checkin;
}

public void setCheckin(boolean checkin)
{
this.checkin=checkin;
}

public String getRoomNo()
{
return roomNo;
}

public void setRoomNo( String roomNo)
{
this.roomNo=roomNo;
}

@Override
public String toString()
{
 return "ClientDTO-[clientName="+this.clientName+",clientAge="+this.clientAge+",gender="+this.gender+",checkin="+this.checkin+",roomNo="+this.roomNo+",]";
}
}