package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _05_Bfs_Dfs_Utility_Connecting_Graph {
    public static class Edge{
        int src;
        int dest;
        int wt;

    }
    public static void bfs(ArrayList<Edge>[]graph)
    {
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                bfsUtility(graph,vis);
            }
        }
    }

    public static void bfsUtility(ArrayList<Edge>[]graph,boolean []vis)
    {
        Queue<Integer> q=new LinkedList<>();

        q.add(0);//source
        while(!q.isEmpty())
        {
            int curr=q.remove();
            if(!vis[curr])
            {
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++)
                {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }




    }
    public static void dfs(ArrayList<Edge>[]graph)
    {
        boolean vis[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!vis[i])
            {
                dfsUtility(graph,i,vis);
            }
        }
    }
    public static void dfsUtility(ArrayList<Edge>[]graph,int curr,boolean []vis)
    {
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if(!vis[e.dest])
            {
                dfsUtility(graph,e.dest,vis);
            }
        }

    }
    public static void main(String[] args) {

    }
}
