package bot.Buttons;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineKeyboards {
	public InlineKeyboardMarkup getPC() {

		InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> list = new ArrayList<>();
		List<InlineKeyboardButton> buttonList1 = new ArrayList<>();
		List<InlineKeyboardButton> buttonList2 = new ArrayList<>();
		List<InlineKeyboardButton> buttonList3 = new ArrayList<>();
		List<InlineKeyboardButton> backList = new ArrayList<>();

		InlineKeyboardButton button1 = new InlineKeyboardButton("Acer");
		button1.setCallbackData("Acer-pc");

		InlineKeyboardButton button2 = new InlineKeyboardButton("Hp");
		button2.setCallbackData("Hp-pc");

		InlineKeyboardButton button3 = new InlineKeyboardButton("Lenovo");
		button3.setCallbackData("Lenovo-pc");

		InlineKeyboardButton button4 = new InlineKeyboardButton("GigaByte");
		button4.setCallbackData("GigaByte-pc");

		InlineKeyboardButton button5 = new InlineKeyboardButton("Asus");
		button5.setCallbackData("Asus-pc");

		InlineKeyboardButton button6 = new InlineKeyboardButton("Apple");
		button6.setCallbackData("Apple-pc");

		InlineKeyboardButton button7 = new InlineKeyboardButton("Honor");
		button7.setCallbackData("Honor-pc");

		InlineKeyboardButton button8 = new InlineKeyboardButton("Dell");
		button8.setCallbackData("Dell-pc");

		InlineKeyboardButton button9 = new InlineKeyboardButton("MSI");
		button9.setCallbackData("MSI-pc");


		InlineKeyboardButton button10 = new InlineKeyboardButton("Back");
		button10.setCallbackData("back-pc");

		buttonList1.add(button1);
		buttonList1.add(button2);
		buttonList1.add(button3);

		buttonList2.add(button4);
		buttonList2.add(button5);
		buttonList2.add(button6);

		buttonList3.add(button7);
		buttonList3.add(button8);
		buttonList3.add(button9);

		backList.add(button10);

		list.add(buttonList1);
		list.add(buttonList2);
		list.add(buttonList3);
		list.add(backList);

		markup.setKeyboard(list);

		return markup;
	}

	public InlineKeyboardMarkup getMobiles() {
		InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
		InlineKeyboardButton button1 = new InlineKeyboardButton();

		button1.setText("Apple");
		button1.setCallbackData("- mobile");
		InlineKeyboardButton button2 = new InlineKeyboardButton();
		button2.setText("Alcatel");
		button2.setCallbackData("- mobile");
		InlineKeyboardButton button3 = new InlineKeyboardButton();
		button3.setText("Xiaomi");
		button3.setCallbackData("- mobile");
		InlineKeyboardButton button4 = new InlineKeyboardButton();
		button4.setText("BQ");
		button4.setCallbackData("- mobile");
		InlineKeyboardButton button5 = new InlineKeyboardButton();
		button5.setText("Oppo");
		button5.setCallbackData("- mobile");
		InlineKeyboardButton button6 = new InlineKeyboardButton();
		button6.setText("Samsung");
		button6.setCallbackData("- mobile");
		InlineKeyboardButton button7 = new InlineKeyboardButton();
		button7.setText("Vivo");
		button7.setCallbackData("- mobile");
		InlineKeyboardButton button8 = new InlineKeyboardButton();
		button8.setText("Realme");
		button8.setCallbackData("- mobile");
		InlineKeyboardButton button9 = new InlineKeyboardButton();
		button9.setText("Tecno Mobile");
		button9.setCallbackData("- mobile");
		InlineKeyboardButton button10 = new InlineKeyboardButton();
		button10.setText("Asus");
		button10.setCallbackData("- mobile");
		InlineKeyboardButton button11 = new InlineKeyboardButton();
		button11.setText("ZTE");
		button11.setCallbackData("- mobile");
		InlineKeyboardButton button12 = new InlineKeyboardButton();
		button12.setText("Blackview");
		button12.setCallbackData("- mobile");
		InlineKeyboardButton button13 = new InlineKeyboardButton();
		button13.setText("Nokia");
		button13.setCallbackData("- mobile");
		InlineKeyboardButton button14 = new InlineKeyboardButton();
		button14.setText("OnePlus");
		button14.setCallbackData("- mobile");
		InlineKeyboardButton button15 = new InlineKeyboardButton();
		button15.setText("Novey");
		button15.setCallbackData("- mobile");
		InlineKeyboardButton button16 = new InlineKeyboardButton();
		button16.setText("Honor");
		button16.setCallbackData("- mobile");
		InlineKeyboardButton button17 = new InlineKeyboardButton();
		button17.setText("Artel");
		button17.setCallbackData("- mobile");
		InlineKeyboardButton button18 = new InlineKeyboardButton();
		button18.setText("TCL");
		button18.setCallbackData("- mobile");
		InlineKeyboardButton button19 = new InlineKeyboardButton();
		button19.setText("Huawei");
		button19.setCallbackData("- mobile");
		InlineKeyboardButton buttonBack = new InlineKeyboardButton();
		buttonBack.setText("back");
		buttonBack.setCallbackData("back");
		List<InlineKeyboardButton> buttonList1 = new ArrayList<>();
		buttonList1.add(button1);
		List<InlineKeyboardButton> buttonList2 = new ArrayList<>();
		buttonList2.add(button2);
		buttonList2.add(button3);
		buttonList2.add(button4);
		List<InlineKeyboardButton> buttonList3 = new ArrayList<>();
		buttonList3.add(button5);
		buttonList3.add(button6);
		buttonList3.add(button7);
		List<InlineKeyboardButton> buttonList4 = new ArrayList<>();
		buttonList4.add(button8);
		buttonList4.add(button9);
		buttonList4.add(button10);
		List<InlineKeyboardButton> buttonList5 = new ArrayList<>();
		buttonList5.add(button11);
		buttonList5.add(button12);
		buttonList5.add(button13);
		List<InlineKeyboardButton> buttonList6 = new ArrayList<>();
		buttonList6.add(button14);
		buttonList6.add(button15);
		buttonList6.add(button16);
		List<InlineKeyboardButton> buttonList7 = new ArrayList<>();
		buttonList7.add(button17);
		buttonList7.add(button18);
		buttonList7.add(button19);
		List<InlineKeyboardButton> buttonListBack = new ArrayList<>();
		buttonListBack.add(buttonBack);

		List<List<InlineKeyboardButton>> inlineList = new ArrayList<>();
		inlineList.add(buttonList1);
		inlineList.add(buttonList2);
		inlineList.add(buttonList3);
		inlineList.add(buttonList4);
		inlineList.add(buttonList5);
		inlineList.add(buttonList6);
		inlineList.add(buttonList7);
		inlineList.add(buttonListBack);

		markup.setKeyboard(inlineList);

		return markup;
	}

	public InlineKeyboardMarkup getTV() {

		InlineKeyboardMarkup markup=new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> list = new ArrayList<>();
		List<InlineKeyboardButton> buttonList1=new ArrayList<>();
		List<InlineKeyboardButton> buttonList2=new ArrayList<>();
		List<InlineKeyboardButton> buttonList3=new ArrayList<>();
		List<InlineKeyboardButton> backList=new ArrayList<>();

		InlineKeyboardButton button1=new InlineKeyboardButton("Sony");
		button1.setCallbackData("Sony-tv");

		InlineKeyboardButton button2=new InlineKeyboardButton("Samsung");
		button2.setCallbackData("Samsung-tv");

		InlineKeyboardButton button3=new InlineKeyboardButton("Artel");
		button3.setCallbackData("Artel-tv");

		InlineKeyboardButton button4=new InlineKeyboardButton("LG");
		button4.setCallbackData("LG-tv");

		InlineKeyboardButton button5=new InlineKeyboardButton("Shivaki");
		button5.setCallbackData("Shivaki-tv");

		InlineKeyboardButton button6=new InlineKeyboardButton("Zilftler");
		button6.setCallbackData("Zilftler-tv");

		InlineKeyboardButton button7=new InlineKeyboardButton("Premier");
		button7.setCallbackData("Premier-tv");

		InlineKeyboardButton button8=new InlineKeyboardButton("Panasonic");
		button8.setCallbackData("Panasonic-tv");

		InlineKeyboardButton button9=new InlineKeyboardButton("Moonx");
		button9.setCallbackData("Moonx-tv");

		InlineKeyboardButton button10=new InlineKeyboardButton("Immer");
		button10.setCallbackData("Immer-tv");


		buttonList1.add(button1);
		buttonList1.add(button2);
		buttonList1.add(button3);

		buttonList2.add(button4);
		buttonList2.add(button5);
		buttonList2.add(button6);

		buttonList3.add(button7);
		buttonList3.add(button8);
		buttonList3.add(button9);

		backList.add(button10);

		list.add(buttonList1);
		list.add(buttonList2);
		list.add(buttonList3);
		list.add(backList);

		markup.setKeyboard(list);

		return markup;
	}

	public InlineKeyboardMarkup getTechnics () {

		InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> list = new ArrayList<>();
		List<InlineKeyboardButton> buttonList1 = new ArrayList<>();
		List<InlineKeyboardButton> buttonList2 = new ArrayList<>();
		List<InlineKeyboardButton> buttonList3 = new ArrayList<>();
		List<InlineKeyboardButton> backList = new ArrayList<>();

		InlineKeyboardButton button1 = new InlineKeyboardButton("");
		button1.setCallbackData("Apple-md");

		InlineKeyboardButton button2 = new InlineKeyboardButton("Tanix");
		button2.setCallbackData("Tanix");

		InlineKeyboardButton button3 = new InlineKeyboardButton("Xiaomi");
		button3.setCallbackData("Xiaomi");

		InlineKeyboardButton button4 = new InlineKeyboardButton("iTV box");
		button3.setCallbackData("iTV box");

		InlineKeyboardButton button5 = new InlineKeyboardButton("Yandex");
		button3.setCallbackData("Yandex");



		buttonList1.add(button1);
		buttonList1.add(button2);
		buttonList1.add(button3);

		buttonList2.add(button4);
		buttonList2.add(button5);

		list.add(buttonList1);
		list.add(buttonList2);
		list.add(buttonList3);
		list.add(backList);

		markup.setKeyboard(list);

		return markup;
	}
}



