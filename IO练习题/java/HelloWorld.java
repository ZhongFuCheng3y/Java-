/*
	需求：我准备写一个java程序，把"HelloWorld"这句话输出在控制台
	
	分析：
		A:要写一个Java程序，必须定义类
		B:把数据能够输出，说明我们的程序是可以独立运行的，而程序要独立运行，必须定义main方法
		C:把数据输出在控制台，必须使用输出语句
		
	实现：
		A:java语言提供了一个关键字：class用来定义类，后面跟的是类名
		B:main方法的格式是固定的：
			public static void main(String[] args) {
			
			}
		C:输出语句的格式是固定的：
			System.out.println("HelloWorld");
			"HelloWorld"这个内容是可以改变的
*/

//这是我的HelloWorld案例
class HelloWorld {
	/*
		为了程序能够独立运行，定义main方法
		main方法是程序的入口
		被jvm自动调用
	*/
	public static void main(String[] args) {
		//为了把数据显示在控制台，我们就使用了输出语句
		System.out.println("HelloWorld");
	}
}