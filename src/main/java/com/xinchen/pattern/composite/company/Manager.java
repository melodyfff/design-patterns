package com.xinchen.pattern.composite.company;

import java.util.List;

/**
 * 树节点（Composite Role） 可对分支节点(Leaf Role) 进行管理
 *
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/27 0:01
 */
public class Manager extends Company {

    public Manager(String name, String sex, String position, double salary) {
        super(name, sex, position, salary);
    }

    /**
     * 新增节点
     *
     * @param company company
     */
    public void add(Company company) {
        companyList.add(company);
    }

    /**
     * 删除节点
     *
     * @param company company
     */
    public void remove(Company company) {
        companyList.remove(company);
    }

    /**
     * 查询所有子节点
     *
     * @return List<Company> child
     */
    public List<Company> getChild() {
        return companyList;
    }

    @Override
    public String getInfo() {
        return String.format("[%s]  name : %s , gender : %s , position : %s , salary : %f", position,name, sex, position, salary);
    }
}
