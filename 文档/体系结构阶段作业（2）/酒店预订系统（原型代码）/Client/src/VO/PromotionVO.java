package VO;

import java.sql.Time;

import Object.Promotion;

/**
 * �������Ե����Լ����ݴ��������
 * @author ����٩
 * @version 1.0
 * @see Object.Promotion
 */

public class PromotionVO extends VO {

	 public String promotionNumber;
	 public String promotionName;
	 public Time promotionBegintime;
	 public Time promotionEndtime;
	 public String userType;
	 public String businesscircle;
	 public int userShipgrade;
	 public int miniNum;
	 public double promotionDiscount;
	 public int[] creditOfLevel=new int[5];
	 public double[] discountOfLevel=new double[5];
	/**
     * ���´���������Ϣ
     * 
     * @param promo Promotion�ͣ�һ�������������ݵĴ������Զ���
     * @return 
     * @see Object.Promotion
     */
	public void update(Promotion promo) {
		
	}
	
	/**
     * �����������Զ���
     * 
     * @return һ���½����Ĵ�������
     * @see Object.Promotion
     */
	public Promotion makePromotion() {
		
		return new Promotion();
	}
	
}
