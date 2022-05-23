#include <bits/stdc++.h>

using namespace std;

int N;
int a[12];
int op[4];
vector<int> v;
long long mmax = -2147483648;
long long mmin = 2147483648;

void    solve()
{
    if (v.size() == N - 1)
    {
        long long sum = a[1];
        for (int i = 0; i < v.size(); i++)
        {
            if (v[i] == 0)
                sum += a[i + 2];
            else if (v[i] == 1)
                sum -= a[i + 2];
            else if (v[i] == 2)
                sum *= a[i + 2];
            else if (v[i] == 3)
                sum /= a[i + 2];
        }
        if (mmax < sum)
            mmax = sum;
        if (mmin > sum)
            mmin = sum;
        return ;
    }
    for (int i = 0; i < 4; i++)
    {
        if (op[i] == 0)
            continue ;
        op[i]--;
        v.push_back(i);
        solve();
        v.pop_back();
        op[i]++;
    }
}

int main(void)
{
    cin >> N;
    for (int i = 1; i <= N; i++)
        cin >> a[i];
    for (int i = 0; i < 4; i++)
        cin >> op[i];
    solve();
    cout << mmax << "\n";
    cout << mmin << "\n";
    return 0;
}