package com.neuedu.util;

import java.sql.SQLException;

public class test {
	public static void main(String[] args) {
		try {
			DBUtil.getInstance().getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
