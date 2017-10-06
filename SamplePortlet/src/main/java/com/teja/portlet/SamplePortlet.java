package com.teja.portlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

public class SamplePortlet extends MVCPortlet {

	public void doView(RenderRequest req, RenderResponse res) throws PortletException, IOException{
		include("/view.jsp", req, res);
	}
}
