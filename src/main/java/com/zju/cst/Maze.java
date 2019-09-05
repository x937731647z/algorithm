package com.zju.cst;

public class Maze {
    private static final int X = 8;
    private static final int Y = 8;

    private static final int MaxSize = 200;
    //迷宫路径
    int[][] maze = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,0,0,1,0,0,0,1,0,1},
            {1,0,0,1,0,0,0,1,0,1},
            {1,0,0,0,0,1,1,0,0,1},
            {1,0,1,1,1,0,0,0,0,1},
            {1,0,0,0,1,0,0,0,0,1},
            {1,0,1,0,0,0,1,0,0,1},
            {1,0,1,1,1,0,1,1,0,1},
            {1,1,0,0,0,0,0,0,0,1},
            {1,1,1,1,1,1,1,1,1,1},
    };

    Node Stack[] = new Node[MaxSize];
    Node Path[] = new Node[MaxSize];
    //栈顶指针
    int top = -1;
    //路径的计数
    int count = 1;
    //记录最短路径
    int minlen = MaxSize;

    public Maze() {
//        System.out.println("路径如下：");
        mazePath(1,1,X,Y);
    }
    //寻路方法
    public void mazePath(int xi,int yi,int xe,int ye){
        int i,j,di,find;
//初始化栈 起始地点入栈
        top++;
        Node n = new Node();
        Stack[top] = n;
//        System.out.println(Stack[top]);
        Stack[top].i = xi;
        Stack[top].j = yi;
        Stack[top].di = -1;
        maze[xi][yi] = -1;
//如果栈不为空就继续探路
        while(top>-1){
//取出栈顶元素
            i = Stack[top].i;
            j = Stack[top].j;
            di = Stack[top].di;
//判断是否已经找到目标点出口  如果找到出口那么打印路径
            if(i==xe && j ==ye){
                if(top+1 < minlen){
                    minlen = top+1;
//                    System.out.println(minlen+"");
                    for(int k = 0;k <= top;k++){
                        Node node = new Node();
                        Path[k] = node;
                        Path[k].i = Stack[k].i;
                        Path[k].j = Stack[k].j;
                        Path[k].di = Stack[k].di;
                    }
                }
//退出一步继续查找可行路径
                maze[Stack[top].i][Stack[top].j] = 0;
                top--;
                i = Stack[top].i;
                j = Stack[top].j;
                di = Stack[top].di;
            }
//根据四个方向试探性的查找可行路径
            find = 0;//用来标记是否已经找到可行路径  0 没找到  1找到
            while(find==0 && di<4){
                di++;
                switch(di){
                    case 0: i = Stack[top].i-1;j = Stack[top].j;break;
                    case 1: i = Stack[top].i;j = Stack[top].j+1;break;
                    case 2: i = Stack[top].i+1;j = Stack[top].j;break;
                    case 3: i = Stack[top].i;j = Stack[top].j-1;break;
                }
//如果找到可行路径那么find标记为1
                if(maze[i][j] == 0){
                    find = 1;
                }
            }
            if(find == 1){
//如果找到出口那么进栈
                Stack[top].di = di; //进栈前记录当前立脚点的寻路方向
                top++;
                Node n1 = new Node();
                Stack[top] = n1;
                Stack[top].i = i;
                Stack[top].j = j;
                Stack[top].di = -1;
//已走过路径标记为-1防止重复路过
                maze[i][j] = -1;
            }else{
//否则退一步，然后继续试探可行路径
                maze[Stack[top].i][Stack[top].j] = 0; //释放路径 为了以后的试探让路
                top--;
            }
        }
//一切执行结束后打印最短路径
//        System.out.println("最短路径如下：");
        System.out.println("len: "+minlen);

    }
    class Node{
        int i;
        int j;
        int di;
    }
    public static void main(String[] args) {
        new Maze();
    }
}
