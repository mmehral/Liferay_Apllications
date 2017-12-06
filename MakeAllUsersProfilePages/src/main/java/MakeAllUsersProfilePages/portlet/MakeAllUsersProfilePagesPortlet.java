package MakeAllUsersProfilePages.portlet;

import MakeAllUsersProfilePages.constants.MakeAllUsersProfilePagesPortletKeys;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.model.LayoutConstants;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.LayoutLocalService;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.social.kernel.model.SocialRelationConstants;
import com.liferay.social.kernel.service.SocialRelationLocalService;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * @author adms.java1
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MakeAllUsersProfilePages Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MakeAllUsersProfilePagesPortletKeys.MakeAllUsersProfilePages,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MakeAllUsersProfilePagesPortlet extends MVCPortlet {
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
			createProfilePagesForNewUsers(renderRequest, renderResponse);
			createDashboardPagesForNewUser(renderRequest, renderResponse);
			
			
			makeAllUsersFriendsByDefault(renderRequest, renderResponse);
		
		super.render(renderRequest, renderResponse);
	}
	
	
	protected void createDashboardPagesForNewUser(RenderRequest actionRequest, RenderResponse actionResponse){
		 //ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
				  //  long userId = themeDisplay.getUserId();
				  //  long groupId = themeDisplay.getScopeGroupId();
				    boolean privateLayout = true;// private page or public page
				   // long parentLayoutId = 0;
				    String name = "Welcome";
				    // title = "Inside SEO HTML Title";
				//    String description = "Inside SEO Description";
				    String type = LayoutConstants.TYPE_PORTLET;
				    boolean hidden = false;
				  //  String friendlyURL = "/user/";
				    ServiceContext serviceContext = new ServiceContext();
				   
				    	 long companyId=	CompanyThreadLocal.getCompanyId();
				    	 List<User> userList =	userLocalService.getCompanyUsers(companyId, 0,userLocalService.getUsersCount() );
				 	//	ServiceContext ctx=    ServiceContextThreadLocal.getServiceContext();
				 		 for(User user :userList)
				 		    {
				 			 if(user.getLastLoginDate()==null)
				 		     {  try 
						        { 
				 				 
				 				 
				 				 
				 				Group group = null;
							     group = groupLocalService.getGroup(companyId, String.valueOf(user.getUserId()));
							     Layout userPrivateLayout =  LayoutLocalServiceUtil.addLayout(user.getUserId(),  group.getGroupId(), privateLayout, 1,name,null,null, type, hidden,"/home",serviceContext); 
							     List<Layout> layoutData  = LayoutLocalServiceUtil.getLayouts(0, LayoutLocalServiceUtil.getLayoutsCount());
							     for(Layout layout : layoutData)
							     {
							    	 if(layout.getGroupId()==32349 && layout.getCompanyId()==20116 && layout.getHidden()==false)
							    	 {
							    		 Layout newLayout =  LayoutLocalServiceUtil.addLayout(user.getUserId(),  group.getGroupId(), privateLayout, layout.getParentLayoutId(),layout.getName(Locale.US),layout.getTitle(),layout.getDescription(), layout.getType(), false,layout.getFriendlyURL(),serviceContext);
							    		 newLayout.setLayoutId(layout.getLayoutId());
							    		 newLayout.setPriority(layout.getPriority());
							    		 newLayout.setThemeId(layout.getThemeId());
							    		 newLayout.setColorSchemeId(layout.getColorSchemeId());
							    		 newLayout.setTypeSettings(layout.getTypeSettings());
							    		 LayoutLocalServiceUtil.updateLayout(newLayout);
							    		 System.out.println("new layout created");
							    	 }
							     }
							     
							     userPrivateLayout.setThemeId("cholathemenew_WAR_cholathemenew");
									userPrivateLayout.setColorSchemeId("01");
									String typeSettingsPrivate;
									typeSettingsPrivate="column-1=com_liferay_contacts_web_portlet_ProfilePortlet_INSTANCE_Yb1Sx8Qpbv24\n";
									typeSettingsPrivate+="column-2=com_liferay_bookmarks_web_portlet_BookmarksPortlet\n";
									typeSettingsPrivate+="layout-template-id=2_columns_iii\n";
									typeSettingsPrivate+="layoutUpdateable=true\n";
									typeSettingsPrivate+="privateLayout=true";
									userPrivateLayout.setTypeSettings(typeSettingsPrivate);
							     
									layoutLocalService.updateLayout(userPrivateLayout);
						        } 
							    catch (PortalException e) 
							      {
							      e.printStackTrace();
							      }
				 		     }
				 		    }
				    	 
				    	 
				          
				        
	}
	
	protected void createProfilePagesForNewUsers(RenderRequest actionRequest, RenderResponse actionResponse) {
				
		long companyId=	CompanyThreadLocal.getCompanyId();
		
		List<User> userList =	userLocalService.getCompanyUsers(companyId, 0,userLocalService.getUsersCount() );
		ServiceContext ctx=    ServiceContextThreadLocal.getServiceContext();
		 for(User user :userList)
		    {
			 if(user.getLastLoginDate()==null)
		     {
				 
				try {
					Layout userPublicLayout =layoutLocalService.createLayout(0);
				     Group group = null;
				     group = groupLocalService.getGroup(companyId, String.valueOf(user.getUserId()));
				     String xml="Welcome";
				     //Map<Locale, String> name =LocalizationUtil.getLocalizationMap(xml);
				    
					
					userPublicLayout = layoutLocalService.addLayout(user.getUserId(), group.getGroupId(), false, 0,xml, null, null, "portlet", false, "/home", ctx);
					userPublicLayout.setThemeId("cholathemenew_WAR_cholathemenew");
					userPublicLayout.setColorSchemeId("01");
					
					//userPrivateLayout=layoutLocalService.addLayout(user.getUserId(), group.getGroupId(), true, 1,xml, null, null, "portlet", false, "/home", ctx);
					
					
					String typeSettingsPublic;
					typeSettingsPublic="column-1=com_liferay_contacts_web_portlet_ProfilePortlet_INSTANCE_0XGj45Y8I2pI,com_liferay_social_activities_web_portlet_SocialActivitiesPortlet\n";
					typeSettingsPublic+="column-2=com_liferay_social_networking_web_wall_portlet_WallPortlet\n";
					typeSettingsPublic+="layout-template-id=2_columns_ii\n";
					typeSettingsPublic+="layoutUpdateable=true\n";
					typeSettingsPublic+="sitemap-changefreq=daily\n";
					typeSettingsPublic+="sitemap-include=1";
					userPublicLayout.setTypeSettings(typeSettingsPublic);
					
					layoutLocalService.updateLayout(userPublicLayout);
			     System.out.println("Profile Page Created Successfully for User : "+user.getFullName());
				} catch (Exception e) {
				}
		     }
		    }
	}
	
	
	protected void makeAllUsersFriendsByDefault(RenderRequest actionRequest, RenderResponse actionResponse) {

		
	     
		List<User> userList =	userLocalService.getUsers(0,userLocalService.getUsersCount());

		for(User user1:userList){
			
	    for(User user :userList)
	    {
	    	if(user.getUserId()!=user1.getUserId())
	    	{
	    		
	    	try {
	socialRelationLocalService.addRelation(user1.getUserId(), user.getUserId(), SocialRelationConstants.TYPE_BI_FRIEND);
	System.out.println(user1.getFullName()+" is now friend with "+user.getFullName());
	    	} catch (PortalException e) {
				e.printStackTrace();
			}	
	    		
	    	}
	    			
	    }
	    
	}
		
	}
	
	 @Reference
	 UserLocalService userLocalService;
	 
	 @Reference
	 LayoutLocalService layoutLocalService;
	 
	 @Reference
	 GroupLocalService groupLocalService;
	 
	 @Reference
	 SocialRelationLocalService socialRelationLocalService;
	 
}