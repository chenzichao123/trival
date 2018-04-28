package cn.bdqn.test;

import java.sql.Connection;

import org.junit.Test;

import cn.bdqn.utils.JDBCUtils;

public class ConnTest {
@Test
public void conntest(){
	Connection conn=JDBCUtils.getConn();
	System.out.println(conn);
}
}
