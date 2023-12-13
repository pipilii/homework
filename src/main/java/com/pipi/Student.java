package com.pipi;
import java.util.List;

public class Student extends User {

    public Student(String username, List<NotifyChannel> channels) {
        super(username, channels);
    }
}
