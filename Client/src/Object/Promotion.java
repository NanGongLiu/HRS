package Object;
import java.io.Serializable;
import java.util.List;
import java.sql.Time;
import LineItem.PromotionLineItem;
import List.PromotionList;
import common.ResultMessage;
/**
 * Ӫ�����Ե�����ʵ��
 * @author LW
 * @version 1.0
 * @see
 */
public class Promotion implements Serializable{
   private static final long serialVersionUID=1L;
   private String promotionNumber;
   private String promotionId;
   private Time beginTime;
   private Time endTime;
   private Time Birthday;
   private int roomNumber;
   private boolean corporateMember;
   private String hotelDistrict;
   private ResultMessage memberGrade;
   private double discount;
   
   /**
	 * ����Ӫ����������ʵ��
	 * @param promotionnumber String�ͣ��߼��㴫����Ӫ�����Ա��
	 * @param promotionid String�ͣ��߼��㴫����Ӫ����������
	 * @param begintime Time�ͣ��߼��㴫���Ŀ�ʼʱ��
	 * @param endtime Time�ͣ��߼��㴫���Ľ���ʱ��
	 * @param birthday Time�ͣ����ݲ㴫��������
	 * @param roomnumber int�ͣ��߼��㴫���ķ�������
	 * @param corporatemember boolean�ͣ����ݲ㴫�����Ƿ�����ҵ��Ա
	 * @param hoteldistrict String�ͣ��߼��ഫ������Ȧ
	 * @param membergrade ResultMessage�ͣ����ݲ㴫���Ļ�Ա�ȼ�
	 * @param dcount double�ͣ��߼��ഫ�����ۿ�
	 * @return
	 * @throws
	 * @see
	 */
   public Promotion(String promotionnumber,String promotionid,Time begintime,Time endtime,Time birthday,int roomnumber,boolean corporatemember,String hoteldistrict,ResultMessage membergrade,double dcount){
	   promotionNumber=promotionnumber;
	   promotionId=promotionid;
	   beginTime=begintime;
	   endTime=endtime;
	   Birthday=birthday;
	   roomNumber=roomnumber;
	   corporateMember=corporatemember;
	   hotelDistrict=hoteldistrict;
	   memberGrade=membergrade;
	   discount=dcount;
   }
   /**
	 * ����Ӫ�����Ե�����ʵ��
	 * @return
	 */
   public Promotion(){
	    
   }
   /**
	 * ����Ӫ�����Ժ�
	 * @param number String�ͣ��߼��㴫����Ӫ�����Ժ�
	 * @return
	 * @throws
	 * @see
	 */
  public void setpromotionNumber(String number){
  	promotionNumber=number;
  }
  /**
	 * ��ȡӪ�����Ժ�
	 * @param
	 * @return ����Ӫ�����Ժ�
	 * @throws
	 * @see
	 */
  public String getpromotionNumber() {
  	return promotionNumber;
  } 
  /**
	 * ����Ӫ��������
	 * @param id String�ͣ��߼��㴫����Ӫ��������
	 * @return
	 * @throws
	 * @see
	 */
public void setpromotionId(String id){
	promotionId=id;
}
/**
	 * ��ȡӪ��������
	 * @param
	 * @return ����Ӫ��������
	 * @throws
	 * @see
	 */
public String getpromotionId() {
	return promotionId;
} 
/**
 * ���ÿ�ʼʱ��
 * @param date1 Time�ͣ��߼��㴫���Ŀ�ʼʱ��
 * @return
 * @throws
 * @see
 */
public void setbeginTime(Time date1){
	beginTime=date1;
}
/**
 * ��ȡ��ʼʱ��
 * @param
 * @return ���ؿ�ʼʱ��
 * @throws
 * @see
 */
public Time getbeginTime() {
	return beginTime;
} 
/**
 * ���ý���ʱ��
 * @param date2 Time�ͣ��߼��㴫���Ľ���ʱ��
 * @return
 * @throws
 * @see
 */
public void setendTime(Time date2){
	endTime=date2;
}
/**
 * ��ȡ����ʱ��
 * @param
 * @return ���ؽ���ʱ��
 * @throws
 * @see
 */
public Time getendTime() {
	return endTime;
} 
/**
 * �����ۿ�
 * @param dc double�ͣ��߼��㴫�����ۿ�
 * @return
 * @throws
 * @see
 */
public void setdiscount(double dc){
	discount=dc;
}
/**
 * ��ȡ�ۿ�
 * @param
 * @return �����ۿ�
 * @throws
 * @see
 */
public double getdiscount() {
	return discount;
} 
/**
 * ���û�Ա�ȼ�
 * @param memberGrade ResultMessage�ͣ����ݲ㴫���Ļ�Ա�ȼ�
 * @return ���ػ�Ա�ȼ�
 * @throws
 * @see
 */
public ResultMessage setmemberGrade(int creditvalue){
	return memberGrade;
}
/**
 * ���û�Ա�ȼ��ۿ�
 * @param memberGrade ResultMessage�ͣ����ݲ㴫���Ļ�Ա�ȼ�
 * @return �����ۿ�
 * @throws
 * @see
 */
public double setmemberGradeDiscount(ResultMessage membergrade){
	return discount;
}
/**
 * ���û�Ա�����ۿ�
 * @param  birthday Time�ͣ����ݲ㴫��������
 * @return �����ۿ�
 * @throws
 * @see
 */
public double setbirthdayDiscount(Time birthday){
	return discount;
}
/**
 * ������ҵ��Ա�ۿ�
 * @param  coporateMember boolean�ͣ����ݲ㴫���Ļ�Ա����
 * @return �����ۿ�
 * @throws
 * @see
 */
public double setcorporateMemberDiscount(boolean corporateMember){
	return discount;
}
/**
 * ���÷��������ۿ�
 * @param  roomNumber int�ͣ��߼��㴫���ķ�������
 * @return �����ۿ�
 * @throws
 * @see
 */
public double setroomNumberDiscount(int roomNumber){
	return discount;
}
private PromotionList promotionList;
/**
	 * ���Ӫ�������б�
	 * @param pl PromotionList�ͣ���Ӧ�Ķ����б�
	 * @return
	 */
public void addPromotionList(PromotionList pl) {
	promotionList = pl;
}

/**
 * ���Ӫ������
 * @param promotionnumber String�ͣ�Ӫ�����Ժ�
 * @param promotionid String�ͣ�Ӫ��������
 * @param begintime Time�ͣ���ʼʱ��
 * @param endtime Time�ͣ�����ʱ��
 * @param hoteldistrict String�ͣ���Ȧ
 * @param dcount double�ͣ��ۿ�
 * @return
 * @throws
 * @see
 */
public int add(String promotionnumber,String promotionid,Time begintime,Time endtime,Time birthday,int roomnumber,boolean corporatemember,String hoteldistrict,ResultMessage membergrade,double dcount) {
	promotionList.addPromotionLineItems(new PromotionLineItem(new Promotion(promotionnumber,promotionid,begintime,endtime,birthday,roomnumber,corporatemember,hoteldistrict, membergrade,dcount)));
	return promotionList.getPromotion();
}
/**
	 * �����û����õ�Ӫ������
	 * @param id String�ͣ��û��˺�
	 * @return ���õ�Ӫ��������
	 */
public int getPromotion(String userID) {
	return promotionList.getPromotion(userID);
}
/**
 * ɾ��Ӫ������
 * @param promotionnumber String�ͣ�Ӫ�����Ժ�
 * @return
 * @throws
 * @see
 */
public int delete(Promotion promotion) {
	promotionList.deletePromotionLineItems(new PromotionLineItem(promotion));
	return promotionList.getPromotion();
}
}
