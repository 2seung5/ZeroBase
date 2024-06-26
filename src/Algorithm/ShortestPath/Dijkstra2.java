package Algorithm.ShortestPath;

import java.util.ArrayList;
import java.util.PriorityQueue;

//다익스트라 - 우선순위 큐를 이용
public class Dijkstra2 {
    static class Node{
        int to;
        int weight;

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    public static void dijkstra(int v, int[][] data, int start){
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i < v+1; i++) { //0번째는 안쓰기
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < data.length; i++) {
            graph.get(data[i][0]).add(new Node(data[i][1],data[i][2]));
        }

        int[] dist = new int[v+1];
        for (int i = 1; i <v+1 ; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>((x,y)->x.weight-y.weight);
        pq.offer(new Node(start, 0));
        while (!pq.isEmpty()){
            Node curNode = pq.poll();

            if (dist[curNode.to] < curNode.weight){
                continue;
            }
            for (int i = 0; i < graph.get(curNode.to).size(); i++) {
                Node adjNode = graph.get(curNode.to).get(i);

                if (dist[adjNode.to] > curNode.weight+ adjNode.weight){
                    dist[adjNode.to] = curNode.weight + adjNode.weight;
                    pq.offer(new Node(adjNode.to, dist[adjNode.to]));
                }
            }
        }


        for (int i = 1; i < v+1; i++) {
            if (dist[i] == Integer.MAX_VALUE){
                System.out.print("INF ");
            }else {
                System.out.print(dist[i] + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[][] data = {{1,2,2},{1,3,3},{2,3,4},{2,4,5},{3,4,6},{5,1,2}};
        dijkstra(5,data,1);
    }
}
