package com.babursomer.lesson_041;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.util.BAUtils;

public class CategoryName2Employee {
	static String url = "jdbc:postgresql://localhost:5432/northwind?user=boost&password=boost";
	
	public static void main(String[] args) {
		BAUtils.header("Sipariş Şikayet");
		
		boolean cont = true;
		while (cont) {
			String category = BAUtils.readString("Siparişiniz hangi kategoride idi?");
			findEmployee(ProductCategory.string2ProductCategory(category));
			cont = BAUtils.wantToEnd("Devam etmek isityor musunuz (evet/hayır)?", "hayır");
		}
		BAUtils.footer();
		
	}
	
	private static void findEmployee(ProductCategory productCategory) {
		
		String select = "SELECT DISTINCT firstname, lastname "
				+ "FROM categories a, products p, order_details c, orders b, employees d "
				+ "WHERE a.categoryid=p.categoryid AND " + "p.productid=c.productid AND "
				+ "c.orderid=b.orderid AND b.employeeid=d.employeeid " + "AND a.categoryid=? " + "ORDER BY firstname;";
		
		try (Connection con = DriverManager.getConnection(url);
				PreparedStatement pStmt = con.prepareStatement(select);) {
			pStmt.setInt(1, productCategory.getID());
			ResultSet ordersResultSet = pStmt.executeQuery();
			
			int i = 1;
			while (ordersResultSet.next()) {
				System.out.println(i++ + " - " + ordersResultSet.getString(1) + " " + ordersResultSet.getString(2));
			}
			
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
}
