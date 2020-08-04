package com.xinchen.pattern.chain.orc;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2020/8/4 23:10
 */
public class OrcKing {
    AbstractRequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain(){
        // commander -> officer -> soldier
        // 各自处理不同类型的request
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request req){
        chain.handleRequest(req);
    }
}
