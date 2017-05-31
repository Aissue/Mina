package minaDemo;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class MyHandler extends IoHandlerAdapter{

	//接到消息后的处理 
	@Override
	public void messageReceived(IoSession session, Object message) 
			throws Exception {
		String str=(String)message;
		System.out.println("接收的字符串是："+str);
	}
	
	

}
