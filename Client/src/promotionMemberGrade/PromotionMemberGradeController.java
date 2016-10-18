package promotionMemberGrade;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Object.Promotion;
import VO.PromotionVO;
import common.ResultMessage;
import common.UserType;
import promotionBLService.PromotionBLService_realize;
public class PromotionMemberGradeController extends PromotionBLService_realize{	
	/**
     * ȡ��һ������
     * 
     * @param promotion Promotion�ͣ���Ҫȡ���Ķ���
     * @return ȡ���ɹ��򷵻�true�����򷵻�true
     * @see bussinesslogic.Promotion
     */
	public boolean cancel(Promotion promotion) {
		return false;
	}
	
	
	/**
     * ��ʾ�������õ�Ӫ������
     * 
     * @param userID String�ͣ��ͻ���ID
     * @return ArrayList<PromotionVO>��һ��Ӫ������ֵ������б�
     * @see bussinesslogic.Promotion
     */
	public ArrayList<PromotionVO> getPromotion(String userID) {
		ArrayList<PromotionVO> array=new ArrayList<PromotionVO>();
		return array;
	}
}

