package com.pipi;
public class Sms implements NotifyChannel {
    private String phoneNumber;

    public Sms(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String message){
        // 實際的簡訊發送邏輯
        System.out.println("簡訊通知" + phoneNumber +":" +message);
    }
}
