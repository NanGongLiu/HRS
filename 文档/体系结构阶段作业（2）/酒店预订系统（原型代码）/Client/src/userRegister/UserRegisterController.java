package userRegister;
import VO.UserVO;
import common.ResultMessage;
import common.UserType;
import userBLService.UserBLService_realize;
public class UserRegisterController extends UserBLService_realize{
	/**
	 * �ͻ�ע��
	 * @param in MessageInput�ͣ����������ע����Ϣ
	 * @return ����ResultMessage������ö��ֵ
	 * @see bussinesslogic.User
	 */
		public ResultMessage register(UserVO vo) {
		return ResultMessage.Exist;
	}
}
