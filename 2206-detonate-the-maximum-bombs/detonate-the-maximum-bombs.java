import java.util.*;

class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        int maxBombs = 0;
        
        // Adjacency list to represent the directed graph
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (canDetonate(bombs[i], bombs[j])) {
                    graph[i].add(j);
                }
            }
        }
        
        // Try starting the chain reaction from each bomb
        for (int i = 0; i < n; i++) {
            maxBombs = Math.max(maxBombs, bfs(i, n, graph));
            // Optimization: if we already hit the total count, we can stop
            if (maxBombs == n) return n;
        }
        
        return maxBombs;
    }
    
    private boolean canDetonate(int[] b1, int[] b2) {
        long x1 = b1[0], y1 = b1[1], r1 = b1[2];
        long x2 = b2[0], y2 = b2[1];
        // Euclidean distance squared: (x1-x2)^2 + (y1-y2)^2 <= r1^2
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) <= r1 * r1;
    }
    
    private int bfs(int startNode, int n, List<Integer>[] graph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        
        queue.add(startNode);
        visited[startNode] = true;
        int count = 0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;
            
            for (int neighbor : graph[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return count;
    }
}
