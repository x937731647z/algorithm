package com.zju.cst.HuaWei;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Maze {

    private static final int INF = 100000;
    private static final int N = 10;
    private static final int M = 10;
    private static char[][] mazeMatrix = {
            {'#', 'S', '#', '#', '#', '#', '#', '#', 'o', '#'},
            {'o', 'o', 'o', 'o', 'o', 'o', '#', 'o', 'o', '#'},
            {'o', '#', 'o', '#', '#', 'o', '#', '#', 'o', '#'},
            {'o', '#', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'},
            {'#', '#', 'o', '#', '#', 'o', '#', '#', '#', '#'},
            {'o', 'o', 'o', 'o', '#', 'o', 'o', 'o', 'o', '#'},
            {'#', '#', '#', '#', '#', '#', '#', '#', 'o', '#'},
            {'o', 'o', 'o', '#', 'o', 'o', 'o', 'o', 'o', 'o'},
            {'o', '#', '#', '#', '#', 'o', '#', '#', '#', 'o'},
            {'o', 'o', 'o', 'o', '#', 'o', 'o', 'o', 'G', '#'}
    };
    ;
    private static int xs = 0;
    private static int ys = 1;
    private static int xe = 9;
    private static int ye = 8;
    private static int[][] distance = new int[N][M];

    private static int[] xd = {1, 0, -1, 0};
    private static int[] yd = {0, 1, 0, -1};

    public static void main(String[] args) {
        initDistance();
        Maze maze = new Maze();
        int dis = maze.bfs();
        System.out.println("shortest length is : " + dis);
//        printDistance();
    }

    private int bfs() {
        Queue<Point> que = new ConcurrentLinkedQueue<Point>();
        que.add(new Point(xs, ys));
        distance[xs][ys] = 0;
        while (que.size() > 0) {
            Point point = que.poll();
            if (point.getX() == xe && point.getY() == ye) {
                break;
            }
            for (int i = 0; i < 4; i++) {
                int xp = point.getX() + xd[i];
                int yp = point.getY() + yd[i];
                if (0 <= xp && xp < N && 0 <= yp && yp < M && mazeMatrix[xp][yp] != '#' && distance[xp][yp] == INF) {
                    que.add(new Point(xp, yp));
                    distance[xp][yp] = distance[point.getX()][point.getY()] + 1;
                }
            }
        }
        return distance[xe][ye];
    }

    private static void initDistance() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                distance[i][j] = INF;
            }
        }
    }

//    private static void printDistance() {
//        for (int i = 0; i < N; i++) {
//            System.out.println();
//            for (int j = 0; j < M; j++) {
//                System.out.print("\t\t" + distance[i][j]);
//            }
//        }
//    }

    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}
