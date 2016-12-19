package orderExecute;

import java.rmi.RemoteException;
import java.sql.Time;
import java.util.ArrayList;

import Object.Hotel;
import VO.HotelVO;
import VO.OrderVO;
import VO.UserVO;
import common.ResultMessage;
import common.UserType;
import orderBLService.OrderBLService_realize;
public class OrderExecuteController extends OrderBLService_realize{
	
	/**
     * ��һ���������ͱ�Ϊ�ѳ����������泷��ʱ��
     * 
     * @param orderID String�ͣ�������
     * @param currentTime Time�ͣ���ǰʱ��
     * @see bussinesslogic.Order
     */
	public void cancelOrder(String orderID,Time currentTime) {
	}
	
	
	/**
     * ���г��������Ĳ���
     * 
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void duduct(OrderVO order) {
	}
	
	
	/**
     * �ж϶����Ƿ��ѱ�����
     * 
     * @param orderID String�ͣ��ͻ����
     * @param currentTime Time�ͣ�����������ʱ��
     * @return ���ѳ����򷵻�true�����򷵻�false
     * @see bussinesslogic.Order
     */
	public Boolean whetherDeduct(Time currentTime,String orderID) {
		return false;
	}
	/**
     * ���Ķ���״̬Ϊ��ִ�У�Ϊ�ͻ���������ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void done(String orderID,String userID) {
	}
	
	
	/**
     * ���¶�������Ϊ�쳣��Ϊ�ͻ���ȥ����ֵ�����»�Ա�ȼ� 
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void abnormalOrder(String orderID,String userID) {
	}
	
	
	/**
     * ���¶�������Ϊ��ִ�У�Ϊ�ͻ��ָ�����ֵ�����»�Ա�ȼ�  
     * 
     * @param userID String�ͣ��ͻ����
     * @param orderID String�ͣ�������
     * @see bussinesslogic.Order
     */
	public void delayIn(String orderID,String userID) {
	}

	/**
     * ��������ִ�����񣬳־û������漰�������������� ϵͳ����
     * 
     * @see bussinesslogic.Order
     */
	public void endExecute() {
	}
	
}
