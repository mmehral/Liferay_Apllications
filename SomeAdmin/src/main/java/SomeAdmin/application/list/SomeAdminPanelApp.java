package SomeAdmin.application.list;

import SomeAdmin.constants.SomeAdminPanelCategoryKeys;
import SomeAdmin.constants.SomeAdminPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author adms.java1
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + SomeAdminPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class SomeAdminPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return SomeAdminPortletKeys.SomeAdmin;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + SomeAdminPortletKeys.SomeAdmin + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}