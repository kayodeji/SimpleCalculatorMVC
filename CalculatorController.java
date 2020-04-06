import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorController
{
     private CalculatorModel myModel;
     private CalculatorView myView;

     public CalculatorController(CalculatorModel mod, CalculatorView view)
     {
          myModel = mod;
          myView = view;

          myView.addAdditionButtonListener(new AdditionListener());
          myView.addSubtractionButtonListener(new SubtractionListener());
          myView.addMultiplicationButtonListener(new MultiplicationListener());
          myView.addDivisionButtonListener(new DivisionListener());
     }

     class AdditionListener implements ActionListener
     {
          public void actionPerformed(ActionEvent e)
          {
               int firstNumber = 0;
               int secondNumber = 0;

               try
               {
                    firstNumber = myView.getFirstNumber();
                    secondNumber = myView.getSecondNumber();

                    myModel.calculateSum(firstNumber, secondNumber);
                    myView.setSolution(myModel.getValue());

               }
               catch(NumberFormatException ex)
               {
                    myView.displayErrorMessage("You Need Two Integers to Add.");
               }

          }
     }

     class SubtractionListener implements ActionListener
     {
          public void actionPerformed(ActionEvent e)
          {
               int firstNumber = 0;
               int secondNumber = 0;

               try
               {
                    firstNumber = myView.getFirstNumber();
                    secondNumber = myView.getSecondNumber();

                    myModel.calculateDifference(firstNumber, secondNumber);
                    myView.setSolution(myModel.getValue());

               }
               catch(NumberFormatException ex)
               {
                    myView.displayErrorMessage("You Need Two Integers to Subtract.");
               }

          }
     }

     class MultiplicationListener implements ActionListener
     {
          public void actionPerformed(ActionEvent e)
          {
               int firstNumber = 0;
               int secondNumber = 0;

               try
               {
                    firstNumber = myView.getFirstNumber();
                    secondNumber = myView.getSecondNumber();

                    myModel.calculateProduct(firstNumber, secondNumber);
                    myView.setSolution(myModel.getValue());

               }
               catch(NumberFormatException ex)
               {
                    myView.displayErrorMessage("You Need Two Integers to Multiply.");
               }

          }
     }

     class DivisionListener implements ActionListener
     {
          public void actionPerformed(ActionEvent e)
          {
               int firstNumber = 0;
               int secondNumber = 0;

               try
               {
                    firstNumber = myView.getFirstNumber();
                    secondNumber = myView.getSecondNumber();

                    myModel.calculateQuotient(firstNumber, secondNumber);
                    myView.setSolution(myModel.getValue());

               }
               catch(NumberFormatException ex)
               {
                    myView.displayErrorMessage("You Need Two Integers to Divide.");
               }

          }
     }
}
