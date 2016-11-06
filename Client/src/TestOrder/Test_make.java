package TestOrder;

import static org.junit.Assert.*;

import org.junit.Test;

import LineItem.OrderLineItem;
import List.OrderList;

import java.util.*;
import java.time.*;

import Mock.*;
import Object.*;
import VO.HotelVO;
import VO.OrderVO;
import VO.UserVO;
import common.*;
/**
 * Test_Order
 * @author ������
 * @version 1.0
 * @see
 */
public class Test_make {
	Date time1=new Date(2016,10,2,11,15,30);
	Date time2=new Date(2017,11,3,20,13,20);
	Date time4=new Date(2016,9,3,4,13,29);
	Date time5=new Date(2017,12,3,23,16,0);
	Date time3=null;
    MockOrder a=new MockOrder("000", 2, 100, 3, false, "double", 303, time1, time2, time3, "good", 100, time3);
    MockOrder b=new MockOrder("023", 1, 155, 4, true, "one", 305, time4, time5, time1, "very good", 98, time4);
    MockOrder c=new MockOrder("025", 1, 155, 3, true, "three", 307, time4, time5, time1, "just so so", 70, time3);
	@Test
	public void test() {
		OrderList list=new OrderList();
		OrderLineItem item=new OrderLineItem(a);
		OrderLineItem item2=new OrderLineItem(b);
		OrderLineItem item3=new OrderLineItem(c);
		
		list.addOrderLineItems(item);
		list.addOrderLineItems(item2);
		list.addOrderLineItems(item3);
		Order order=new Order();
		order.addorderlist(list);
		OrderVO order11=new OrderVO();
		order.duduct(order11);
		order.makeOrder(time3, time1,time2, time4, "double", 309, 3, false);
		assertEquals(list.getOrder(),4);
		assertEquals(list.find("double").get(1).getorder().getRoomNumber(),309);
	}

}