package BigDecimal;

/**
 * Created by asd on 2016/9/19.
 */
/*
    1:float和double在运算的时候,很容易丢失精度,
    2:所以java提供了BigDecimal类

    BigDecimal:
        不可变类,任意精度的有符号十进制数,可以解决数据丢失问题

    构造方法：
  		public BigDecimal(String val)

    方法:加减乘除
        public BigDecimal add(BigDecimal augend)
        public BigDecimal subtract(BigDecimal subtrahend)
        public BigDecimal multiply(BigDecimal multiplicand)
        public BigDecimal divide(BigDecimal divisor)
        public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
 */
public class BigDecimalDemo {
}
