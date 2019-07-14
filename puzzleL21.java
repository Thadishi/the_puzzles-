public class puzzleL21{

    public void puzzle_L21(){
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
        //Add a stem to the triangle to make it into a tree
        for(int m=0; m<5; m++){
            for(int c=0; c<13; c++)
                System.out.printf("+");
            for(int b=0; b<4; b++)
                System.out.printf("*");
            for(int a=0; a<13; a++)
                System.out.printf("+");
            System.out.println();
        }
    }


    //alternating dots and asteriks
    public void puzzle_L26(){
        for(int i=0; i<16; i++){
            for(int n=0; n<16; n++){
                if((i+n)%2==0)
                    System.out.printf("*");
                else
                    System.out.printf(".");
            } System.out.println();
        }System.out.println();
    }


    public static void main(String[] args){

        puzzleL21 complex = new puzzleL21();

        complex.puzzle_L26();
    }
}