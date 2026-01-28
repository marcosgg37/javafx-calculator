package testfx.gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import testfx.logic.Calculator;
import javafx.scene.control.Button;

public class Controller {
	
	private Calculator calc;
	
	private NumberButtonHandler numberButtonHandler;
	private OperationButtonHandler operationButtonHandler;
	private EqualsButtonHandler equalsButtonHandler;
	private ClearButtonHandler clearButtonHandler;
	private NegativeButtonHandler negButtonHandler;
	
    @FXML
    private Label screen;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button0;
    @FXML
    private Button buttonPlus;
    @FXML
    private Button buttonNeg;
    @FXML
    private Button buttonMul;
    @FXML
    private Button buttonDiv;
    @FXML
    private Button buttonEq;
    @FXML 
    private Button buttonC;


    public void initialize() {
    	this.calc = new Calculator();
    	
    	this.numberButtonHandler = new NumberButtonHandler();
    	this.operationButtonHandler = new OperationButtonHandler();
    	this.equalsButtonHandler = new EqualsButtonHandler();
    	this.clearButtonHandler = new ClearButtonHandler();
    	this.negButtonHandler = new NegativeButtonHandler();
    	
    	
        initScreen();
        initButton0(button0);
        initButton1(button1);
        initButton2(button2);
        initButton3(button3);
        initButton4(button4);
        initButton5(button5);
        initButton6(button6);
        initButton7(button7);
        initButton8(button8);
        initButton9(button9);
        initButtonPlus(buttonPlus);
        initButtonNeg(buttonNeg);
        initButtonMul(buttonMul);
        initButtonDiv(buttonDiv);
        initButtonEq(buttonEq);
        initButtonC(buttonC);
    }
    
    private void initScreen() {
    	String operation = "0";
    	screen.setText(operation);
    	screen.setTranslateY(-70);
    	screen.setTranslateX(-20);
    }
    
    
    private void initButton0(Button b) {
    	b.setTranslateY(70);
    	b.setTranslateX(-40);
    	b.setPrefWidth(75);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButton1(Button b) {
    	b.setTranslateY(35);
    	b.setTranslateX(-60);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButton2(Button b) {
    	b.setTranslateY(35);
    	b.setTranslateX(-20);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButton3(Button b) {
    	b.setTranslateY(35);
    	b.setTranslateX(20);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButton4(Button b) {
    	b.setTranslateY(0);
    	b.setTranslateX(-60);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButton5(Button b) {
    	b.setTranslateY(0);
    	b.setTranslateX(-20);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButton6(Button b) {
    	b.setTranslateY(0);
    	b.setTranslateX(20);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButton7(Button b) {
    	b.setTranslateY(-35);
    	b.setTranslateX(-60);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButton8(Button b) {
    	b.setTranslateY(-35);
    	b.setTranslateX(-20);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButton9(Button b) {
    	b.setTranslateY(-35);
    	b.setTranslateX(20);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(numberButtonHandler);
    }
    private void initButtonPlus(Button b) {
    	b.setTranslateY(-35);
    	b.setTranslateX(60);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setTooltip(new Tooltip("add"));
    	b.getTooltip().setId("+");
    	b.setOnAction(operationButtonHandler);
    }
    private void initButtonMul(Button b) {
    	b.setTranslateY(0);
    	b.setTranslateX(60);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setTooltip(new Tooltip("mul"));
    	b.getTooltip().setId("*");
    	b.setOnAction(operationButtonHandler);
    }
    private void initButtonDiv(Button b) {
    	b.setTranslateY(35);
    	b.setTranslateX(60);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setTooltip(new Tooltip("div"));
    	b.getTooltip().setId("/");
    	b.setOnAction(operationButtonHandler);
    }
    private void initButtonNeg(Button b) {
    	b.setTranslateY(70);
    	b.setTranslateX(20);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(negButtonHandler);
    }
    private void initButtonEq(Button b) {
    	b.setTranslateY(70);
    	b.setTranslateX(60);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(equalsButtonHandler);
    }
    private void initButtonC(Button b) {
    	b.setTranslateY(-70);
    	b.setTranslateX(60);
    	b.setPrefWidth(35);
    	b.getStyleClass().add("number");
    	b.setOnAction(clearButtonHandler);
    }
 
    private void updateScreenText() {
    	screen.setText("");
    	double num = calc.getCurrentValue();
    	double op = calc.getOperand();
    	screen.setText((int) num == num ? (int) num + "" : String.format("%.2f", num));
    	// Añadir caracter de la operacion
    	screen.setText(screen.getText() + " " + calc.getOperation() + " ");
    	// Añadir operando formateado al final solo si es distinto de 0
    	screen.setText(screen.getText() + ( op != 0 ? ((int) op == op ? (int) op + "" : op + "") : ""));
    }
    
    private class NumberButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			int number = Integer.parseInt(
					((Button) arg0.getSource())
					.getText()
					.strip()
					);
			calc.typeNumber(number);
			updateScreenText();
		}
    }
    
    private class OperationButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			String operator = ((Button) arg0.getSource()).getTooltip().getText();
			calc.setOperation(operator);
			updateScreenText();
		}
    	
    }
    
    private class NegativeButtonHandler implements EventHandler<ActionEvent> {
    	
    	@Override
    	public void handle(ActionEvent arg0) {
    		calc.sub();
    		updateScreenText();
    	}
    }
    
    private class EqualsButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			calc.equal();
			updateScreenText();
		}
    	
    }
    
    private class ClearButtonHandler implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent arg0) {
			calc.clear();
			updateScreenText();
		}
    	
    }
}