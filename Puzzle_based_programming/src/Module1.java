import java.util.Scanner;

public class Module1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result;

        System.out.print("Dimensions of the dungeon (Row X Column): ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        boolean visited[][] = new boolean[row][column];

        System.out.print("Position of the adventurer: ");
        int rowOfTheAdventurer = sc.nextInt() - 1;
        int columnOfTheAdventurer = sc.nextInt() - 1;

        System.out.print("Position of the gold: ");
        int rowOfTheGold = sc.nextInt() - 1;
        int columnOfTheGold = sc.nextInt() - 1;

        visited[rowOfTheAdventurer][columnOfTheAdventurer] = true;

        result = helper(rowOfTheAdventurer, columnOfTheAdventurer, visited, rowOfTheGold, columnOfTheGold, 0, Integer.MAX_VALUE);

        System.out.println("Minimum steps to reach the gold: " + (result == Integer.MAX_VALUE ? -1 : result));
    }

    static int helper(int row, int column, boolean[][] visited, int rowGold, int columnGold, int count, int min) {

        if (row == rowGold && column == columnGold) {
            return Math.min(count, min);
        }
        int currentMin = min;
        if (row - 1 >= 0 && !visited[row - 1][column]) {
            visited[row - 1][column] = true;
            currentMin = helper(row - 1, column, visited, rowGold, columnGold, count + 1, currentMin);
            visited[row - 1][column] = false;
        }
        if (column - 1 >= 0 && !visited[row][column - 1]) {
            visited[row][column - 1] = true;
            currentMin = helper(row, column - 1, visited, rowGold, columnGold, count + 1, currentMin);
            visited[row][column - 1] = false;
        }
        if (row + 1 < visited.length && !visited[row + 1][column]) {
            visited[row + 1][column] = true;
            currentMin = helper(row + 1, column, visited, rowGold, columnGold, count + 1, currentMin);
            visited[row + 1][column] = false;
        }
        if (column + 1 < visited[0].length && !visited[row][column + 1]) {
            visited[row][column + 1] = true;
            currentMin = helper(row, column + 1, visited, rowGold, columnGold, count + 1, currentMin);
            visited[row][column + 1] = false;
        }

        return currentMin;
    }
}
