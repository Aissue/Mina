package minaDemo;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class MinaServer {
	private IoAcceptor ioAcceptor;
	
	public MinaServer(int port){
		ioAcceptor=new NioSocketAcceptor();
		//设置处理器
		ioAcceptor.setHandler(new MyHandler());
		//绑定监听端口
		try {
			ioAcceptor.bind(new InetSocketAddress(port));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//规定协议，设置过滤
		ioAcceptor.getFilterChain().addLast("test", new ProtocolCodecFilter(new TextLineCodecFactory()));
		
	}
	

}
