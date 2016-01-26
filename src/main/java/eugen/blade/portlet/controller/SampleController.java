package eugen.blade.portlet.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import eugen.blade.portlet.service.EugenService;

@Controller()
@RequestMapping(value = "VIEW")
public class SampleController {
	@Autowired
	private EugenService eugenService;
	

	@RenderMapping
	public String showForm(RenderRequest request, RenderResponse response)
			throws Exception {
		
		System.out.print(getEugenService().getName());
		
		return "view";
	}


	public EugenService getEugenService() {
		return eugenService;
	}


	public void setEugenService(EugenService eugenService) {
		this.eugenService = eugenService;
	}
}