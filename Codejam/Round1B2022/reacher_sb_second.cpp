#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
void solve()
{
	int n,p;
	cin>>n>>p;
	vector<vector<ll>> v(n, vector<ll>(p));
	for(int i=0;i<n;i++){
		for(int j=0;j<p;j++){
			cin>>v[i][j];
		}
	}
	for(int i=0;i<n;i++){
		sort(v[i].begin(),v[i].end());
	}
	vector<vector<ll>> dp(n,vector<ll>(2,0));
	// vector<ll> cost(n,0);
	dp[0][0] = v[0][p-1];
	dp[0][1] = 2*v[0][p-1]-v[0][0];
	// cost[0] = v[0][p-1];
	// ll ans = v[0][p-1];
	// int last = v[0][p-1];
	for(int i=1;i<n;i++){
		dp[i][0] = min(dp[i-1][0]+abs(v[i-1][p-1]-v[i][0]), dp[i-1][1]+abs(v[i-1][0]-v[i][0]));
		dp[i][1] = min(dp[i-1][0]+abs(v[i-1][p-1]-v[i][p-1]), dp[i-1][1]+abs(v[i-1][0]-v[i][p-1]));
		dp[i][0] += v[i][p-1]-v[i][0];
		dp[i][1] += v[i][p-1]-v[i][0];
		// if(abs(v[i][p-1]-last)>abs(v[i][0]-last)){
		// 	ans+=abs(v[i][0]-last);	
		// 	last = v[i][0];
		// }
		// else{
		// 	ans+=abs(v[i][p-1]-last);	
		// 	last = v[i][p-1];
		// }
		// ans+=v[i][p-1]-v[i][0];
	}
	cout<<min(dp[n-1][0],dp[n-1][1]);
}

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t;
	cin>>t;
	int k=1;
	while(t--)
	{
		cout<<"Case #"<<k<<": ";
		solve();
		k++;
		cout<<"\n";
	}
	return 0;
}