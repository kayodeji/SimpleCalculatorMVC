public class CalculatorModel
{
     private int calculatedValue;

     public void calculateSum(int a, int b)
     {
          calculatedValue =  a+ b;
     }

     public void calculateDifference(int a, int b)
     {
          calculatedValue = a - b;
     }

     public void calculateProduct(int a, int b)
     {
          calculatedValue =  a* b;
     }

     public void calculateQuotient(int a, int b)
     {
          if (b==0)
          {
               calculatedValue =  -9999;
          }
          else
          {
               calculatedValue =  a/b;
          }
     }

     public int getValue()
     {
          return calculatedValue;
     }

}
