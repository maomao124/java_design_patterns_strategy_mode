package mao.t2;

/**
 * Project name(项目名称)：java设计模式_策略模式
 * Package(包名): mao.t2
 * Class(类名): OperationSubtract
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 20:27
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class OperationSubtract implements Strategy
{

    @Override
    public int doOperation(int num1, int num2)
    {
        return num1 - num2;
    }
}
