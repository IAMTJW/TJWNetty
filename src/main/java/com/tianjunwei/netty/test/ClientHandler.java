package com.tianjunwei.netty.test;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ClientHandler extends ChannelInboundHandlerAdapter{

	@Override  
    public void channelActive(ChannelHandlerContext ctx) {  
        System.err.println("HelloWorldClientHandler Active");  
    }  
  
    @Override  
    public void channelRead(ChannelHandlerContext ctx, Object msg) {  
       System.err.println("HelloWorldClientHandler read Message1 :"+msg);  
       //ctx.writeAndFlush(msg);
       ctx.fireChannelRead(msg);
    }  
    
   @Override  
   public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {  
       cause.printStackTrace();  
       ctx.close();  
    }  
}
