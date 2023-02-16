package com.inp;
//MultiLevel inheritance(child)
public class MultiLevelInheritanceChild  extends MultipleLevelP2{
public void empPro() {
System.out.println("Ecommerce");
}
public static void main(String[] args) {
	MultiLevelInheritanceChild u=new MultiLevelInheritanceChild();
	u.empAdd();
	u.empId();
	u.empName();
	u.empPin();
	u.empPro();
}
}
