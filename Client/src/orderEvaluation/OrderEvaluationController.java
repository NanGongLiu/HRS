package orderEvaluation;
import VO.OrderVO;
import orderBLService.OrderBLService_realize;
public class OrderEvaluationController extends OrderBLService_realize{
	public OrderEvaluationController(int hotelId) {
		super(hotelId);
		// TODO Auto-generated constructor stub
	}


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
