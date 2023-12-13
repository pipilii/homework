package com.pipi;
import java.util.List;

public class User {
    private String username;
    private List<NotifyChannel> channels;

    public User(String username, List<NotifyChannel> channels) {
        this.username = username;
        this.channels = channels;
    }

    public void subscribeChannels(List<NotifyChannel> channels) {
        this.channels.addAll(channels);
    }

    public void notifyChannels(Event event) {
        event.dispatch(this.channels);
    }
}
