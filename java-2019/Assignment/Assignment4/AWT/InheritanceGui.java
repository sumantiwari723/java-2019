package awt;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
class InheritanceGui extends Frame{
    public static void main(String[] args) {
        InheritanceGui frame = new InheritanceGui();
        Label num1 = new Label();
        TextField num1Text = new TextField();
        Label num2 = new Label();
        TextField num2Text = new TextField();
        Label result = new Label();
        TextField resultText = new TextField();
        Button addition = new Button("ADD");
        Button subtract = new Button("Subtract");
        Button multiply = new Button("Multiply");
        Button divide = new Button("Divide");
        num1.setText("Number 1:");
        num1.setBounds(10,50,80,25);
        num1Text.setBounds(100,50,165,25);
        frame.add(num1);
        frame.add(num1Text);
        num2.setText("Number 2:");
        num2.setBounds(10,100,80,25);
        num2Text.setBounds(100,100,165,25);
        frame.add(num2);
        frame.add(num2Text);
        result.setText("Result:");
        result.setBounds(10,150,80,25);
        resultText.setBounds(100,150,165,25);
        frame.add(result);
        frame.add(resultText);
        addition.setBounds(10,200,50,35);
        frame.add(addition);
        subtract.setBounds(80,200,50,35);
        frame.add(subtract);
        multiply.setBounds(150,200,50,35);
        frame.add(multiply);
        divide.setBounds(220,200,50,35);
        frame.add(divide);
        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
