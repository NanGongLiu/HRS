package PO;

import java.io.Serializable;
import java.sql.Time;
/**
 * �������Ե�����ʵ��
 * @author LZ
 * @version 1.0
 * @see
 */
public class PromotionPO extends PO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String promotionNumber;
	private String promotionName;
	private Time promotionBegintime;
	private Time promotionEndtime;
	private String userType;
	private String businesscircle;
	private int userShipgrade;
	private int miniNum;
	private double promotionDiscount;
	private int[] creditOfLevel=new int[5];
	private double[] discountOfLevel=new double[5];
	/**
	 * ������ͨ��������
	 * @param promotionnumber String�ͣ��߼��㴫���Ĳ��Ա��
	 * @param promotionname String�ͣ��߼��㴫���Ĳ�������
	 * @param promotionbegintime Time�ͣ��߼��㴫���Ĳ��Կ�ʼʱ��
	 * @param promotionendtime Time�ͣ��߼��㴫���Ĳ��Խ���ʱ��
	 * @param usertype Time�ͣ��߼��㴫���Ŀͻ�����
	 * @param hotelbusinesscircle String�ͣ��߼��㴫����������Ȧ
	 * @param usershipgrade int�ͣ��߼��㴫���Ŀͻ����õȼ�
	 * @param num int�ͣ��߼��㴫������Ͷ�������
	 * @param promotiondiscount double�ͣ��߼��㴫�����ۿ�
	 * @return
	 * @throws
	 * @see
	 */
	public PromotionPO(String promotionnumber,String promotionname,Time promotionbegintime,Time promotionendtime, String usertype,String hotelbusinesscircle,int usershipgrade,int num,double promotiondiscount){
	     promotionNumber=promotionnumber;
	     promotionName=promotionname;
	     promotionBegintime=promotionbegintime;
	     promotionEndtime=promotionendtime;
	     userType=usertype;
	     businesscircle=hotelbusinesscircle;
	     userShipgrade=usershipgrade;
	     miniNum=num;
	     promotionDiscount=promotiondiscount;
	 }
	/**
	 * �����Ա�ȼ��ƶ�
	 * @param a int[]�ͣ��߼��㴫����ÿ���ȼ�������ֵ
	 * @param b int[]�͡��߼��㴫����ÿ���ȼ����ۿ�
	 * @return
	 * @throws
	 * @see
	 */
	public PromotionPO(int a[],double b[]){
		for(int i=0;i<a.length;i++){
			creditOfLevel[i]=a[i];
		}
		for(int i=0;i<b.length;i++){
			discountOfLevel[i]=b[i];
		}
	}
	/**
	 * ��ȡÿ���ȼ�������ֵ
	 * @param
	 * @return ����ÿ���ȼ�������ֵ
	 * @throws
	 * @see
	 */
	 public int[] getCreditOfLevel(){
		 return creditOfLevel;
	 }
	 /**
		 * ���ò���ÿ���ȼ�����ֵ
		 * @param a int[]�ͣ��߼��㴫����ÿ���ȼ�������ֵ
		 * @return 
		 * @throws
		 * @see
		 */
	 public void setCreditOfLevel(int[] a){
		 for(int i=0;i<a.length;i++){
			creditOfLevel[i]=a[i];
		}
	 }
	 /**
		 * ��ȡÿ���ȼ����ۿ�
		 * @param
		 * @return ����ÿ���ȼ����ۿ�
		 * @throws
		 * @see
		 */
	 public double[] getDiscountOfLevel(){
		 return discountOfLevel;
	 }
	 /**
		 * ���ò���ÿ���ȼ��ۿ�
		 * @param b int[]�͡��߼��㴫����ÿ���ȼ����ۿ�
		 * @return
		 * @throws
		 * @see
		 */
	 public void setDiscountOfLevel(double[] b){
		 for(int i=0;i<b.length;i++){
				discountOfLevel[i]=b[i];
			}
	 }
	 /**
		 * ��ȡ���Ա��
		 * @param
		 * @return ���ز��Ա��
		 * @throws
		 * @see
		 */
	 public String getPromotionNumber(){
	     return promotionNumber;
	 }
	 /**
		 * ���ò��Ա��
		 * @param number String�ͣ��߼��㴫���Ĳ��Ա��
		 * @return
		 * @throws
		 * @see
		 */
	 public void setPromotionNumber(String number){
	     promotionNumber=number;
	 }
	 /**
		 * ��ȡ��������
		 * @param
		 * @return ���ز�������
		 * @throws
		 * @see
		 */
	 public String getPromotionName(){
	     return promotionName;
	 }
	 /**
		 * ���ò�������
		 * @param name String�ͣ��߼��㴫���Ĳ�������
		 * @return
		 * @throws
		 * @see
		 */
	 public void setPromotionName(String name){
	     promotionName=name;
	 }
	 /**
		 * ��ȡ���Կ�ʼʱ��
		 * @param
		 * @return ���ز��Կ�ʼʱ��
		 * @throws
		 * @see
		 */
	 public Time getPromotionBegintime(){
	     return promotionBegintime;
	 }
	 /**
		 * ���ò��Կ�ʼʱ��
		 * @param begintime Time�ͣ��߼��㴫���Ŀ�ʼʱ��
		 * @return
		 * @throws
		 * @see
		 */
	 public void setPromotionBegintime(Time begintime){
	     promotionBegintime=begintime;
	 }
	 /**
		 * ��ȡ���Խ���ʱ��
		 * @param
		 * @return ���ز��Խ���ʱ��
		 * @throws
		 * @see
		 */
	 public Time getPromotionEndtime(){
	     return promotionEndtime;
	 }
	 /**
		 * ���ò��Խ���ʱ��
		 * @param endtime Time�ͣ��߼��㴫���Ľ���ʱ��
		 * @return
		 * @throws
		 * @see
		 */
	 public void setPromotionEndtime(Time endtime){
	     promotionEndtime=endtime;
	 }
	 /**
		 * ��ȡ�ͻ���������
		 * @param
		 * @return ���ؿͻ���������
		 * @throws
		 * @see
		 */   
	 public String getUserType(){
	     return userType;
	 }
	 /**
		 * ���ÿͻ���������
		 * @param type String �ͣ��߼��㴫���Ŀͻ���������
		 * @return
		 * @throws
		 * @see
		 */
	 public void setUserType(String type){
	    userType=type;
	 }
	 /**
		 * ��ȡ������Ȧ
		 * @param 
		 * @return ����������Ȧ
		 * @throws
		 * @see
		 */
	 public String getHotelBussinesscircle(){
	    return businesscircle;
	 }
	 /**
		 * ����������Ȧ
		 * @param circle String�ͣ��߼��㴫����������Ȧ
		 * @return
		 * @throws
		 * @see
		 */
	 public void setHotelBussinesscircle(String circle){
		 businesscircle=circle;
	 }
	 /**
		 * ��ȡ�ͻ����õȼ�
		 * @param
		 * @return ���ؿͻ����õȼ�
		 * @throws
		 * @see
		 */
	 public int getUserShipgrade(){
	     return userShipgrade;
	 }
	 /**
		 * ���ÿͻ����õȼ�
		 * @param grade int�ͣ��߼��㴫���Ŀͻ����õȼ�
		 * @return
		 * @throws
		 * @see
		 */
	 public void setUserShipgrade(int grade){
	     userShipgrade=grade;
	 }
	 /**
		 * ��ȡ��Ͷ�������
		 * @param
		 * @return ������Ͷ�������
		 * @throws
		 * @see
		 */
	 public int getMiniNum(){
	     return miniNum;
	 }
	 /**
		 * ������Ͷ�������
		 * @param num int�ͣ��߼��㴫������Ͷ�������
		 * @return
		 * @throws
		 * @see
		 */
	 public void setMiniNUm(int num){
	     miniNum=num;
	 }
	 /**
		 * ��ȡ�����ۿ�
		 * @param
		 * @return ���ز����ۿ�
		 * @throws
		 * @see
		 */
	 public double getPromotionDiscount(){
	     return promotionDiscount;
	 }
	 /**
		 * ���ò����ۿ�
		 * @param discount double�ͣ��߼��㴫���Ĳ����ۿ�
		 * @return
		 * @throws
		 * @see
		 */
	 public void setPromotionDiscount(double discount){
	     promotionDiscount=discount;
	 }
}
