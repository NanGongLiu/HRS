package List;
import java.util.*;

import LineItem.PromotionLineItem;
public class PromotionList {

	List<PromotionLineItem> promotions;
	
	/**
	 * Ӫ�������б�
	 * @param
	 * @return
	 */
	public PromotionList () {
		
		promotions = new ArrayList<PromotionLineItem>();
		
	}
	
	/**
	 * ��ӵ���Ӫ������
	 * @param pli PromotionLineItem�ͣ���ӵĵ���Ӫ������
	 * @return 
	 */
	public void addPromotionLineItems(PromotionLineItem  pli) {
		promotions.add(pli);
	}
	/**
	 * ɾ������Ӫ������
	 * @param pli PromotionLineItem�ͣ�ɾ���ĵ���Ӫ������
	 * @return 
	 */
	public void deletePromotionLineItems(PromotionLineItem  pli) {
		promotions.remove(pli);
	}
	/**
	 * �õ�Ӫ�������б�����
	 * @param
	 * @return ����Ӫ�������б�����
	 */
	public int getPromotionInfo() {
		return promotions.size();
	}
	/**
	 * �õ�Ӫ�������б�����
	 * @param
	 * @return ����Ӫ�������б�����
	 */
	public int getPromotion() {
		return promotions.size();
	}
	/**
	 * �õ�����������Ӫ������
	 * @param
	 * @return ����Ӫ��������
	 */
	public int getPromotion(String userID) {
		int num = 0;
		for(int i=0;i<promotions.size();i++) {
			if(promotions.get(i).pro().equals(userID)) {
				num++;
			}
		}
		return num;
	}
}	



