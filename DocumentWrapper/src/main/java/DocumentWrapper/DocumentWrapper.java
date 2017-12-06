package DocumentWrapper;

import com.liferay.content.targeting.analytics.service.AnalyticsEventLocalServiceWrapper;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.service.component.annotations.Component;

/**
 * @author adms.java1
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class DocumentWrapper extends AnalyticsEventLocalServiceWrapper {

	public DocumentWrapper() {
		super(null);
	}

}