package ru.kpfu.itits.pixel_battle.client;

import ru.kpfu.itis.pixel_battle.protocol.Protocol;
import ru.kpfu.itits.pixel_battle.client.connection.MessageAccepter;
import ru.kpfu.itits.pixel_battle.client.connection.MessageSender;
import ru.kpfu.itits.pixel_battle.client.exceptions.ClientException;
import ru.kpfu.itits.pixel_battle.client.model.User;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppClient implements Runnable{
    private User user;
    private volatile MessageAccepter messageAccepter;
    private volatile boolean isConnected = false;

    public AppClient() throws IOException {
        Thread thread = new Thread(this);
        thread.start();
    }

    public MessageAccepter getMessageAccepter() {
        return messageAccepter;
    }

    public boolean isConnected(){
        return isConnected;
    }

    @Override
    public void run() {
        try {
            SocketClient socket = new SocketClient(InetAddress.getLocalHost(), Protocol.PORT, user);
            MessageSender sender = new MessageSender(socket);
            messageAccepter = new MessageAccepter(socket);
            socket.connect();
            isConnected = true;
            while (true) {

            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
