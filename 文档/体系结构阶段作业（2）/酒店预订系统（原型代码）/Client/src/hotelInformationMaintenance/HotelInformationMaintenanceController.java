package hotelInformationMaintenance;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Object.Hotel;
import VO.HotelVO;
import VO.OrderVO;
import common.MessageInput;
import common.ResultMessage;
import common.UserType;
import hotelBLService.HotelBLService_realize;
public class HotelInformationMaintenanceController  extends HotelBLService_realize{
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
	
	
	/**
     * ���ӾƵ��˺����Ʋ��Ҵ���һ���þƵ깤����Ա���˺�
     * 
     * @param in MessageInput�ͣ���������ľƵ������Ϣ
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Hotel
     */
	public ResultMessage accuntadmin(MessageInput  in) {
		return ResultMessage.Exist;
	}
}
