package ru.kpfu.itits.pixel_battle.client.connection;


import ru.kpfu.itis.pixel_battle.protocol.Message;
import ru.kpfu.itis.pixel_battle.protocol.UserAction;
import ru.kpfu.itits.pixel_battle.client.SocketClient;
import ru.kpfu.itits.pixel_battle.client.controllers.GameSearchController;
import ru.kpfu.itits.pixel_battle.client.controllers.MapController;
import ru.kpfu.itits.pixel_battle.client.model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MessageAccepter implements Runnable{
    private SocketClient socket;
    private Thread thread;
    private volatile List<User> users;

    public MessageAccepter(SocketClient socket){
        this.socket = socket;
        this.users = new ArrayList<>();
        thread = new Thread(this);
        thread.start();
    }

    public List<User> getUsers(){
        return users;
    }

    private void addUser(User user){
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User oldUser = iterator.next();
            if(oldUser.equals(user)){
               return;
            }
        }

        users.add(user);
    }

    private void setAction(UserAction action, int id){
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getUserId() == id){
                user.setAction(action);
            }
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Ответ сервера
                Message message = Message.readMessage(socket.getInputStream());

                System.out.println("accepter " + message.getUserAction());
                System.out.println(message.getUserId());

                if(message.getUserAction().equals(UserAction.BATTLE_SEARCH)){
                    addUser(new User(message.getUserId()));
                } else if(message.getUserAction().equals(UserAction.TANK_MOVE_FORWARD)){
                    setAction(message.getUserAction(), message.getUserId());
                } else if(message.getUserAction().equals(UserAction.STATE)){
                    setAction(message.getUserAction(), message.getUserId());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
