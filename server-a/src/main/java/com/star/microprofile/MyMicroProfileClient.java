package com.star.microprofile;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.xml.ws.Response;

/**
 * 我微轮廓的客户
 *
 * @author star
 * @date 2021/07/21
 */
public interface MyMicroProfileClient {
    /**
     * 问候
     *
     * @return {@link Response}
     */
    @GET
    @Path("/greeting")
    String greet();

    @POST
    @Path("/actuator/shutdown")
    String shutdown();
}
