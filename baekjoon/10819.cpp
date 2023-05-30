#include <bits/stdc++.h>

using namespace std;

int a[8];
vector<int> v;
bool issolve[8];
int result;
int N;

void    solve()
{
    if (v.size() == N)
    {
        int sum = 0;
        for (int i = 0; i < N - 1; i++)
        {
            sum += abs(v[i] - v[i+1]);
            cout << v[i] << " ";
        }
        cout << v[N - 1] << "\n";
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
    cin >> N;
    for(int i = 0; i < N; i++)
        cin >> a[i];
    solve();
    cout << result << "\n";
    return 0;
}