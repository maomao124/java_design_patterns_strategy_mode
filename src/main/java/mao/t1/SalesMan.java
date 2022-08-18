package mao.t1;

/**
 * Project name(项目名称)：java设计模式_策略模式
 * Package(包名): mao.t1
 * Class(类名): SalesMan
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/18
 * Time(创建时间)： 20:19
 * Version(版本): 1.0
 * Description(描述)： 环境角色类
 */

public class SalesMan
{
    //抽象策略角色的引用
    private final Strategy strategy;

    public SalesMan(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public void salesManShow()
    {
        strategy.show();
    }
}
