List:(面试题List的子类特点)
	ArrayList:
		底层数据结构是数组，查询快，增删慢。
		线程不安全，效率高。
	Vector:
		底层数据结构是数组，查询快，增删慢。
		线程安全，效率低。
	LinkedList:
		底层数据结构是链表，查询慢，增删快。
		线程不安全，效率高。
		
	List有三个儿子，我们到底使用谁呢?
		看需求(情况)。
		
	要安全吗?
		要：Vector(即使要安全，也不用这个了，后面有替代的)
		不要：ArrayList或者LinkedList
			查询多：ArrayList
			增删多：LinkedList
			
	如果你什么都不懂，就用ArrayList。