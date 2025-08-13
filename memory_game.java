import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		String array[]={"A","B","C","D","D","C","B","A"};
		
		String board[]=new String[8];
		boolean flipped[]=new boolean[8];
		
		System.out.println("<<<<<WELCOME TO THE MEMORY GAME>>>>>");
		
		int pair=0;
		while(pair<4)
		{
			game(board);
			int f_num=getValue(sc,board,flipped);
			board[f_num]=array[f_num];
			flipped[f_num]=true;
			
			game(board);
			int s_num=getValue(sc,board,flipped);
			board[s_num]=array[s_num];
			flipped[s_num]=true;
			
			if(board[f_num].equals(board[s_num]))
			{
				System.out.println("<<<<< YOU FOUND A PAIR >>>>>");
				System.out.println();
                pair++;				
			}
			else
			{
				System.out.println("<<<<< SORRY,THOSE CARD DON'T MATCH.>>>>>");
				System.out.println();
				board[f_num]="";
				board[s_num]="";
                
			}
		}
	    
		
		System.out.println("---CONGRATULATION...YOU WON!---");
		System.out.println();
		
	}
	
	static int getValue(Scanner sc,String board[],boolean flipped[])
	{
		int n;
		while(true)
		{
			System.out.println("Enter a number you want to flip");
			n=sc.nextInt();
			if(n<0 || n>=board.length)
			{
				System.out.println("Invalid number,try again");
			}
			else
			{
				break;
			}
		}
		return n;
	}
	static void game(String board[]) 
	{
        System.out.println("------------------");
        for (int i = 0; i < 4; i++) 
		{
               System.out.print("|| " + board[i * 2] + " || " + board[i * 2 + 1] + " || ");
               System.out.println();
			   System.out.println("------------------");
        }
    }

}