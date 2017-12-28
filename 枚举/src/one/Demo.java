package one;


/*
*
* 我们把Grade用一个类表示,因为String的话,用户还是可以随便传进去的,所以自己定义的类,可以自己限制
*
* 我们创建了一个Grade类,把它的构造方法私有化,用户就不能随便new一个对象,传进去了
* 我们只提供了5个值,用户只能用这5个值,如果用其他的值,就会报错,
*
*
* */
class Grade{

    private Grade(){}
    public static Grade A = new Grade();
    public static Grade B = new Grade();
    public static Grade C = new Grade();
    public static Grade D = new Grade();
    public static Grade E = new Grade();
}