import bot.TestBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class Main {
	public static void main(String[] args) {

		try {
			TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
			api.registerBot(new TestBot());
			System.out.println("TECH_BOT STARTED");
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}

	}
}
