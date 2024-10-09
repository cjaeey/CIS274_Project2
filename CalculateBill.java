// Carlos John Escala
// 08/21/24
// Lab 2, Introductory Lab
// This program calculates a customer's bill

public class CalculateBill
{
    public static void main (String [] args)
    {
        int charges = 100;
        int salesTax = 12;
        int totalOwed = charges + salesTax;
        System.out.println ("You purchased $" + charges
                            + ". Sales tax is $" + salesTax
                            + ". You owe $" + totalOwed + ".");
    }
}
