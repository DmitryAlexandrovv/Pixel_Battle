package ru.kpfu.itits.pixel_battle.client.connection;

import ru.kpfu.itits.pixel_battle.client.SocketClient;
import ru.kpfu.itits.pixel_battle.client.exceptions.ClientException;
import ru.kpfu.itis.pixel_battle.protocol.Message;
import ru.kpfu.itis.pixel_battle.protocol.Type;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MessageSender implements Runnable{
    private SocketClient socket;
    private Thread thread;

    public MessageSender(SocketClient socket){
        this.socket = socket;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            try (PrintWriter toServer = new PrintWriter(socket.getOutputStream(), true)) {
                while (true) {
                    // Отправка данных на сервер
                    Scanner scanner = new Scanner(System.in);
                    Message request = Message.createMessage(Type.TEXT, scanner.nextLine().getBytes());
                    socket.sendMessage(request);
                }
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        } catch (IOException e) {
            try {
                if (e instanceof SocketTimeoutException) {
                    throw new SocketTimeoutException();
                } else {
                    e.printStackTrace();
                }
            } catch (SocketTimeoutException ste) {
                System.out.println("Turn off the client by timeout");
            }
        }
    }
}
