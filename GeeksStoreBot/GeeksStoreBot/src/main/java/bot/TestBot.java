package bot;

import bot.Buttons.InlineKeyboards;
import bot.Buttons.ReplyKeyboards;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestBot extends TelegramLongPollingBot implements BaseData {

	private String chatId;
	private String message;
	InlineKeyboards inlineKeyboards = new InlineKeyboards();
	ReplyKeyboards replyKeyboards = new ReplyKeyboards();

	@Override
	public void onUpdateReceived(Update update) {
		this.chatId = update.getMessage().getChatId().toString();
		if (update.hasMessage()) {
			handleMessage(update.getMessage());
		} else if (update.hasCallbackQuery()) {
			handleCallData(update.getCallbackQuery());
		}
	}

	private void handleCallData(CallbackQuery message) {

		String text = message.getData();
		switch (text) {
			case "/start":
				break;
		}
	}

	private void handleMessage(Message message) {
		if (message.hasText()) {
			String text = message.getText();
			switch (text) {
				case "/start":

					break;
				case "Computers":
					send(inlineKeyboards.getPC(), "ᅠᅠᅠᅠᅠᅠᅠGeeks computers \uD83D\uDCBB");
					break;
				case "/computers":
					send(inlineKeyboards.getPC(), "ᅠᅠᅠᅠᅠᅠᅠGeeks computers \uD83D\uDCBB");
					break;
				case "Mobile":
					send(inlineKeyboards.getMobiles(), "ᅠᅠᅠᅠᅠᅠᅠᅠᅠᅠᅠMobile \uD83D\uDCF1");
					break;
				case "/mobile":
					send(inlineKeyboards.getMobiles(), "ᅠᅠᅠᅠᅠᅠᅠᅠᅠᅠᅠMobile \uD83D\uDCF1");
					break;
				case "Technics":
					send(inlineKeyboards.getTV(), "ᅠᅠᅠᅠᅠᅠᅠᅠᅠᅠᅠTechnics \uD83D\uDCFA");
					break;
				case "/technics":
					send(inlineKeyboards.getTV(), "ᅠᅠᅠᅠᅠᅠᅠᅠᅠᅠᅠTechnics \uD83D\uDCFA");
					break;
				default:
					send("Wrong Command");

			}
		}
	}

	public void send(ReplyKeyboardMarkup menu, String text) {
		SendMessage sendMessage = new SendMessage();
		sendMessage.setText(text);
		sendMessage.setChatId(this.getChatId());
		sendMessage.setReplyMarkup(menu);
		try {
			execute(sendMessage);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

	public void send(String text) {
		SendMessage sendMessage = new SendMessage();
		sendMessage.setChatId(this.getChatId());
		sendMessage.setText(text);
		try {
			execute(sendMessage);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}

	public void send(InlineKeyboardMarkup menu, String text) {
		SendMessage sendMessage = new SendMessage();
		sendMessage.setText(text);
		sendMessage.setChatId(this.getChatId());
		sendMessage.setReplyMarkup(menu);
		try {
			execute(sendMessage);
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}


	@Override
	public String getBotUsername() {
		return USERNAME;
	}

	@Override
	public String getBotToken() {
		return TOKEN;
	}


}
