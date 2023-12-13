package com.pipi;
import java.util.List;

public class CancelCourseEvent implements Event {
    public CancelCourseEvent(List<NotifyChannel> studentChannels) {
    }

    @Override
    public void dispatch(List<NotifyChannel> channels) {
        String message = "課程取消";
        notifyChannels(channels, message);
    }

    private void notifyChannels(List<NotifyChannel> channels, String message) {
        for (NotifyChannel channel : channels) {
            channel.notify(message);
        }
    }
}
