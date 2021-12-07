class Parliment{

public String partyName;
public String partyHead;
public int partyMembers;

public Parliment(String parNm,String parHd,int parMem){
System.out.println("Parliment Constructor created");
partyName=parNm;
partyHead=parHd;
partyMembers=parMem;
}

public void electionHome(){
System.out.println("parliment alli no one paksha ide");
}

public void displayResults(){
System.out.println(partyName+"\n"+partyHead+"\n"+partyMembers+"\n");
}

}