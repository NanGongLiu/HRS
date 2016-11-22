package uiService;

import java.util.List;

import UserView.CreditView;
import VO.CreditRecordVO;
import VO.OrderVO;

public interface CreditViewControllerService {
public void setView(CreditView view);
public long getcredit(String id);
public void exit();
public String getUserID();
public List<CreditRecordVO> getCreditRecord(String id);

}
