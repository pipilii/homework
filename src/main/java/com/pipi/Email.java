package com.pipi;
public class Email implements NotifyChannel {
    private String emailAddress;

    public Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void notify(String message) {
        // 實際的郵件發送邏輯
        System.out.println("郵件通知" + emailAddress + ": " + message);
    }
}

