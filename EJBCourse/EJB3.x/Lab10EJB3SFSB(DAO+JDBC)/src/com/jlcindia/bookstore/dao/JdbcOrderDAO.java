package com.jlcindia.bookstore.dao;

import java.sql.*;
import java.util.*;

import com.jlcindia.bookstore.to.OrderItemTO;
import com.jlcindia.bookstore.to.OrderTO;
import com.jlcindia.bookstore.util.DataSourceUtil;

public class JdbcOrderDAO implements OrderDAO{

	int count=1;
	public int addOrder(OrderTO oto, List items) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			oto.setOrderId(1001);
			con=DataSourceUtil.getConnection();
			ps=con.prepareStatement("insert into orders values(?,?,?,?,?)");
			ps.setInt(1, oto.getOrderId());
			ps.setString(2, oto.getOrderDate());
			ps.setInt(3, oto.getTotalQty());
			ps.setDouble(4, oto.getTotalCost());
			ps.setString(5, oto.getStatus());
			int x=ps.executeUpdate();
			if(x==1){
				System.out.println("Order is placed successfully");
			}
			ps=con.prepareStatement("insert into orderItems values(?,?,?,?,?)");
			Iterator it=items.iterator();
			while(it.hasNext()){
				OrderItemTO oito=(OrderItemTO) it.next();
				ps.setInt(1, oto.getOrderId());
				ps.setInt(2, count++);
				ps.setString(3, oito.getBookId());
				ps.setInt(4, oito.getQty());
				ps.setDouble(5, oito.getCost());
				ps.executeUpdate();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DataSourceUtil.cleanup(con, ps, rs);
		}
		return oto.getOrderId();
	}

}
