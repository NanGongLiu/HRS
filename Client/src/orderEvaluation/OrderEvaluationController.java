package orderEvaluation;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Object.Hotel;
import VO.HotelVO;
import VO.OrderVO;
import VO.UserVO;
import common.ResultMessage;
import common.UserType;
import orderBLService.OrderBLService_realize;
public class OrderEvaluationController extends OrderBLService_realize{
	/**
     * ���¶�����Ϣ����ʾ����
     * 
     * @param comment String�ͣ��ͻ�����
     * @param order OrderVO�ͣ�һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public void comment(String comment,OrderVO order) {
	}
	
	
	/**
     * ���������ID���Ҷ�������ʾ
     * 
     * @param ID String�ͣ�������
     * @return OrderVO��һ��������ֵ����
     * @see bussinesslogic.Order
     */
	public OrderVO findByID(String ID) {
		OrderVO ov=new OrderVO();
		return ov;
	}
}
