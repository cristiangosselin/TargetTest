package com.example.demo;

import org.json.JSONArray;
import org.json.JSONObject;

public class TargetType {

	private static int S3_AWS = 1;
	private static int MYSQL = 2;
	private static int ACTIVE_MQ = 3;
	private static int FTP = 4;
	private static int POSTGRESQL = 5;
	private static int MAIL = 6;
	private static int DROPBOX = 7;
	private static int GOOGLE_DRIVE = 8;
	private static int ONE_DRIVE = 9;

	public boolean is_mysql(int type) {

		return type == TargetType.MYSQL;
	}

	public boolean is_s3_aws(int type) {

		return type == TargetType.S3_AWS;
	}

	public boolean is_active_mq(int type) {

		return type == TargetType.ACTIVE_MQ;
	}

	public boolean is_ftp(int type) {

		return type == TargetType.FTP;
	}

	public boolean is_postgresql(int type) {

		return type == TargetType.POSTGRESQL;
	}

	public boolean is_mail(int type) {

		return type == TargetType.MAIL;
	}

	public boolean is_dropbox(int type) {

		return type == TargetType.DROPBOX;
	}

	public boolean is_google_drive(int type) {

		return type == TargetType.GOOGLE_DRIVE;
	}

	public boolean is_one_drive(int type) {

		return type == TargetType.ONE_DRIVE;
	}

	public static JSONObject getAllTypes() {
		JSONObject jsonObj1=new JSONObject();
		JSONArray array = new JSONArray();
		array.put(new JSONObject().put("type", "S3_AWS").put("id", "1"))
				.put(new JSONObject().put("type", "MYSQL").put("id", "2"))
				.put(new JSONObject().put("type", "ACTIVE_MQ").put("id", "3"));
		jsonObj1.put("data", array);
		return jsonObj1;
	}
}
