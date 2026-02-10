package main.java;

public class Hello{

    public static void main(String[] args){
        System.out.println("see you on the flipside");
        weave(diagonal(11, 11));
    }

    
    public static void weave(String[][] rug){
        //method to print 2D emoji arrays (babushka's rug)
        for(int i = 0; i < rug.length; i++){
            for (int j = 0; j < rug[i].length; j++){
                System.out.print(rug[i][j]);
            }
            //break the line at the end of every row
            System.out.println();
        }
    }

    public static String [][] solid(int width, int height){
        //method that returns a 2D emoji array at a specified width and height
        String[][] rug = new String [width][height];
        for (int i = 0; i < rug.length; i++){
            for(int j = 0; j < rug[i].length; j++){
                rug[i][j] = "☆";
            } //at every position, a star emoji is printed
        }
        return rug;
    }

    public static String[][] horizontal(int width, int height){
        //method that returns a 2D emoji array where the emojis alternate by row
        String[][] rug = new String[width][height];
        for (int i = 0; i < rug.length; i++){
            for (int j = 0; j < rug[i].length; j++){
                if (i % 2 != 0){
                    rug[i][j] = "☆ ";
                } else{
                    rug[i][j] = "⏾ ";
                }
            } //emojis alternate by row
        }
        return rug;
    }

    public static String [][] vertical (int width, int height){
        //this method returns a 2D emoji array where the emojis alternate by column
        String [][] rug = new String[width][height];
        for (int i = 0; i < rug.length; i++){
            for(int j = 0; j < rug[i].length; j++){
                if (j % 2 != 0){
                    rug[i][j] = "⏾ ";
                } else {
                    rug[i][j] = "☆ ";
                }
            }//emojis alternate by column
        }
        return rug;
    }

    public static String [][] diagonal (int width, int height){
        //method returns a 2D emoji array where emojis alternate within each row and column, which creates a diagonal array
        String [][] rug = new String [width][height];
        for (int i = 0; i < rug.length; i++){
            for (int j = 0; j < rug[i].length; j++){
                if(i % 2 == 0 && j % 2 != 0){
                    rug [i][j] = "⏾ ";
                } else if (i % 2 == 0 && j % 2 == 0){
                    rug [i][j] = "☆ ";
                } //emojis alternate within each row
                if(i % 2 != 0 && j % 2 == 0){
                    rug [i][j] = "⏾ ";
                } else if (i % 2 != 0 && j % 2 != 0){
                    rug[i][j] = "☆ ";
                } //emojis alternate within each column
            }
        }
        return rug;
    }

    public static String [][] plaid (int width, int height){
        //method that returns a 2D emoji array where the emojis alternate by row, and within every other row the emojis alternate, creating a plaid pattern
        String [][] rug = new String [width][height];
        for (int i = 0; i < rug.length; i++){
            for (int j = 0; j < rug[i].length; j++){
                if (i % 2 == 0 && j % 2 != 0){
                    rug [i][j] = "⏾ ";
                    //when the row number is even and the column number is odd, make the array at that position equal to the moon emoji
                } else {
                    rug [i][j] = "☆ ";
                }
            }
        }
        return rug;
    }

    public static String [][] argyle (int width, int height){
        //method that returns a 2D emoji array in an argyle pattern 
        String [][] rug = new String [width][height];
        for (int i = 0; i < rug.length; i++){
            for (int j = 0; j < rug[i].length; j++){
                if(i == j || j == rug.length - 1 - i){
                   rug [i][j] = "⏾ ";
                } //this if stateement creates the x that is behind the diamond
                else {
                    rug[i][j] = "☆ ";
                }
                if((int) (rug.length / 2) - i == j){
                        rug[i][j] = "⏾ ";
                    } else if((int) (rug.length / 2) + i == j){
                        rug[i][j] = "⏾ ";
                    } else if (i - (int) (rug.length / 2) == j){
                        rug[i][j] = "⏾ ";
                    } else if (i >= (int) (rug.length / 2) && j == rug.length - 1 + (int)(rug.length / 2)  - i){
                        rug[i][j] = "⏾ ";
                    } //these if/else if statements create the diagonal lines that make up the diamond
            }
        }
        return rug;
    }

}