/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eugen.blade.portlet.jsp;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.springframework.web.portlet.DispatcherPortlet;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.eugen",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.display-name=Spring Portlet Eugen",
		"javax.portlet.init-param.contextConfigLocation=/WEB-INF/context/sample-portlet.xml",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.supports.portlet-mode=view",
		"javax.portlet.supports.mime-type=text/html",
		"javax.portlet.portlet-info.title=Spring Portlet Eugen"
	},
	service = {Portlet.class}
)

public class JSPPortlet extends DispatcherPortlet {

	
	@Activate
	public void activate() {
		System.err.println("Eugen Portlet activated: " + this);
	}
}