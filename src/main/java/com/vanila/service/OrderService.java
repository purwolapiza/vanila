package com.vanila.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.wink.providers.protobuf.WinkProtobufProvider;

import com.vanila.order.data.OrderData.Order;

/**
 * 
 * User: purwol
 * Date: Feb 2, 2016
 * Time: 11:37:47 PM
 */

@Path("/order")
public class OrderService {
    
    @GET
    @Path("/get.{mediatype}")
    @Produces({WinkProtobufProvider.PROTOBUF, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Order getOrder() {
        return Order.newBuilder().setApplication("Vanila").build();
    }
}
