package com.teja.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

public class SamplePortlet extends MVCPortlet {

	public void doView(RenderRequest req, RenderResponse res) throws PortletException, IOException{
		String name = req.getParameter("name");
		System.out.println("in render ------");
		System.out.println(name);
		System.out.println("in render ------");
		req.setAttribute("aName", name);
		include("/view.jsp", req, res);
	}
	
	public void sampleAction(ActionRequest req, ActionResponse res) throws PortletException, IOException{
		String name = req.getParameter("name");
		System.out.println("name: "+name);
		res.setRenderParameter("name", name);
		
		
		
	}
}
