#include <bits/stdc++.h>

using namespace std;

int N, M, H;
bool a[11][31];

bool    valid(void)
{
    for (int X = 1; X <= N; X++) {
        int ch = X;
        for (int Y = 1; Y <= H; Y++) {
            if (a[Y][ch] == 1) {
                ch++;
            }
            else if (a[Y][ch - 1] == 1) {
                ch--;
            }
        }
        if (ch != X) {
            return false;
        }
    }
    return true;
}

void    dfs(int depth)
{
    if (!valid()) return ;
    if (depth == N)
    {

    }
    int i = depth;
    for (int j = 1; j <= H; j++)
    {
        if (a[i][j]) continue;
        if (a[i - 1][j]) continue;
        if (a[i + 1][j]) continue;
        a[i][j] == true;
        dfs(depth + 1);
        a[i][j] == false;
    }
}

int main(void)
{
    cin >> N >> M >> H;
    return 0;
}