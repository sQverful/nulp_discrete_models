#include <bits/stdc++.h>
using namespace std;
#define V 6
int travllingSalesmanProblem(int graph[][V], int s)
{
  vector<int> vertex;
  for (int i = 0; i < V; i++)
    if (i != s)
      vertex.push_back(i);

  int min_path = INT_MAX;
  do {
    int current_pathweight = 0;

    int k = s;
    for (int i = 0; i < vertex.size(); i++) {
      current_pathweight += graph[k][vertex[i]];
      k = vertex[i];
    }
    current_pathweight += graph[k][s];

    min_path = min(min_path, current_pathweight);

  } while (
    next_permutation(vertex.begin(), vertex.end()));

  return min_path;
}
int main()
{
  int graph[][V] = { { 0, 99999, 88, 99999, 71, 16 },
  { 99999, 0, 26, 21, 87, 55 },
  { 88, 26, 0, 13, 91, 99999 },
  { 99999, 21, 13, 0, 99999, 89 },
  { 71, 87, 91, 99999, 0, 37 },
  { 16, 55, 99999, 89, 37, 0 } };
  int s = 0;
  cout << travllingSalesmanProblem(graph, s) << endl;
  return 0;
}
