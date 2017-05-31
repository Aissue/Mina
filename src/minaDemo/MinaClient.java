package minaDemo;

import java.net.InetSocketAddress;

import org.apache.mina.core.service.IoConnector;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.transport.socket.nio.NioSocketConnector;

public class MinaClient {
	private IoConnector ioConnertor;
	
	public MinaClient(String host,int port){
		ioConnertor=new NioSocketConnector();
		//������Ϣ����װ���ı���ʽ���
		ioConnertor.getFilterChain().addLast("test", new ProtocolCodecFilter(new TextLineCodecFactory()));    
		ioConnertor.setHandler(new ClientHandler("Hello world!"));
		ioConnertor.connect(new InetSocketAddress(host, port));
	}

}
