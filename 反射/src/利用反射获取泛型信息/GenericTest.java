package 利用反射获取泛型信息;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by ozc on 2016/8/30.
 */
/*
    1：对于普通类型的成员变量，我们可以直接使用getType()获取其类型
        2：对于带泛型的成员变量我们要获取其泛型类型就有点不一样了
            a：根据Field对象获取成员变量的泛型类型
            b：对该变量强制转换成Parameterized类型
            c：使用getActualTypeArguments()获取泛型信息
            d：使用getRawType()获取原始类型信息
 */
public class GenericTest {

    //创建一个Map引用
    private Map<String,Integer> score;

    public static void main(String[] args) throws NoSuchFieldException {

        //获取GenericTest的class对象
        Class<GenericTest> clazz = GenericTest.class;

        //获取Field对象
        Field f = clazz.getDeclaredField("score");

        //直接使用getType()取出的类型只对普通类型的成员变量有效
        Class<?> a = f.getType();
        System.out.println("score is :"+ a);

        //获取成员变量f的泛型类型
        Type gType = f.getGenericType();

        //判断gType类型是ParameterizedType对象
        if(gType instanceof ParameterizedType) {

            //强制转换成ParameterizedType类型
            ParameterizedType pType  = (ParameterizedType)gType;

            //获取原始类型
            Type rType = pType.getRawType();
            System.out.println("原始类型是" + rType);

            //获取泛型类型的泛型参数
            Type[] tArgs = pType.getActualTypeArguments();
            System.out.println("泛型信息是：");
            for(int i=0; i<tArgs.length; i++) {
                System.out.println("第" + i + "个泛型信息是：" + tArgs[i]);

            }

        }
        else{
            System.out.println("出错啦！！");
        }


    }

}
