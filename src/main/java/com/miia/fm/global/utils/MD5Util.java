/**  
 * All rights Reserved, Designed By MIIA
 * @Title: MD5Util.java
 * @author: ycj for MIIA  
 * @date: 2018.10   
 * @version V1.0 
 * @Copyright: 2018 MIIA All rights reserved. 
 * @License Apache License 2.0
 */
package com.miia.fm.global.utils;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * @author miia
 * @since beijing @ 2018.10
 */
public class MD5Util {

	/**
	 * 转MD5
	 * 
	 * @param text
	 * @return
	 */
	public static String MD5(String text) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bytes = md.digest(text.getBytes("utf-8"));
			return toHex(bytes);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Md5加密
	 * 
	 * @param bytes
	 * @return
	 */
	public static String toHex(byte[] bytes) {
		final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();
		StringBuilder ret = new StringBuilder(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
			ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
		}
		return ret.toString();
	}

	public static void main(String[] args) {
		String password = "admin";
		password = MD5(password);
		System.out.println("hetPassword:" + password);
		String salt = UUID.randomUUID().toString();
		System.out.println("salt:" + salt);
		password = MD5(password + salt);
		System.out.println("hexPasswordSalt:" + password);
	}

}
