package com.pipi;
import java.util.List;

public interface Event {
    void dispatch(List<NotifyChannel> channels);
}
