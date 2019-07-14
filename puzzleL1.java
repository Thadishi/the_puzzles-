
//Simple loops
public class puzzleL1{

	public void puzzle_L1(){
		
		for(int j=0; j<=14; j++){
			System.out.printf("%3d\n",j);
		}
	}

	public void puzzle_L3(){
		for(int i=0; i<=20; i+=2){
			System.out.printf("%3d\n", i);
		}
	}

	//odd integers
	public void puzzle_L6(){
		for(int i=1; i<=99; i+=2){
			System.out.printf("%3d\n", i);
		}
	}

	//first N odd numbers
	public void puzzle_L7(int N){
		if (N%2!=0){
			System.out.println("Odd N");
			for (int i=1; i<=N; i+=2){
				System.out.printf("%3d\n",i);
			}
		} else if(N%2==0){
			System.out.println("Evene N");
			for(int i=1; i<=N; i+=2){
				System.out.printf("%3d\n",i);
			}
		}
	}

	//even and odd sums
	public void puzzle_L8(int N){
		int even =0;
		int odd =0;
		int all =0;

		for (int i=1; i<=N; i++){
			all+=i;
			if(i%2==0)
				even+=i;
			else if(i%2!=0)
				odd+=i;
		}

		System.out.println("sum of all: "+all);
		System.out.println("summ of odd: "+odd);
		System.out.println("sum of even: "+even);
		System.out.printf("sum = %d, sum of odd = %d, sum of even = %d", all, odd, even);
	}

	//except those divisible by 3 or 4
	public void puzzle_L9(int N){
		int all =0;
		int judas = 0;
		int even =0;
		int odd =0;

		for(int i=0; i<=N; i++){
			if(i%4==0 || i%3==0){
				judas+=i;
			}else{
				all+=i;
				if(i%2!=0)
					odd+=i;
				else if(i%2==0)
					even+=i;
			}
		}

		//System.out.println(all);
		System.out.printf("sum = %d, sum of Odd = %d, sum of Even = %d", all, odd, even);
	}

	//5 per line
	public void puzzle_L10(){
		for(int i=1; i<=24; i++){
			if(i%5==0)
				System.out.printf("%3d\n",i);
			else
				System.out.printf("%3d", i);
		}
	}


	public static void main(String[] args){
		puzzleL1 looping = new puzzleL1();

		looping.puzzle_L10();
	}
}