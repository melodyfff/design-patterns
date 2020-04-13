package com.xinchen.pattern.builder.tradition;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/12 23:28
 */
public class LogObjects {

    private LogObjects(){}

    public static LogObjectBuilder custom(){
        return LogObjectBuilder.create();
    }

    public static LogObject createDefault(){
        return LogObjectBuilder.create().build();
    }
}
