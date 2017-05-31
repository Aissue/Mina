package minaDemo;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

public class ClientHandler extends IoHandlerAdapter{
	//发送给服务端的消息
    private String sendToServer;
    
	public ClientHandler(String words){
        sendToServer = words;
    }
    
    @Override
    public void sessionOpened(IoSession session) throws Exception {
        session.write(sendToServer);
    }

}
