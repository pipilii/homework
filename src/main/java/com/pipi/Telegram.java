package com.pipi;
public class Telegram implements NotifyChannel {
    private String username;

    public Telegram(String username) {
        this.username = username;
    }

    @Override
    public void notify(String message) {
        // 實際的 Telegram 訊息發送邏輯
        System.out.println("Telegram通知" + username + ": " + message);
    }
}
