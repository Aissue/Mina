package minaDemo;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class MyHandler extends IoHandlerAdapter{

	//�ӵ���Ϣ��Ĵ��� 
	@Override
	public void messageReceived(IoSession session, Object message) 
			throws Exception {
		String str=(String)message;
		System.out.println("���յ��ַ����ǣ�"+str);
	}
	
	

}
