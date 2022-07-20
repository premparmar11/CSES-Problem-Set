package GraphAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingRooms {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = reader.readLine().toCharArray();
        }

        int numberOfRooms = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '.') {
                    numberOfRooms++;
                    bfs(grid, i, j);
                }
            }
        }

        System.out.println(numberOfRooms);
    }

    public static void bfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '#') {
            return;
        }

        grid[i][j] = '#';

        bfs(grid, i+1, j);
        bfs(grid, i-1, j);

        bfs(grid, i, j+1);
        bfs(grid, i, j-1);
    }
}
