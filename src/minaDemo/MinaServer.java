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
		//���ô�����
		ioAcceptor.setHandler(new MyHandler());
		//�󶨼����˿�
		try {
			ioAcceptor.bind(new InetSocketAddress(port));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�涨Э�飬���ù���
		ioAcceptor.getFilterChain().addLast("test", new ProtocolCodecFilter(new TextLineCodecFactory()));
		
	}
	

}
