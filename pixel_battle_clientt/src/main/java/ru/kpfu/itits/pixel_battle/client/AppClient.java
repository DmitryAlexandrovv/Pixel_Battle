package ru.kpfu.itits.pixel_battle.client;

import ru.kpfu.itis.pixel_battle.protocol.Protocol;
import ru.kpfu.itits.pixel_battle.client.connection.MessageAccepter;
import ru.kpfu.itits.pixel_battle.client.connection.MessageSender;
import ru.kpfu.itits.pixel_battle.client.exceptions.ClientException;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class AppClient implements Runnable{
    public AppClient() throws IOException {
        Runnable target;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            SocketClient socket = new SocketClient(InetAddress.getLocalHost(), Protocol.PORT);
            socket.connect();
            MessageSender sender = new MessageSender(socket);
            MessageAccepter accepter = new MessageAccepter(socket);
            while (true) {

            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
