package TestHotel;

import static org.junit.Assert.*;

import org.junit.Test;

import LineItem.HotelLineItem;
import List.HotelList;
import Mock.MockHotel;
import Object.Hotel;
import common.ResultMessage;

public class SetScoreTester {

	@Test
	public void testSetScore() {
		
		MockHotel hotel1 = new MockHotel("ѧ��·2��","���ִ�ѧ��",2,"�Ƶ���1","�Ƶ����1","��ҿ�ݾƵ�","18022223333","Ԥ��״̬1","161000001",4.2);
		MockHotel hotel2 = new MockHotel("����·5��","��¥",5,"�Ƶ���2","�Ƶ����2","ϣ���پƵ�","18800006688","Ԥ��״̬2","161000002",4.8);
		
		HotelList hotelList = new HotelList();
		
		HotelLineItem hotelLineItem1 = new HotelLineItem(hotel1);
		HotelLineItem hotelLineItem2 = new HotelLineItem(hotel2);
		
		hotelList.addHotelLineItems(hotelLineItem1);
		hotelList.addHotelLineItems(hotelLineItem2);
		
		Hotel hotel = new Hotel();
		
		hotel.addHotelList(hotelList);
		
		assertEquals(ResultMessage.Exist, hotel.setScore(5));
		
	}

}
