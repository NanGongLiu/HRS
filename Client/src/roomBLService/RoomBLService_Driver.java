package roomBLService;
import java.util.ArrayList;

import Object.Room;
import VO.*;
import common.*;
import roomBLService.RoomBLService;
public class RoomBLService_Driver {
	public void drive(RoomBLService roomBLService){
		ResultMessage result1=roomBLService.messageupdate(null);
		if(result1 ==ResultMessage.Exist) System.out.println("messageupdate success");
		RoomVO result2=roomBLService.messageadd(new OrderVO());
		if(result2 ==new RoomVO()) System.out.println("messageadd success");
		ArrayList<RoomVO> result3=roomBLService.getRoom();
		if(result3 ==new ArrayList<RoomVO>()) System.out.println("getRoom success");
		long result4=roomBLService.getPrice("12");
		if(result4 ==200) System.out.println("getPrice success");
}
}