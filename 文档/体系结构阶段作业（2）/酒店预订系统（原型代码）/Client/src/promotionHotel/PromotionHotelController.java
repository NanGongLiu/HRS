package promotionHotel;
import java.rmi.RemoteException;

import VO.PromotionVO;
import common.ResultMessage;
import common.UserType;
import promotionBLService.PromotionBLService_realize;
public class PromotionHotelController extends PromotionBLService_realize {
	  /**
     * ���һ���µľƵ�Ӫ�����ԣ�������
     * 
     * @param vo PromotionVO�ͣ����������Ӫ������
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Promotion
     */
	public ResultMessage madebyhotel (PromotionVO vo) {
		return ResultMessage.Exist;
	}

}
