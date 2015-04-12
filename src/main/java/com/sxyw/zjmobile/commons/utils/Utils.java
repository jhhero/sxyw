package com.sxyw.zjmobile.commons.utils;

import java.io.IOException;
import java.security.MessageDigest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sxyw.zjmobile.commons.enums.Constants;

public class Utils {
	
	public static void redirect(String url, HttpServletRequest req,
			HttpServletResponse res) throws IOException {

		res.sendRedirect(req.getSession().getServletContext()
				.getAttribute(Constants.CONTEXT_PATH)
				+ url + "/");
	}

	public static String gravatarMd5Hex(String email) {
		try {

			final byte[] bytes = MessageDigest.getInstance("MD5").digest(
					email.getBytes("CP1252"));

			final StringBuffer sb = new StringBuffer(bytes.length);
			for (final byte b : bytes) {

				sb.append(Integer.toHexString((b & 0xFF) | 0x100).substring(1,
						3));
			}

			return sb.toString();
		} catch (Exception e) {

			return null;
		}
	}

}
