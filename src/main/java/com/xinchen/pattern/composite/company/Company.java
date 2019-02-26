package com.xinchen.pattern.composite.company;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象组件 Component Role
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/26 23:57
 */
public abstract class Company {

    List<Company> companyList = new ArrayList<>();

    /** 姓名 */
    String name;

    /** 性别 */
    String sex;

    /** 职位 */
    String position;

    /** 薪水 */
    double salary;

    public Company(String name, String sex, String position, double salary) {
        this.name = name;
        this.sex = sex;
        this.position = position;
        this.salary = salary;
    }

    /** 获取信息 */
    public abstract String getInfo();
}
