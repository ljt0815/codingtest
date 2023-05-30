#include <bits/stdc++.h>

using namespace std;

int N, M, H;
bool a[31][11];
long long result = 2147483647;
bool    valid(void)
{
    for (int X = 1; X <= N; X++) {
        int ch = X;
        for (int Y = 1; Y <= H; Y++) {
            if (a[Y][ch] == true) {
                ch++;
            }
            else if (a[Y][ch - 1] == true) {
                ch--;
            }
        }
        if (ch != X) {
            return false;
        }
    }
    return true;
}

void    dfs(int depth, int y, int x)
{
    if (depth >= result)    return ;
    if (valid())
    {
        result = depth;
        return ;
    }
    if (depth == 3) return;
    for (int i = y; i <= H; i++)
    {
        for (int j = x; j < N; j++)
        {
            if (a[i][j]) continue;
            if (a[i][j - 1]) continue;
            if (a[i][j + 1]) continue;
            a[i][j] = true;
            dfs(depth + 1, i, j);
            a[i][j] = false;
        }
        y = 1;
    }
}

int main(void)
{
    int x, y;
    cin >> N >> M >> H;
    for (int i = 0; i < M; i++)
    {
        cin >> x >> y;
        a[x][y] = true;
    }
    dfs(0, 1, 1);
    if (result == 2147483647)
        result = -1;
    cout << result << "\n";
    return 0;
}