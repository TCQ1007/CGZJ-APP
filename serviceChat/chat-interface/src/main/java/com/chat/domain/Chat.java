package com.chat.domain;

import java.sql.Timestamp;

/*
 *@author by java开发-曾
 *2020/7/29 9:46
 *文件说明：表示聊天信息的查询表
 */
public class Chat {

    private Integer chatId;
    private Integer chatSender;
    private Integer chatRecevierId;
    private String chatMsg;
    private Timestamp chatTime;

    public Chat() {
    }

    public Chat(Integer chatId, Integer chatSender, Integer chatRecevierId, String chatMsg, Timestamp chatTime) {
        this.chatId = chatId;
        this.chatSender = chatSender;
        this.chatRecevierId = chatRecevierId;
        this.chatMsg = chatMsg;
        this.chatTime = chatTime;
    }

    public Integer getChatId() {
        return chatId;
    }

    public void setChatId(Integer chatId) {
        this.chatId = chatId;
    }

    public Integer getChatSender() {
        return chatSender;
    }

    public void setChatSender(Integer chatSender) {
        this.chatSender = chatSender;
    }

    public Integer getChatRecevierId() {
        return chatRecevierId;
    }

    public void setChatRecevierId(Integer chatRecevierId) {
        this.chatRecevierId = chatRecevierId;
    }

    public String getChatMsg() {
        return chatMsg;
    }

    public void setChatMsg(String chatMsg) {
        this.chatMsg = chatMsg;
    }

    public Timestamp getChatTime() {
        return chatTime;
    }

    public void setChatTime(Timestamp chatTime) {
        this.chatTime = chatTime;
    }
}
