import java.util.*;

public class LabyrinthGFG {
    static char[][] graph;
    static char[][] steps;
    static boolean[][] visited;
    static Stack<Character> ans;
    static Pair<Integer, Integer> start, dest;
    static int n, m;

    // A Pair class to store coordinates
    static class Pair<X, Y> {
        X first;
        Y second;

        Pair(X first, Y second)
        {
            this.first = first;
            this.second = second;
        }
    }

    // Function to check whether the current cell is
    // unvisited, unblocked and inside the grid
    static boolean isValid(int x, int y)
    {
        return (x >= 0 && x < n && y >= 0 && y < m
                && graph[x][y] != '#' && !visited[x][y]);
    }

    // Function to backtrack and extract the path from B to
    // A
    static void backtrack(int x, int y)
    {
        if (steps[x][y] != 'X') {
            char ch = steps[x][y];
            ans.push(ch);
            // Move one cell up
            if (ch == 'U')
                backtrack(x + 1, y);
                // Move one cell down
            else if (ch == 'D')
                backtrack(x - 1, y);
                // Move one cell left
            else if (ch == 'L')
                backtrack(x, y + 1);
                // Move one cell right
            else if (ch == 'R')
                backtrack(x, y - 1);
        }
    }

    // Function to run BFS and find the shortest path from A
    // to B
    static boolean bfs(int x, int y)
    {
        steps[x][y] = 'X';
        boolean flag = false;
        // Queue to run BFS across the grid
        Queue<Pair<Integer, Integer> > q
                = new LinkedList<>();
        q.add(new Pair<>(x, y));
        while (!q.isEmpty()) {
            Pair<Integer, Integer> ele = q.poll();
            x = ele.first;
            y = ele.second;
            // If we have reached the destination
            if (graph[x][y] == 'B') {
                flag = true;
                break;
            }
            visited[x][y] = true;
            // Move Up
            if (isValid(x - 1, y)) {
                visited[x - 1][y] = true;
                steps[x - 1][y] = 'U';
                q.add(new Pair<>(x - 1, y));
            }
            // Move Right
            if (isValid(x, y + 1)) {
                visited[x][y + 1] = true;
                steps[x][y + 1] = 'R';
                q.add(new Pair<>(x, y + 1));
            }
            // Move Down
            if (isValid(x + 1, y)) {
                visited[x + 1][y] = true;
                steps[x + 1][y] = 'D';
                q.add(new Pair<>(x + 1, y));
            }
            // Move Left
            if (isValid(x, y - 1)) {
                visited[x][y - 1] = true;
                steps[x][y - 1] = 'L';
                q.add(new Pair<>(x, y - 1));
            }
        }
        // If there is a path from A to B, print the path
        if (flag) {
            backtrack(x, y);
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args)
    {
        // Sample Input
        Scanner sc=new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
graph=new char[n][m];
steps=new char[n][m];
visited=new boolean[n][m];
ans=new Stack<>();
        for(int i=0;i<n;i++){
            String row=sc.next();
            for(int j=0;j<m;j++){
                graph[i][j]=row.charAt(j);
            }
        }

        visited = new boolean[n][m];
        steps = new char[n][m];
        ans = new Stack<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == 'A')
                    start = new Pair<>(i, j);
                else if (graph[i][j] == 'B')
                    dest = new Pair<>(i, j);
            }
        }

        // Check if there is a path from A to B
        if (bfs(start.first, start.second)) {
            System.out.println("YES");
            System.out.println(ans.size());
            while (!ans.isEmpty()) {
                System.out.print(ans.pop());
            }
        }
        else
            System.out.println("NO");
    }
}