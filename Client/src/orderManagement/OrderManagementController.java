package orderManagement;

import java.util.ArrayList;

import VO.OrderVO;
import common.Choice;
import orderBLService.OrderBLService_realize;
public class OrderManagementController extends OrderBLService_realize{
	public OrderManagementController(int hotelId) {
		super(hotelId);
		// TODO Auto-generated constructor stub
	}

	/**
     * ����ѡ������Ͳ������ж���������ʾ
     * 
     * @param type String�ͣ�һ�ֶ���������
     * @return ArrayList<OrderVO>��һ������ֵ������б�
     * @see bussinesslogic.Order
     */
	public ArrayList<OrderVO> findByType(String type){
		return new ArrayList<OrderVO>();
	}

	/**
     * �ָ��ͻ�����ֵ�����»�Ա�ȼ�
     * 
     * @param vo OrderVO�ͣ�������ֵ����
     * @param choice Choice�ͣ�һ��ö��ֵ
     * @see bussinesslogic.Order
     */
	public void regain(OrderVO vo,Choice choice){
		System.out.println("update success");
	}
	
}
