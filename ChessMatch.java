/*
 
# Chess-Match

# Problem
Read problem statements in Mandarin Chinese, Russian, and Vietnamese as well. In a Chess match "a + b", each player has a clock which shows a minutes at the start and whenever a player makes a move, b seconds are added to this player's clock. Time on a player's clock decreases during that player's turns and remains unchanged during the other player's turns. If the time on some player's clock hits zero (but not only in this case), this player loses the game.

There's a 3 + 2 blitz chess match. After N turns (i.e. [(N+1)/2] moves made by white and [N/2] moves made by black), the game ends and the clocks of the two players stop; they show that the players (white and black) have A and B seconds left respectively. Note that after the N-th turn, b=2 seconds are still added to the clock of the player that made the last move and then the game ends.

# Input

-> The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.

-> The first and only line of each test case contains three space-separated integers N, A and B.

# Output

For each test case, print a single line containing one integer — the duration of the game.

# Explanation:
Example case 1: 

The total time given to both clocks after 10 turns is 2⋅(180+10)=380 seconds. The total time left at the end is 0+2=2 seconds. The duration of the game is 380−2=378 seconds.

Example case 3:

The total time given to both clocks after 12 turns is 2⋅(180+12)=384 seconds. The total time left at the end is 192+192=384 seconds. The duration of the game is 384−384=0 seconds.

 */

import java.util.Scanner;

public class ChessMatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
		    int N=sc.nextInt();
		    int A=sc.nextInt();
		    int B=sc.nextInt();
		    
		    int K=2*(180+N);
		    int Time=A+B;
		    int result=K-Time;
		    System.out.println(result);
		}
    }
}
