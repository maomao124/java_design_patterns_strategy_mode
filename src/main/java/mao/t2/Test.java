package mao.t2;

/**
 * Project name(项目名称)：java设计模式_策略模式
 * Package(包名): mao.t2
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 20:29
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        {
            Context context = new Context(new OperationAdd());
            System.out.println(context.executeStrategy(3, 8));
            System.out.println(context.executeStrategy(45, 4));
            System.out.println(context.executeStrategy(40, 20));
        }

        {
            Context context = new Context(new OperationSubtract());
            System.out.println(context.executeStrategy(3, 8));
            System.out.println(context.executeStrategy(45, 4));
            System.out.println(context.executeStrategy(40, 20));
        }

        {
            Context context = new Context(new OperationMultiply());
            System.out.println(context.executeStrategy(3, 8));
            System.out.println(context.executeStrategy(45, 4));
            System.out.println(context.executeStrategy(40, 20));
        }

        {
            Context context = new Context(new OperationDivision());
            System.out.println(context.executeStrategy(3, 8));
            System.out.println(context.executeStrategy(45, 4));
            System.out.println(context.executeStrategy(40, 20));
        }
    }
}
