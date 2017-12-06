
package com.liferay.message.boards.configuration;

import aQute.bnd.annotation.metatype.Meta;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;

/**
 * @author Sergio González
 */
@ExtendedObjectClassDefinition(category = "collaboration")
@Meta.OCD(
	id = "com.liferay.message.boards.configuration.MBConfiguration",
	localization = "content/Language", name = "mb-configuration-name"
)
public interface MBConfiguration {

	/**
	 * Enter time in minutes on how often this job is run. If a user's ban is
	 * set to expire at 12:05 PM and the job runs at 2 PM, the expire will occur
	 * during the 2 PM run.
	 */
	@Meta.AD(deflt = "120", required = false)
	public int expireBanJobInterval();
	
	/**
	 * Flag that determines if the override should be applied.
	 */
	@Meta.AD(deflt = "false", required = false)
	public boolean applyOverride();

}