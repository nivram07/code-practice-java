package code.practice.java.problem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/**
 * Imagine a robot sitting on the upper left corner of grid with r rows and c columns. The robot can only move in two
 * directions, right and down, but certain cells are "off limits" such that the robot cannot step on them. Design an
 * algorithm to find a path for the robot from the top left to the bottom right.
 */
public class RobotInAGrid {

    public static final String DOWN = "down";
    public static final String RIGHT = "right";

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1, 0, 0},
                {1, 0, 1, 1, 1},
                {1, 1, 0, 1, 1},
                {1, 0, 1, 1, 0},
                {0, 0, 1, 1, 1}
        };

        List<Point> path = getPath(grid);
        path.forEach(p -> System.out.println(p.toString()));

    }

    public static List<Point> getPath(int[][] maze) {
        List<Point> path = new ArrayList<>();
        if (getPath(maze, maze.length - 1, maze[0].length - 1, path, new HashSet<>())) {
            return path;
        }
        return null;
    }

    public static boolean getPath(int[][] maze, int row, int col, List<Point> path, HashSet<Point> failedPoints) {
        if (row < 0 || col < 0 || maze[row][col] == 0) {
            return false;
        }

        Point p = new Point(row, col);

        if (failedPoints.contains(p)) {
            return false;
        }

        boolean isOrigin = row == 0 && col == 0;

        if (isOrigin || getPath(maze, row, col - 1, path, failedPoints) || getPath(maze, row - 1, col, path, failedPoints)) {
            path.add(p);
            return true;
        }
        System.out.println("Visited [" + row + "," + col + "]");
        failedPoints.add(p);
        return false;
    }



    public static class Point implements Serializable {
        int row;
        int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString() {
            return "[" + row + "," + col + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Point)) return false;
            Point point = (Point) o;
            return row == point.row &&
                    col == point.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }
}
