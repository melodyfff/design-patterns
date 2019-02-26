package com.xinchen.pattern.composite.graphic;

/**
 * 客户端
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/2/26 23:39
 */
public class Client {
    public static void main(String[] args) {

        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        // composition-1 : print 3 times string "Ellipse".
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);
        System.out.println("composition-1 print:");
        graphic1.print();
        System.out.println("\n\n");


        // composition-2 : print 1 times string "Ellipse".
        graphic2.add(ellipse4);
        System.out.println("composition-2 print:");
        graphic2.print();
        System.out.println("\n\n");

        // composition-3 : print 4 times string "Ellipse"
        graphic.add(graphic1);
        graphic.add(graphic2);
        System.out.println("composition-3 print:");
        graphic.print();
    }
}
