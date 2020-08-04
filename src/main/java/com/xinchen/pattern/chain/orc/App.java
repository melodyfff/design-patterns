package com.xinchen.pattern.chain.orc;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2020/8/4 23:16
 */
class App {
    public static void main(String[] args) {
        OrcKing king = new OrcKing();
        // commander -> officer -> soldier
        // 各司其职，针对不同的类型不同的对象作出处理
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE,"defend,castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
