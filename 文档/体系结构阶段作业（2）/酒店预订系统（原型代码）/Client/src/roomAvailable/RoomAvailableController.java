package roomAvailable;
import java.rmi.RemoteException;
import java.util.ArrayList;

import VO.OrderVO;
import VO.RoomVO;
import common.MessageInput;
import common.ResultMessage;
import roomBLService.RoomBLService_realize;
public class RoomAvailableController extends RoomBLService_realize{
	/**
     * ���ؿ���ס����
     * 
     * @return ArrayList<RoomVO>,һ������ֵ�����б�
     * @see bussinesslogic.Room
     */
	public ArrayList<RoomVO> getRoom() {
		ArrayList<RoomVO> array=new ArrayList<RoomVO>(); 
		return array;
	}
	
	
	/**
     * ���ط���ļ۸�
     * 
     * @param roomType String�ͣ�һ�ַ�������
     * @return ����һ��long��ֵ
     * @see bussinesslogic.Room
     */
	public long getPrice(String roomType) {
		return 200;
	}
}
