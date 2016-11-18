package promotionBLService;

import java.util.ArrayList;

import Object.Promotion;
import VO.PromotionVO;
import common.ResultMessage;

/**
 * ����ʵ��Ӫ�����Խ�������Ҫ��׮����  
 * @author ������
 * @version 1.0
 * @see presentation.Promotion
 */
public class PromotionBLService_Stub implements PromotionBLService{
		 String promotionNumber;
		 String promotionName;
		 String promotionBegintime;
		 String promotionEndtime;
		 String userBirthday;
		 int Room;
		 boolean userType;
		 String hotelBusinesscircle;
		 String userShipgrade;
		 int promotionDiscount;
		 public PromotionBLService_Stub (String promotionnumber,String promotionname,
				 String promotionbegintime,String promotionendtime,
				 String userbirthday,int room,boolean usertype,String hotelbusinesscircle,
				 String usershipgrade,int promotiondiscount){
		   promotionNumber=promotionnumber;
		   promotionName=promotionname;
		   promotionBegintime=promotionbegintime;
		   promotionEndtime=promotionendtime;
		   userBirthday=userbirthday;
		   Room=room;
		   userType=usertype;
		   hotelBusinesscircle=hotelbusinesscircle;
		   userShipgrade=usershipgrade;
		   promotionDiscount=promotiondiscount;
		  }
	/**
     * ���һ���µľƵ�Ӫ�����ԣ�������
     * 
     * @param vo PromotionVO�ͣ����������Ӫ������
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Promotion
     */
	public ResultMessage madebyhotel (PromotionVO vo){
		return ResultMessage.Exist;
	}
	
	
	/**
     * ���һ���µ���վӪ�����ԣ�������
     * 
     * @param vo PromotionVO�ͣ����������Ӫ������
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Promotion
     */
	public ResultMessage madebyweb (PromotionVO vo ){
		return ResultMessage.Exist;
	}

	
	/**
     * ��ǻ�Ա�ȼ���׼
     * 
     * @param vo PromotionVO�ͣ���������Ļ�Ա�ȼ���ע
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Promotion
     */
	public ResultMessage memberlevelmade(PromotionVO vo){
		return ResultMessage.Exist;
	}
	
	/**
     * ȡ��һ������
     * 
     * @param promotion Promotion�ͣ���Ҫȡ���Ķ���
     * @return ȡ���ɹ��򷵻�true�����򷵻�true
     * @see bussinesslogic.Promotion
     */
	public boolean cancel(Promotion promotion){
		return true;
	}
	
	
	/**
     * ��ʾ�������õ�Ӫ������
     * 
     * @param userID String�ͣ��ͻ���ID
     * @return ArrayList<PromotionVO>��һ��Ӫ������ֵ������б�
     * @see bussinesslogic.Promotion
     */
	public ArrayList<PromotionVO> getPromotion(String userID){
		return new ArrayList<PromotionVO>();
	}
	@Override
	public ArrayList<PromotionVO> getAllWebPromotion() {
		// TODO Auto-generated method stub
		return new ArrayList<PromotionVO>();
	}
	@Override
	public boolean deleteStrategy(int strategyNo) {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public void updateMemberLevelSystem(PromotionVO vo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addMemberLevelSystem(PromotionVO vo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public PromotionVO getMemberLevelSystem() {
		// TODO Auto-generated method stub
		return null;
	}
}
