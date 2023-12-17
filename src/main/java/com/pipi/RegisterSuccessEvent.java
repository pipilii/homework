package com.pipi;
import java.util.List;

public class RegisterSuccessEvent implements Event {
    public RegisterSuccessEvent(List<NotifyChannel> studentChannels) {
    }

    @Override
    public void dispatch(List<NotifyChannel> channels) {
        String message = "註冊成功!";
        notifyChannels(channels, message);
    }

    private void notifyChannels(List<NotifyChannel> channels, String message) {
        for (NotifyChannel channel : channels) {
            channel.notify(message);
        }
    }
}
