package com.teja.hook;

import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserLocalServiceWrapper;

public class MyUserLocalServiceImpl extends UserLocalServiceWrapper {

	public MyUserLocalServiceImpl(UserLocalService userLocalService) {
		super(userLocalService);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public com.liferay.portal.model.User deleteUser(long userId) throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
		System.out.println("Deleting user");
		return super.deleteUser(userId);
	}
}
