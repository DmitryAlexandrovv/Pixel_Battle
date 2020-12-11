package ru.kpfu.itits.pixel_battle.client.connection;


import ru.kpfu.itis.pixel_battle.protocol.Message;
import ru.kpfu.itis.pixel_battle.protocol.Type;
import ru.kpfu.itits.pixel_battle.client.SocketClient;

import java.io.IOException;

public class MessageAccepter implements Runnable{
    private SocketClient socket;
    private Thread thread;

    public MessageAccepter(SocketClient socket){
        this.socket = socket;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Ответ сервера
                Message message = Message.readMessage(socket.getInputStream());
                if(message.getType().equals(Type.TEXT)){
                    System.out.println(new String(message.getData()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
