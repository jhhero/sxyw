package com.sxyw.zjmobile.commons.enums;

public class Constants {
	
	public static String CONTEXT;
	public static String REAL;

	public static String UPLOAD_PATH() {

		return REAL + "WEB-INF/views/upload/";
	}

	public static String SHOW_PATH() {

		return CONTEXT + "upload/";
	}

	public static final String LOGGED_USER = "loggedUser";
	public static final String UPLOADED_IMAGES = "uploadedImages";
	public static final String ERROR_MESSAGE = "errorMessage";
	public static final String SUCCESS_MESSAGE = "successMessage";
	public static final String HTML_WRAP = "<br>";
	public static final String JS_PARENT = "<script>window.parent.{0}</script>";
	public static final String CONTEXT_PATH = "contextPath";
	public static final long MAX_UPLOAD_SIZE = 1024 * 1024;
	public static final String ALLOW_UPLOAD_TYPE = ".png¡¢.jpg¡¢.jpeg";
	public static final int MAX_RESULTS = 10;
	public static final String LIST = "list";
	public static final String TYPE = "type";
	public static final String YMD_HMS = "yyyy-MM-dd HH:mm:ss";
	public static final String YMD_HM = "yyyy-MM-dd HH:mm";


}
