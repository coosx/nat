package top.coos.nat;

import org.slf4j.Logger;

import top.coos.nat.factory.LogFactory;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class NatClientHandler extends SimpleChannelInboundHandler<Object> {

	static Logger log = LogFactory.get();

	@Override
	public void channelRead(ChannelHandlerContext context, Object request) throws Exception {

		log.info("channelRead start");

		System.out.println(request);

		super.channelRead(context, request);
		log.info("channelRead end");

	}

	@Override
	protected void channelRead0(ChannelHandlerContext context, Object request) throws Exception {

		log.info("channelRead0 start");

		System.out.println(request);

		log.info("channelRead0 end");

	}

}
