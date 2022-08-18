package mao.t1;

/**
 * Project name(项目名称)：java设计模式_策略模式
 * Package(包名): mao.t1
 * Class(类名): StrategyA
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 20:17
 * Version(版本): 1.0
 * Description(描述)： 为春节准备的促销活动A
 */

public class StrategyA implements Strategy
{

    @Override
    public void show()
    {
        System.out.println("买一送一");
    }
}
