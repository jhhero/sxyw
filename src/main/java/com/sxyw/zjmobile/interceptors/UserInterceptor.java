package com.sxyw.zjmobile.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sxyw.zjmobile.commons.enums.Constants;
import com.sxyw.zjmobile.commons.enums.Pages;
import com.sxyw.zjmobile.commons.utils.Utils;

public class UserInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
			Object obj) throws Exception {

		if (req.getSession().getAttribute(Constants.LOGGED_USER) == null) {

			Utils.redirect(Pages.ADMIN_LOGIN, req, res);

			return false;
		}

		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest req,
			HttpServletResponse res, Object obj, Exception e) throws Exception {
	}

	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse res,
			Object obj, ModelAndView mv) throws Exception {
	}

}
