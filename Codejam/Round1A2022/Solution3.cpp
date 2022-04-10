#include<bits/stdc++.h>
using namespace std;
#define ll long long 
#define pb push_back
#define ub upper_bound
#define lb lower_bound
#define mp make_pair
#define umap unordered_map
#define popcount(x) __builtin_popcountll(x)
#define all(v) v.begin() , v.end()
#define PI 3.141592653589793238
#define E 2.7182818284590452353602874713527
#define M 1000000007
const long long INF = 1e18;
int main()
{
ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
//freopen("input.txt", "r", stdin);
//freopen("output.txt", "w", stdout);
ll int t=1,n;
cin>>t;
while(t--)
{
cin>>n;
ll int a[n],pp=1,aa=0;
for (int i = 0; i < 30; i++)
{
    a[i]=(pp<<i);
}
for (int i = 30; i < 99; i++)
{
    a[i]=129-30+i;
}
a[99]=11247;
for (int i = 0; i < 100; i++)
{
    cout<<a[i]<<" ";
}
cout<<endl;
// for (int i = 0; i < 100; i++)
// {
//     aa+=a[i];
// }
// cout<<aa;
ll int b[n],sum=0;
vector<ll int>ans;
ans.pb(11247);
for (int i = 0; i < n; i++)
{
    cin>>b[i];
    //b[i]=1000000000-i;
}
// b[n-1]=1000000000-(n-1)-1;
sort(b,b+n);
for (int i = 1; i < n; i+=2)
{
    sum+=b[i]-b[i-1];
    ans.pb(b[i-1]);
}
//cout<<sum<<endl;
ll int oo=1073741823;
ll int y=(oo+sum)/2;
for (int i = 0; i < 30; i++)
{
    if(((pp<<i)&y)!=0)
    ans.pb((pp<<i));
}
for(auto i:ans)
cout<<i<<" ";
cout<<endl;
}
}