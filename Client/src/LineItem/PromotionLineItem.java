package LineItem;

import Object.Promotion;
public class PromotionLineItem {
Promotion promotion;
	
	/**
	 * ����Ӫ������
	 * @param p Promotion�ͣ�����Ӫ�����Զ���
	 * @return ����Ӫ������
	 */
	public PromotionLineItem (Promotion p) {
		promotion= p;
	}
	/**
	 * @param 
	 * @return Ӫ����������
	 */
	public String pro() {
		return promotion.getpromotionId();	
	}
}

