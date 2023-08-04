#include <stdio.h>
#include <stdbool.h>
#define MAX_VERTICES 100
void createAdj(int edge[][2], int edgecount, int adj[][MAX_VERTICES], int vertex)
{

    for (int i = 0; i < edgecount; i++)
    {
        int u = edge[i][0];
        int v = edge[i][1];
        adj[u][v] = 1;
        adj[v][u] = 1;
    }
}
void bfs(int node, int adj[][MAX_VERTICES], bool visited[], int vertex)
{
    int queue[MAX_VERTICES];
    int f = 0, r = 0;
    queue[r++] = node;
    visited[node] = true;
    while (f < r)
    {
        int fNode = queue[f++];
        printf("%d ", fNode);
        for (int i = 0; i < vertex; i++)
        {

            if (adj[fNode][i] && !visited[i])
            {
                queue[r++] = i;
                visited[i] = true;
            }
        }
    }
}
void BFS(int vertex, int edge[][2], int edgecount)
{
    int adj[MAX_VERTICES][MAX_VERTICES] = {0};
    bool visited[MAX_VERTICES] = {false};

    createAdj(edge, edgecount, adj, vertex);
    for (int i = 0; i < vertex; i++)
    {
        if (!visited[i])
        {
            bfs(i, adj, visited, vertex);
        }
    }
}

int main()
{
    int edge[][2] = {{0, 1}, {0, 2}, {1, 3}, {1, 2}, {2, 4}, {3, 4}};
    int vertex = 5;
    int edgecount = sizeof(edge) / sizeof(edge[0]);
    BFS(vertex, edge, edgecount);

    return 0;
}
