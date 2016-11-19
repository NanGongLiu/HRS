package promotionBLService;
import java.util.*;
import VO.*;
import common.*;
import Object.*;

/**
 * ����ʵ��Ӫ�����Խ�������Ҫ�ķ���ӿ�  
 * @author ������
 * @version 1.0
 * @see presentation.Promotion
 */

public interface PromotionBLService {
    /**
     * ���һ���µľƵ�Ӫ�����ԣ�������
     * 
     * @param vo PromotionVO�ͣ����������Ӫ������
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Promotion
     */
	public ResultMessage madebyhotel (PromotionVO vo);
	
	
	/**
     * ���һ���µ���վӪ�����ԣ�������
     * 
     * @param vo PromotionVO�ͣ����������Ӫ������
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Promotion
     */
	public ResultMessage madebyweb (PromotionVO vo ); 

	
	/**
     * ��ǻ�Ա�ȼ���׼
     * 
     * @param vo PromotionVO�ͣ���������Ļ�Ա�ȼ���ע
     * @return ����ResultMessageö��ֵ�е�һ��
     * @see bussinesslogic.Promotion
     */
	public ResultMessage memberlevelmade(PromotionVO vo);

	
	/**
     * ȡ��һ������
     * 
     * @param promotion Promotion�ͣ���Ҫȡ���Ķ���
     * @return ȡ���ɹ��򷵻�true�����򷵻�true
     * @see bussinesslogic.Promotion
     */
	public boolean cancel(Promotion promotion);
	
	
	/**
     * ��ʾ�������õ�Ӫ������
     * 
     * @param userID String�ͣ��ͻ���ID
     * @return ArrayList<PromotionVO>��һ��Ӫ������ֵ������б�
     * @see bussinesslogic.Promotion
     */
	public ArrayList<PromotionVO> getPromotion(String userID);
	
	public ArrayList<PromotionVO> getAllWebPromotion();


	public boolean deleteStrategy(int strategyNo);


	public void updateMemberLevelSystem(PromotionVO vo);


	public void addMemberLevelSystem(PromotionVO vo);


	public PromotionVO getMemberLevelSystem();
}
