package com.pipi;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 創建通知管道
        NotifyChannel emailChannel = new Email("pipi@happy.com");
        NotifyChannel smsChannel = new Sms("+886123654789");
        NotifyChannel telegramChannel = new Telegram("pipitelegram");

        // 創建使用者（學生）並訂閱通知管道
        List<NotifyChannel> studentChannels = new ArrayList<>();
        studentChannels.add(emailChannel);
        studentChannels.add(telegramChannel);
        Student student = new Student("Student1", studentChannels);

        // 創建事件
        Event registerSuccessEvent = new RegisterSuccessEvent(studentChannels);
        Event bookCourseEvent = new BookCourseEvent(studentChannels);
        Event cancelCourseEvent = new CancelCourseEvent(studentChannels);

        // 測試事件發送
        System.out.println("------ 註冊成功 ------");
        registerSuccessEvent.dispatch(studentChannels);

        System.out.println("\n------ 預約課程成功 ------");
        bookCourseEvent.dispatch(studentChannels);

        System.out.println("\n------ 取消課程 ------");
        cancelCourseEvent.dispatch(studentChannels);
    }
}
