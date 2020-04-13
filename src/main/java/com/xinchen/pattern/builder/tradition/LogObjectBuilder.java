package com.xinchen.pattern.builder.tradition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/1/12 23:16
 */
public class LogObjectBuilder implements Builder{

    private transient static final Logger log = LoggerFactory.getLogger(LogObjectBuilder.class.getName());

    private LogObject logObject;

    protected LogObjectBuilder() {
        this.logObject = new LogObject();
    }

    public static LogObjectBuilder create(){
        return new LogObjectBuilder();
    }

    @Override
    public LogObject build() {
        return this.logObject;
    }

    @Override
    public LogObject buildAndLog() {
        log.info(Objects.toString(logObject));
        return this.logObject;
    }


    public final LogObjectBuilder setName(String name) {
        this.logObject.setName(name);
        return this;
    }

    public final LogObjectBuilder setContent(String content) {
        this.logObject.setContent(content);
        return this;
    }
}
