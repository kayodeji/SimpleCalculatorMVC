import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class CalculatorView extends JFrame
{
     private JTextField firstNumber = new JTextField(10);
     private JButton additionButton= new JButton("+");
     private JButton subtractionButton= new JButton("-");
     private JButton multiplicationButton= new JButton("*");
     private JButton divisionButton= new JButton("/");
     private JTextField secondNumber = new JTextField(10);
     private JTextField solution = new JTextField(10);

     public CalculatorView()
     {
          JPanel calculatorPanel = new JPanel();
          JPanel outerCenterPanel = new JPanel();

          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setSize(600,400);
          setTitle("Integer Calculator");

          calculatorPanel.setLayout(new BorderLayout());
          outerCenterPanel.setLayout(new GridLayout(4,1));
          calculatorPanel.add(outerCenterPanel, BorderLayout.CENTER);
          calculatorPanel.add(firstNumber, BorderLayout.WEST);
          outerCenterPanel.add(additionButton);
          outerCenterPanel.add(subtractionButton);
          outerCenterPanel.add(multiplicationButton);
          outerCenterPanel.add(divisionButton);
          calculatorPanel.add(secondNumber , BorderLayout.EAST);
          calculatorPanel.add(solution, BorderLayout.SOUTH);

          this.add(calculatorPanel);
     }

     public int getFirstNumber()
     {
          return Integer.parseInt(firstNumber.getText());
     }

     public int getSecondNumber()
     {
          return Integer.parseInt(secondNumber.getText());
     }

     public int getSolution()
     {
          return Integer.parseInt(solution.getText());
     }

     public void setSolution(int sol)
     {
          solution.setText(Integer.toString(sol));
     }

     public void addAdditionButtonListener(ActionListener addButtonListener)
     {
          additionButton.addActionListener(addButtonListener);
     }

     public void addSubtractionButtonListener(ActionListener subtractButtonListener)
     {
          subtractionButton.addActionListener(subtractButtonListener);
     }

     public void addMultiplicationButtonListener(ActionListener multiplyButtonListener)
     {
          multiplicationButton.addActionListener(multiplyButtonListener);
     }

     public void addDivisionButtonListener(ActionListener divideButtonListener)
     {
          divisionButton.addActionListener(divideButtonListener);
     }

     public void displayErrorMessage(String errorMessage)
     {
          JOptionPane.showMessageDialog(this, errorMessage);
     }


}
