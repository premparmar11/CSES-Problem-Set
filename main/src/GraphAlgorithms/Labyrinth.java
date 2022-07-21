package GraphAlgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Labyrinth {

    private static String shortestPath = null;
    
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = reader.readLine().toCharArray();
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'A') {
                    bfs(grid, "", i, j);
                    if (Objects.nonNull(shortestPath)) {
                        System.out.println("YES");
                        System.out.println(shortestPath.length());
                        System.out.println(shortestPath);
                    } else {
                        System.out.println("NO");
                    }
                    i = grid.length; // To break outer loop, if inner loop executes successfully
                    break;
                }
            }
        }
    }

    public static void bfs(char[][] grid, String path, int i, int j) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '#') {
            return;
        }

        if (grid[i][j] == 'B') {
            if (shortestPath == null || path.length() < shortestPath.length()) {
                shortestPath = path;
            }
            return;
        }

        grid[i][j] = '#';

        bfs(grid, path + "D", i+1, j);
        bfs(grid, path + "U", i-1, j);
        bfs(grid, path + "R", i, j+1);
        bfs(grid, path + "L", i, j-1);
    }

}
