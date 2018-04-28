package cn.bdqn.test;

import cn.bdqn.Dao.MenPiaoDao;
import cn.bdqn.Dao.MenPiaoDaoImpl;

public class DaoTest {
public static void main(String[] args) {
	MenPiaoDao mpi=new MenPiaoDaoImpl();
	mpi.getSidBySheng("江苏");
	mpi.getAllBySid(6);
	
}
}
