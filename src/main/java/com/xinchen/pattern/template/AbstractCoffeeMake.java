package com.xinchen.pattern.template;


/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/14 23:27
 */
public abstract class AbstractCoffeeMake {

    /** ① 烧热水 公共方法，都会用到*/
    public void boilingWater(){
        System.out.println("Boiling water...");
    }

    /** ② 制作咖啡，将具体实现延迟到子类*/
    public abstract void cookeCoffee();

    /** ③ 加糖，将具体实现延迟到子类*/
    public abstract void addSugar();

    /** ④ 加牛奶，将具体实现延迟到子类*/
    public abstract void addMilk();

    /** 模板方法，决定算法骨架，相当于TemplateMethod()方法 */
    public final void make(){
        this.boilingWater();
        this.cookeCoffee();
        if (this.needSugar()){
            this.addSugar();
        }
        if (this.needMilk()){
            this.addMilk();
        }
    }

    /**
     * 钩子方法，子类决定是否加糖
     * @return boolean
     */
    protected boolean needSugar(){
        return true;
    }

    /**
     * 钩子方法，子类决定是否加牛奶
     * @return boolean
     */
    protected boolean needMilk(){
        return true;
    }

}
