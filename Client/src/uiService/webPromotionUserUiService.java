package uiService;

import WebPromotionView.WebPromotionUserView;

/**
 * ����ʵ�־Ƶ����ϵͳ����վӪ����Ա�ĳ�ʼ����
 * @author ����٩
 * @version 1.0
 */
public interface webPromotionUserUiService {
	public void toWebPromotionStrategyView();
	public void toCreditManagementView();
	public void toMemberLevelSystemView();
	public void toLogView();
	public void setView(WebPromotionUserView view);
	public void toProcessOrderOrderView();
}