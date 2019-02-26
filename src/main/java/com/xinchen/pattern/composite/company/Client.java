package com.xinchen.pattern.composite.company;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/27 0:15
 */
public class Client {
    public static void main(String[] args) {
        Manager ceo = new Manager("Sam", "Man", "CEO", 1000.0);

        Manager manager1 = new Manager("Tom", "Man", "Manager", 300.0);
        Manager manager2 = new Manager("Tony", "Man", "Manager", 300.0);

        Employee employee1 = new Employee("Jack", "Man", "Employee", 100.0);
        Employee employee2 = new Employee("Lucy", "Woman", "Employee", 100.0);
        Employee employee3 = new Employee("Stack", "Man", "Employee", 100.0);

        // ceo manage manager1,manager2
        ceo.add(manager1);
        ceo.add(manager2);

        // manager1 manage employee1
        manager1.add(employee1);

        // manager2 manage employee2,employee3
        manager2.add(employee2);
        manager2.add(employee3);

        System.out.println(ceo.getInfo());

        display(ceo);

    }


    private static void display(Manager root) {
        for (Company company : root.companyList) {
            System.out.println(company.getInfo());
            if (company instanceof Manager) {
                display((Manager) company);
            }
        }
    }
}
