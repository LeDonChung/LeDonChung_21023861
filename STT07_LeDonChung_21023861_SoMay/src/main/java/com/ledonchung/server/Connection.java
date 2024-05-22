package com.ledonchung.server;

import com.ledonchung.server.utils.AppUtils;

public class Connection {
	public static void main(String[] args) {
//		CREATE DATABASE LeDonChung_21023861
//		CHARACTER SET = 'utf8mb4'
//		root - sapassword
//		root - root
		var em = AppUtils.getEntityManager();
		em.close();
	}
}
