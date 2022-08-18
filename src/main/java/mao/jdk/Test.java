package mao.jdk;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Project name(项目名称)：java设计模式_策略模式
 * Package(包名): mao.jdk
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 21:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static int getIntRandom(int min, int max)
    {
        if (min > max)
        {
            min = max;
        }
        return min + (int) (Math.random() * (max - min + 1));
    }


    public static void main(String[] args)
    {
        Integer[] integers = new Integer[20];
        for (int i = 0; i < 20; i++)
        {
            integers[i] = getIntRandom(50, 100);
        }

        System.out.println(Arrays.stream(integers).toList());

        Arrays.sort(integers, new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.stream(integers).toList());
    }

}
