package mao.t1;

/**
 * Project name(项目名称)：java设计模式_策略模式
 * Package(包名): mao.t1
 * Class(类名): StrategyB
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 20:17
 * Version(版本): 1.0
 * Description(描述)： 为中秋准备的促销活动B
 */

public class StrategyB implements Strategy
{

    @Override
    public void show()
    {
        System.out.println("满200元减50元");
    }
}
