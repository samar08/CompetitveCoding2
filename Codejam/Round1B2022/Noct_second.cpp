#include <bits/stdc++.h>

using namespace std;

#define ll long long int

#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>

using namespace __gnu_pbds;

typedef tree<
    pair<int, int>,
    null_type,
    less<pair<int, int>>,
    rb_tree_tag,
    tree_order_statistics_node_update>
    ordered_set;

#define fo(i, n) for (ll i = 0; i < n; i++)
#define Fo(i, k, n) for (ll i = k; i < n; i++)
#define fvr(it, v) for (auto it = v.rbegin(); it != v.rend(); ++it)
#define ALL(c) (c).begin(), (c).end() // handy for function like "sort()"
#define mod 1000000007
#define ff first
#define ss second
const long long MOD = 998244353;
const long long INF = 1e9 + 7;
typedef vector<int> vi;
typedef vector<vi> vvi;
typedef vector<ll> vli;
typedef pair<int, int> pii;
long long sq(int x) { return 1ll * x * x; }
const int MAXN = 1001;

ll binpow(ll a, ll b, ll c)
{
    ll res = 1;
    a = a % c;
    while (b > 0)
    {
        if (b & 1)
            res = (res * a) % c;

        b = b >> 1;
        a = (a * a) % c;
    }
    return res;
}

// Sieve
ll d[MAXN];
vector<ll> primes;

void sieve(ll n)
{
    ll cnt = 0;
    fo(i, n)
    {
        d[i] = i;
    }
    Fo(i, 2, n)
    {
        if (d[i] == i)
            primes.push_back(i);
        for (int j = 0; j < ((ll)primes.size()) && primes[j] <= d[i] && primes[j] * i < n; j++)
        {
            d[i * primes[j]] = primes[j];
        }
    }
}
vector<ll> primeFactors(ll n)
{
    vector<ll> factors;
    while (n != 1)
    {
        factors.push_back(d[n]);
        n /= d[n];
    }
    return factors;
}
bool cmp1(const string &a, const string &b)
{
    if (a[0] == b[0])
        return a[1] < b[1];
    return a[0] < b[0];
}
ll gcd(ll a, ll b)
{
    while (b)
    {
        a %= b;
        ll tmp = a;
        a = b;
        b = tmp;
    }

    return a;
}
ll modInv(ll n)
{
    return binpow(n, INF - 2, INF);
}

void solve()
{
    ll n,p;
    cin >> n>>p;
    ll s[n][p];
    ll a[n][2];
    fo(i,n){
        ll mx=0,mi=INF;
        fo(j,p){
            cin>>s[i][j];
            mx=max(mx,s[i][j]);
            mi=min(mi,s[i][j]);
        }
        a[i][0]=mi,a[i][1]=mx;
    }
    ll dp[n][2];
    dp[0][0]=a[0][1],dp[0][1]=2*a[0][1]-a[0][0];
    Fo(i,1,n){
        dp[i][0]=min(dp[i-1][0]+abs(a[i-1][1]-a[i][0])+a[i][1]-a[i][0],dp[i-1][1]+abs(a[i-1][0]-a[i][0])+a[i][1]-a[i][0]);
        dp[i][1]=min(dp[i-1][0]+abs(a[i-1][1]-a[i][1])+a[i][1]-a[i][0],dp[i-1][1]+abs(a[i-1][0]-a[i][1])+a[i][1]-a[i][0]);
    }
    cout<<min(dp[n-1][0],dp[n-1][1])<<endl;
    
    
}

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t, i = 0;
    t = 1;
    cin >> t;

    while (t--)
    {
        i++;
        cout<<"Case #"<<i<<": ";
        solve();
    }
}
