#include <bits/stdc++.h>

using namespace std;

int a[21][21];
bool issolve[22];
int N;
int result = 1e9;

void    solve(int x, int pos)
{
    if (x == N / 2)
    {
        int start = 0;
        int link = 0;

        for (int i = 1; i <= N; i++)
            for (int j = 1; j <= N; j++)
            {
                if (issolve[i] == true && issolve[j] == true)
                    start += a[i][j];
                if (issolve[i] == false && issolve[j] == false)
                    link += a[i][j];
            }
        if (abs(start - link) < result)
            result = abs(start - link);
        return ;
    }
    for(int i = pos; i < N; i++)
    {
        issolve[i] = true;
        solve(x + 1, i + 1);
        issolve[i] = false;
    }
}

int main(void)
{
    //입력
    cin >> N;
    for(int i = 1; i <= N; i++)
        for (int j = 1; j <= N; j++)
            cin >> a[i][j];
    //count는 0으로 , 노드는 1부터 반복문 시작
    solve(0, 1);
    cout << result << "\n";
    return 0;
}