class Lodge
{
public ClientDTO[] clients;

private int index;

public Lodge(int size)
{
	clients = new ClientDTO[size];
}
public boolean addClientDetails(ClientDTO clients)
{
boolean clientAdded=false;
System.out.println("inside creat client");

if(clients!=null)
{
this.clients[index++]=clients;
clientAdded=true;
}

else
{
System.out.println("no client added");
return clientAdded=false;
}

return clientAdded;
}
/*public void getAllClients()
{
for(int i=0; i<clients.length;i++)
{
System.out.println(clients[i]);	
}

}*/
public ClientDTO getClientByName(String clientName){ 
ClientDTO clientDTO = null;
System.out.println("inside getClientByName()");
if(clientName!= null){
	for(int i=0; i<clients.length; i++){
		if(clients[i].getClientName().equals(clientName))
		{
			System.out.println("Client found by Name"+clientName);
			clientDTO = clients[i];
			return clientDTO;
		}
		else
		{
			System.out.println("No records found");
		}
	}
}
return clientDTO;
}
}