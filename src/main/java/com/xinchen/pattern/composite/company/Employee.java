package com.xinchen.pattern.composite.company;

/**
 * 雇员 Leaf Role
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/27 0:11
 */
public class Employee extends Company{


    public Employee(String name, String sex, String position, double salary) {
        super(name, sex, position, salary);
    }

    @Override
    public String getInfo() {
        return String.format(" -|[Employee]  name : %s , gender : %s , position : %s , salary : %f", name, sex, position, salary);
    }
}
