package bot.Buttons;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class ReplyKeyboards {

	public ReplyKeyboardMarkup getContact(){
		ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
		List<KeyboardRow> keyboardRows = new ArrayList<>();
		replyKeyboardMarkup.setKeyboard(keyboardRows);
		replyKeyboardMarkup.setResizeKeyboard(true);
		replyKeyboardMarkup.setSelective(true);
		replyKeyboardMarkup.setOneTimeKeyboard(true);

		KeyboardRow keyboardRow = new KeyboardRow();
		keyboardRow.add("Share Contact");

		KeyboardRow keyboardRow1 = new KeyboardRow();
		keyboardRow1.add("Convert to UZS");

		keyboardRows.add(keyboardRow);
	//	keyboardRows.add(keyboardRow1);

		return replyKeyboardMarkup;
	}
	public ReplyKeyboardMarkup get
}
