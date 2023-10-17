package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.config.BotConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class TelegramBot extends TelegramLongPollingBot {

    TelegramBot(BotConfig config){
        super(config.getToken());
    }

    @Override
    public void onUpdateReceived(Update update) {
        var originalMassage = update.getMessage();
        Message m = new Message();
        m.setText("s");

        update.setMessage(m);
        System.out.println(originalMassage.getText());
    }

    @Override
    public String getBotUsername() {
        return "NaumenTestSpring_bot";
    }
}
