package practice;

public class Dice
{
	
	public static void main(String[] args) {
		
		Dice d=new Dice();
		
		int value=d.rollDice();
		System.out.println(value);
	}


    public int rollDice()
    {
    	int rollValue;
        rollValue = (int) (Math.random()*6) + 1;  //since math.random returns double type value between 0.0 
                                                  //and 1.0 so we multiplied and added.
        return rollValue;
    }
}