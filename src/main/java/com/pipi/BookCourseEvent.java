package com.pipi;
import java.util.List;

public class BookCourseEvent implements Event {
    public BookCourseEvent(List<NotifyChannel> studentChannels) {
    }

    @Override
    public void dispatch(List<NotifyChannel> channels) {
        String message = "課程預約成功";
        notifyChannels(channels, message);
    }

    private void notifyChannels(List<NotifyChannel> channels, String message) {
        for (NotifyChannel channel : channels) {
            channel.notify(message);
        }
    }
}
