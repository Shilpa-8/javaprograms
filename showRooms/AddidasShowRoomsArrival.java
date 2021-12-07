package com.xworkz.collection.cloneableInterface.showRooms;

public class AddidasShowRoomsArrival {

	public static void main(String[] args) throws CloneNotSupportedException {
	 AddidasShowRooms addidasShowRooms = new AddidasShowRooms();
		
		addidasShowRooms.setShowRoomName("Addidas Showroom");
		addidasShowRooms.setType("Motor Cycle");
		addidasShowRooms.setLocation("Jayanagar");
		addidasShowRooms.setContactNumber(9902192329L);
		addidasShowRooms.setAddress("FirstFloor, 1st Main Road, 4th Block, Jayanagar, Bengaluru, Karnataka 560010");
		System.out.println(addidasShowRooms.toString());
		
		Object object = addidasShowRooms.clone();
		AddidasShowRooms addidasShowRooms2 = (AddidasShowRooms)object;
		System.out.println("After cloneing");
		System.out.println(addidasShowRooms2.toString());
	}
}

