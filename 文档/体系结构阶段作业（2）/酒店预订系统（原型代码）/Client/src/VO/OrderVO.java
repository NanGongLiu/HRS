package VO;
import java.sql.Time;
import Object.Order;

/**
 * ���������Լ����ݴ��������
 * @author ����٩
 * @version 1.0
 * @see Object.Order
 */

public class OrderVO extends VO {

	public String orderNumber;
	public int orderState;
	public int orderValue;
	public int numOfPerson;
	public boolean child;
	public String roomType;
	public int roomNumber;
	public Time expectedCheckIn;
	public Time expectedCheckOut;
	public Time latest;
	public String comment;
	public int score;	

	/**
     * ���¶�����Ϣ
     * 
     * @param ord Order�ͣ�һ�������������ݵĶ�������
     * @return 
     * @see Object.Order
     */
	public void update(Order ord) {
		
	}
	
	/**
     * ������������
     * 
     * @return һ�����µĶ���
     * @see Object.Order
     */
	public Order makeOrder() {
		
		return new Order();
	}
	
}
