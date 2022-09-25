package games;

import java.awt.Point;
import java.util.Scanner;

public class Snake {
        public static void main(String[] args) {
            Point playerPosition = new Point(10, 9);
            Point snakePosition = new Point(30, 2);
            Point goldPosition = new Point(6, 6);
            Point goalPosition = new Point(2, 5);
            boolean move = true;
            boolean gotGold = false;
            while (move) {
                for (int y = 0; y < 10; y++) {
                    for (int x = 0; x < 40; x++) {
                        Point point = new Point(x, y);
                        if (point.equals(playerPosition)) {
                            System.out.print("P");
                        } else if (point.equals(snakePosition)) {
                            System.out.print("S");
                        } else if (point.equals(goldPosition)) {
                            System.out.print("Au");
                        } else if (point.equals(goalPosition)) {
                            System.out.print("G");
                        } else
                            System.out.print(".");
                    }
                    System.out.println();
                }
                if (snakePosition.equals(playerPosition)) {
                    move = false;
                    System.out.println("You got eaten by the Snake!");
                }
                if (playerPosition.equals(goldPosition)) {
                    gotGold = true;
                    goldPosition = new Point(-1, -1);
                }
                if (playerPosition.equals(goalPosition) && gotGold) {
                    move = false;
                    System.out.println("You've reached your goal!");
                }
                movePlayer(playerPosition);
                moveSnake(playerPosition, snakePosition);
            }
        }
        private static void movePlayer(Point playerPosition) {
            Scanner scan = new Scanner(System.in);
            String input = scan.next();
            if (input.equals("w")) {
                if (playerPosition.y > 0)
                    playerPosition.y--;
            } else if (input.equals("s")) {
                if (playerPosition.y < 9)
                    playerPosition.y++;
            } else if (input.equals("a")) {
                if (playerPosition.x > 0)
                    playerPosition.x--;
            } else if (input.equals("d")) {
                if (playerPosition.x < 39) {
                    playerPosition.x++;
                }
            }
        }
        private static void moveSnake(Point playerPosition, Point snakePosition) {
            if (playerPosition.x < snakePosition.x) {
                snakePosition.x--;
            } else if (playerPosition.x > snakePosition.x) {
                snakePosition.x++;
            } if (playerPosition.y < snakePosition.y) {
                snakePosition.y--;
            } else if (playerPosition.y > snakePosition.y) {
                snakePosition.y++;
            }
        }
    }

