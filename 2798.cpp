#include <bits/stdc++.h>

using namespace std;

int a[100];
vector<int> v;
bool issolve[100];
int result;
int N, M;

void    solve()
{
    if (v.size() == 3)
    {
        int sum = 0;
        for (int i = 0; i < 3; i++)
            sum += v[i];
        if (sum <= M)
        result = max(result, sum);
        return ;
    }
    for(int i = 0; i < N; i++)
    {
        if (issolve[i])
            continue;
        issolve[i] = true;
        v.push_back(a[i]);
        solve();
        v.pop_back();
        issolve[i] = false;
    }
}

int main(void)
{
    cin >> N >> M;
    for(int i = 0; i < N; i++)
        cin >> a[i];
    solve();
    cout << result << "\n";
    return 0;
}