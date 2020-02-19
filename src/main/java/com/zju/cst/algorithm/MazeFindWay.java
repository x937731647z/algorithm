package com.zju.cst.algorithm;

/**
 * @author wulixz
 * @date 11/6/19 : 3:20 PM
 * @introduction :
 */
public class MazeFindWay {
    public static void main(String[] args) {
        int[][] maze = new int[8][7];
        for (int i = 0; i < 8 ; i ++){
            maze[i][0] = 1;
            maze[i][6] = 1;
        }
        for (int j = 0; j < 7 ; j ++){
            maze[0][j] = 1;
            maze[7][j] = 1;
        }
//        maze[3][1] = 1 ;
//        maze[3][2] = 1 ;
//        maze[1][2] = 1;
//        maze[2][2] = 1;


//        maze[2][3]= 1;
        maze[3][3]= 1;
        maze[3][2] = 1;
        maze[4][3]= 1;
        maze[5][3]= 1;
        maze[6][3]= 1;
        maze[7][3]= 1;
        showMaze(maze);
        System.out.println();
//        System.out.format("\33[32;4m after find the way : %n");
        System.err.println("after find the way : ");
        System.out.println();
        setWay(maze,1,1);
        showMaze(maze);

    }

    /**
     * to show the maze
     * @param maze
     */
    public static void showMaze(int[][] maze){
        for (int i = 0 ; i < 8 ; i ++){
            for (int j = 0 ; j < 7 ; j ++){
                if (maze[i][j] == 2){
//                    System.out.format("\33[32;1m %d %n",maze[i][j]);
                    System.err.printf("%d\t",maze[i][j]);
                }else {
                    System.out.printf("%d\t",maze[i][j]);
                }
            }
            System.out.println();
        }
    }

    /**
     * maze is a map array，i，j is the location of the beginning
     * 1: it means this position is a wall
     * 2: it means u will pass
     * 3: it means u have tried to go, but failed
     * we rule like this: go down first, otherwise go right, otherwise go left, otherwise go up
     * @param maze
     * @param i
     * @param j
     * @return
     */
    public static boolean setWay(int[][] maze, int i , int j){
        if (maze[6][5] == 2){
            return true;
        }else {
            if (maze[i][j] == 0){
                maze[i][j] = 2;
                if (setWay(maze, i+ 1, j )){
                    return true;
                }else if (setWay(maze,i,j+1)){
                    return true;
                }else if (setWay(maze, i -1 , j )){
                    return true;
                }else if (setWay(maze, i, j - 1)){
                    return true;
                }else {
                    maze[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }

    }
}
