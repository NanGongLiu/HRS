package hotelManagement;

import common.MessageInput;
import common.ResultMessage;
import hotelBLService.HotelBLService_realize;

public class HotelManagementController extends HotelBLService_realize{
	/**
     * ά���Ƶ�Ļ�����Ϣ�����¾Ƶ�����
     * 
     * @param in MessageInput�ͣ�����������޸���Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage messagemaintain(MessageInput  in) {
		return ResultMessage.Exist;
	}
}
