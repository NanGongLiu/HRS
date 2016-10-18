package orderBuild;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Object.Hotel;
import Object.RoomType;
import Object.Time;
import VO.HotelVO;
import VO.OrderVO;
import VO.UserVO;
import common.ResultMessage;
import common.UserType;
import orderBLService.OrderBLService_realize;
public class OrderBuildController extends OrderBLService_realize{
	/**
     * ����һ����������
     * 
     * @param currentTime Time�ͣ���ǰʱ��
     * @param in Time�ͣ���סʱ��
     * @param out Time�ͣ��뿪ʱ��
     * @param ddl Time�ͣ�Ԥ���뿪ʱ��
     * @param roomType RoomType�ͣ���������
     * @param num int�ͣ������
     * @param numOfPerson int�ͣ�ס������
     * @param hasChild Boolean�ͣ��Ƿ���С��
     * @see bussinesslogic.Order
     */
	public void makeOrder(Time currentTime,
			Time in,Time out,Time ddl,
			RoomType roomType,int num,
			int numOfPerson,
			boolean haveChild ) {
	}
	
	
	
	/**
     * �ж϶����Ƿ�����
     * 
     * @param userID String�ͣ��ͻ����
     * @return ���������򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public boolean whetherMake(String uerID) {
		return false;
	}
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param userID String�ͣ��ͻ����
     * @return long�������ļ�ֵ
     * @see bussinesslogic.Order
     */
	public long getPrice(OrderVO vo,String userID) {
		return 200;
	}
	
	
	/**
     * ���㶩����ֵ����ʾ
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @return ResultMessage��һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public ResultMessage payment(OrderVO vo) {
		return ResultMessage.Exist;
	}
}
