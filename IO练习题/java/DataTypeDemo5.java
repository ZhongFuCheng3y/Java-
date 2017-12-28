/*
	思考题1：请问下面这个有没有问题
		double d = 12.345;
		float f = d;
		
	思考题2：看看下面两个定义有没有区别呢?
		float f1 = (float)12.345;
		float f2 = 12.345f;
		
		f1其实是通过一个double类型转换过来的。
		而f2本身就是一个float类型。
*/
class DataTypeDemo5 {
	public static void main(String[] args) {
		//把double赋值给float，加了强制类型转换
		double d = 12.345;
		float f = (float)d;
		
		//看看下面两个定义有没有区别呢?
		float f1 = (float)12.345;
		float f2 = 12.345F;
	}
}