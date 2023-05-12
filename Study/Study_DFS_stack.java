package Study;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Study_DFS_stack {
    public static void main(String[] args) {

        boolean[] visited = new boolean[9];
        int[][] graph = {{}, {2, 3, 8}, {1, 7}, {1, 4, 5}, {3, 5}, {3, 4}, {7}, {2, 6, 8}, {1, 2}};
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        visited[1] = true;

        Study_DFS_stack dfsExam = new Study_DFS_stack();
        dfsExam.dfs(graph,1, visited);

    }

    /**
     * dfs 메서드
     * @param graph 노드 연결 정보 저장
     * @param start visited 방문을 시작하는 최상단 노드의 위치
     * @param visited 노드 방문 정보를 저장
     */
    public void dfs(int [][] graph, int start, boolean[] visited) {
        visited[start] = true;
        System.out.print(start + " -> ");

        Deque<Integer> stack = new LinkedList<>();
        stack.push(start);

        while(!stack.isEmpty()) {
            int now = stack.peek();

            boolean hasNearNode = false;

            for (int i : graph[now]) {
                if(!visited[i]) {
                    hasNearNode = true;
                    stack.push(i);
                    visited[i]=true;
                    System.out.print(i + " -> ");
                    break;
                }
            }

            if(hasNearNode == false) {
                stack.pop();
            }

        }

    }
}
