package com.star.microprofile;

/**
 * 问候
 *
 * @author star
 * @date 2021/07/21
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
