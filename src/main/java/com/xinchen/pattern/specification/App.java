package com.xinchen.pattern.specification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *
 * @author xinchen
 * @version 1.0
 * @date 10/09/2020 17:09
 */
public class App {

    public static void main(String[] args) {
        String name = "hello1";

        List<String> names = new ArrayList<>();
        names.add("hello1");
        names.add("hello1");
        names.add("hello2");

        // 单独使用
        Specification<String> sameName = new ExpressionSpecification<>(o -> o.equals(name));
        Specification<String> notSameName = new ExpressionSpecification<>(o -> !o.equals(name));

        // 组合使用
        Specification<String> complexSpec = sameName.or(notSameName);

        final List<String> collect = names.stream().filter(sameName::isSatisfiedBy).collect(Collectors.toList());
        System.out.println(collect);
    }
}
