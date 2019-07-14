// loops with a few extra twists\

public class puzzleL11{

    public void puzzle_L11(){
        for (int i=1; i<=53; i+=2){
            if(i%10==9)
                System.out.printf("%3d\n",i);
            else
                System.out.printf("%3d", i);
        }
    }

    public void puzzle_L13(){
        int judas =0;
        int count =0;
        for (int i=1; i<=100; i++){
            if(i%3==0 || i%5==0)
                judas+=i;
            else{
                count++;
                if(count%10==0)
                    System.out.printf("%3d\n",i);
                else
                    System.out.printf("%3d",i);
            }
        }
    }
    //asterisks
    public void puzzle_L16(){
        
        //For every row
        for(int i=0; i<7; i++){
            //for every column
            for(int j=0; j<21; j++)
                System.out.printf("*");
            System.out.println();
        }
    }


    //Print a right angled triangle
    //made up of asterisks and dots
    public void puzzle_L17(){
        //for every row
        System.out.printf("*\n");
        for(int i=0; i<=15; i++){
            //for every column
            for(int n=0; n<=i; n++)
                System.out.printf(".");
            System.out.printf("*\n");
        }
        //System.out.println();
    }

    

    //do puzzle_L17, upside down
    public void puzzle_L18(){

        //for every row
        for(int i=0; i<15; i++){
            for(int n=15; n>i; n--)
                System.out.printf("R");
            System.out.printf("*\n");
        }
    }

    //do 18, flipped horizontally
    public void puzzle_L19(){

        for(int i=0; i<15; i++){
            for(int n=0; n<i; n++)
                System.out.printf(" ");
            for(int j=15; j>i; j--)
                System.out.printf("*");
            System.out.println();
        }
    }

    public void puzzle_L20(){
        for(int i=0; i<15; i++){
            for(int n=15; n>i; n--)
                System.out.printf(".");
            for(int j=0; j<i; j++)
                System.out.printf("*");
            for(int l=0; l<i; l++)
                System.out.printf("*");
            for(int k=15; k>i; k--)
                System.out.printf(".");
            System.out.println();
        }
    }



    public static void main(String[] args){

        puzzleL11 twist = new puzzleL11();
        
        //twist.puzzle_L17_2();
        twist.puzzle_L16();
    }
}