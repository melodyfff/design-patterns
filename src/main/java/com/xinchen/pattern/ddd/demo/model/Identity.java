package com.xinchen.pattern.ddd.demo.model;

import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.UUID;

/**
 * ID标示
 *
 * @author xinchen
 * @version 1.0
 * @date 18/08/2020 14:27
 */
public interface Identity {


    /**
     * 主键
     * @return id
     */
    String id();

    /**
     * 生成一个ID
     *
     * @return uuid
     */
    default String generateAnId(){
        // 这里的id生成可以考虑放到其他地方或者抽象聚合id类里面去真正生成
        return newUuid();
    }

    Base64.Encoder ENCODER = Base64.getUrlEncoder();
    static String newBase64Uuid() {
        UUID uuid = UUID.randomUUID();
        byte[] src = ByteBuffer.wrap(new byte[16])
                .putLong(uuid.getMostSignificantBits())
                .putLong(uuid.getLeastSignificantBits())
                .array();
        return ENCODER.encodeToString(src).substring(0, 22);
    }

    static String newUuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
