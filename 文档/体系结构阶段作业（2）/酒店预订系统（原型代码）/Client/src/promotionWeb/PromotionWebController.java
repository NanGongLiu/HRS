package promotionWeb;
import java.rmi.RemoteException;

import VO.PromotionVO;
import common.ResultMessage;
import common.UserType;
import promotionBLService.PromotionBLService_realize;
public class PromotionWebController extends PromotionBLService_realize{
	/**
     * ���һ���µ���վӪ�����ԣ�������
     * 
     * @param vo PromotionVO�ͣ����������Ӫ������
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Promotion
     */
	public ResultMessage madebyweb (PromotionVO vo ) {
		return ResultMessage.Exist;
	} 

	
	/**
     * ��ǻ�Ա�ȼ���׼
     * 
     * @param vo PromotionVO�ͣ���������Ļ�Ա�ȼ���ע
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Promotion
     */
	public ResultMessage memberlevelmade(PromotionVO vo) {
		return ResultMessage.Exist;
	}

}
