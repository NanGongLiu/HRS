package userBLImpl;

import java.util.HashMap;
/**
 * ����PromotionInfo�ӿڵ�ʵ��
 * @author LZ
 * @version 1.0
 */
public class MemberGrade implements PromotionInfo{
	private HashMap<Integer,Long> map;
	public MemberGrade(){
		map=new HashMap<Integer, Long>();
	}
	/**
	 * ��ȡ��Ա�ȼ�ϵͳ��Ϣ
	 * @return ���ػ�Ա�ȼ�ϵͳ
	 */
	@Override
	public HashMap<Integer,Long> getLevelSystem() {
		// TODO Auto-generated method stub
		return map;
	}
}
