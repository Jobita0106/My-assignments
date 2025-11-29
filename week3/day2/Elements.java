package week3.day2;

public class Elements extends Button{
	public static void main(String[] args) {
		Elements obj = new Elements();
        obj.click();
        obj.setText("Hello");
        obj.submit();
        
        Button bn = new Button();
        bn.click();
        bn.setText("SubmitForm");
        bn.submit();

        TextField textf = new TextField();
        textf.setText("EmailField");
        textf.getText();
        textf.click();

        CheckBoxButton checkbox = new CheckBoxButton();
        checkbox.clickCheckButton();
        checkbox.submit();
        checkbox.click();

        RadioButton radib = new RadioButton();
        radib.selectRadioButton();
        radib.click();
        radib.submit();
    }

}
