/* At GLA College of  Programming,
   the final school fees to be paid is calculated as follows.
•	Original Fees should be greater than or equal to R50 000
•	Minimum fixed deposit of R10 000
•	If a deposit is greater than pr equal to half the original fees,
    you get a 5% discount from the original fees
•	Final total fees will also include the following
1.	School Levy is 10% of original fees
2.	Sports fee is 5% of the original fees.
Write a program the calculates the final total fees to be paid.

Program must request user to enter original fees value greater then R50 000.
Program should also request user to enter amount to deposit before calculating final total fees.*/
package questions;

import java.util.Scanner;

public class Q_1 {
    int basic,deposit;
    int levy, sport, _final;

    Scanner sc = new Scanner(System.in);
    Q_1(){
        System.out.print("Please enter original fees greater than 50000:- ");
        basic = sc.nextInt();

        System.out.print("Please enter deposit fees :- ");
        deposit = sc.nextInt();
    }
    public void profit(){
        if(basic/2 <= deposit){
            basic -= (basic*5)/100;
        }
    }
    public void additional(){
        levy = (basic*10)/100;
        sport = (basic*5)/100;
        _final = basic+levy+sport;
    }
}
class Q_1_MAin{
    public static void main(String[] args) {
        Q_1 obj = new Q_1();
        obj.profit(); obj.additional();
        System.out.println("Final fees is :- "+obj._final);
    }
}