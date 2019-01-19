package com.xinchen.pattern.template;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/14 23:38
 */
public class InstantCoffeeMake extends AbstractCoffeeMake{

    private boolean needSugar = true;

    private boolean needMilk = true;

    @Override
    public void cookeCoffee() {
        System.out.println("cooke a cup of Instant coffee...");
    }

    @Override
    public void addSugar() {
        System.out.println("add a cup of sugar to coffee...");
    }

    @Override
    public void addMilk() {
        System.out.println("add 100 ml milk to coffee...");
    }

    /**
     * 覆写钩子方法返回标记
     * @return this.needSugar
     */
    @Override
    protected boolean needSugar() {
        return this.needSugar;
    }

    /**
     * 覆写钩子方法返回标记
     * @return this.needMilk
     */
    @Override
    protected boolean needMilk() {
        return this.needMilk;
    }

    public void setNeedSugar(boolean needSugar) {
        this.needSugar = needSugar;
    }

    public void setNeedMilk(boolean needMilk) {
        this.needMilk = needMilk;
    }
}
