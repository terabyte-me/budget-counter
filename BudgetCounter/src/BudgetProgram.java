
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class BudgetProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask & store name as "name"
        System.out.println("Hi. What's your name?");
        String name = input.nextLine();
        //greet user, ask & store 1st src income as "income1Name"
        System.out.println("Hello, " + name + ".");
        System.out.println("Please name your first income source.");
        String income1Name = input.nextLine();
        //all other incomes will be labelled "miscellaneousIncome"
        System.out.println(income1Name + " has been recorded. Any other income values will be named 'miscellaneousIncome'");
        //income 1 source
        System.out.println("How much is " + income1Name + "?");
        int income1Val = input.nextInt();
        //misc income
        System.out.println("How much are your miscellaneous incomes? (0 for nothing)");
        int incomeMisc = input.nextInt();
        //expense 1 name
        System.out.println("You will be asked to input 5 expenses.");
        
        System.out.println("Please name your first expense.");
        String expense1Name = input.nextLine();
        
        System.out.println("Please name your second expense.");
        String expense2Name = input.nextLine();
        //expense 3 name
        System.out.println("Please name your third expense.");
        String expense3Name = input.nextLine();
        //expense 4 name
        System.out.println("Please name your fourth expense.");
        String expense4Name = input.nextLine();
        //expense 5 name
        System.out.println("Please name your fifth and final expense.");
        String expense5Name = input.nextLine();
        //expense 1 value
        System.out.println("How much is " + expense1Name + "?");
        int expense1Val = input.nextInt();
        //expense 2 value
        System.out.println("How much is " + expense2Name + "?");
        int expense2Val = input.nextInt();
        //expense 3 value
        System.out.println("How much is " + expense3Name + "?");
        int expense3Val = input.nextInt();
        //expense 4 value
        System.out.println("How much is " + expense4Name + "?");
        int expense4Val = input.nextInt();
        //expense 5 value
        System.out.println("How much is " + expense5Name + "?");
        int expense5Val = input.nextInt();
        
        System.out.println("Thank you.");
        //find total expense amount
        int totalExpenses = expense1Val+expense2Val+expense3Val+expense4Val+expense5Val;
        
        System.out.println("Your total expense amount is " + totalExpenses + " dollars.");
        //calculate what percent expenses are of total income
        int totalIncome = income1Val+incomeMisc;
        //percent of total income 
        int expensePercent = (totalExpenses/totalIncome)*100;
        
        System.out.println("You are currently spending " + expensePercent + "% of your total income.");
        
        
        if(expensePercent <=100){
            System.out.println("You're in the black.");
        }else{
            System.out.println("You're in debt!");
        }
    }
    
}
