#include <bits/stdc++.h>
#define int long long
#define float double
#define sz 100005
#define all(a) a.begin(), a.end()
#define mod 1000000007
using namespace std;
#define vi vector<int>
#define vvi vector<vector<int>>
#define debug cout << "here" << endl;
#define rep(i, n) for (int i = 0; i < n; ++i)
#define pb push_back
#define ff first
#define ss second
#define pi pair<int, int>
#define RNG
#define START_DEBUG
using namespace std;

/*---------------------------DEBUG HELPER--------------------------------------*/
template<typename T> ostream& operator<<(ostream &os, const vector<T> &v) { os << '{'; string sep; for (const auto &x : v) os << sep << x, sep = ", "; return os << '}'; }
template<typename T, size_t size> ostream& operator<<(ostream &os, const array<T, size> &arr) { os << '{'; string sep; for (const auto &x : arr) os << sep << x, sep = ", "; return os << '}'; }
template<typename A, typename B> ostream& operator<<(ostream &os, const pair<A, B> &p) { return os << '(' << p.first << ", " << p.second << ')'; }
template<typename T> ostream& operator<<(ostream &os, set<T> &v) { os << '{'; string sep; for (const auto &x : v) os << sep << x, sep = ", "; return os << '}'; }



void dbg_out() { cerr << endl; }
template<typename Head, typename... Tail> void dbg_out(Head H, Tail... T) { cerr << ' ' << H; dbg_out(T...); }

#ifdef START_DEBUG
#define dbg(...) cerr << "(" << #__VA_ARGS__ << "):", dbg_out(__VA_ARGS__)
#else
#define dbg(...)
#endif


struct custom_hash {
    static uint64_t splitmix64(uint64_t x) {
        // http://xorshift.di.unimi.it/splitmix64.c
        x += 0x9e3779b97f4a7c15;
        x = (x ^ (x >> 30)) * 0xbf58476d1ce4e5b9;
        x = (x ^ (x >> 27)) * 0x94d049bb133111eb;
        return x ^ (x >> 31);
    }

    size_t operator()(uint64_t x) const {
        static const uint64_t FIXED_RANDOM = chrono::steady_clock::now().time_since_epoch().count();
        return splitmix64(x + FIXED_RANDOM);
    }
};


void enumerateSubmasks(int m)
{
    // visits submasks without repetition and in descending order
    for (int s = m;; s = (s - 1) & m)
    {

        if (s == 0)
        {
            //...
            break;
        }
    }
}

int mpow(int a, int b, int m)
{
    if (b == 0)
        return 1;
    int x = mpow(a, b / 2, m);
    x = (x * x) % m;
    if (b % 2)
    {
        x = (x * a) % m;
    }
    return x;
}

void printBinaryString(int n)
{
    vi temp;
    while (n)
    {
        if (n & 1)
            temp.pb(1);
        else
            temp.pb(0);
        n = n >> 1;
    }
    reverse(temp.begin(), temp.end());
    for (auto node : temp)
        cout << node << " ";
    cout << endl;
}

void readVector(vi &a)
{
    int n = a.size();
    rep(i, n) cin >> a[i];
}

void update(int s,int e,int qs,int qe,int v,int index, vi &seg){
    if(s > e) return ;

    if(s>qe || e < qs) return;

    if(s>=qs && e <=qe){
        seg[index] = v;
        return ;
    }

    int mid = (s+e)/2;

    update(s,mid,qs,qe,v,2*index,seg);
    update(mid+1,e,qs,qe,v,2*index+1,seg);


    seg[index] = max(seg[2*index],seg[2*index+1]);


}

int query(int s,int e,int qs,int qe,int index, vi &seg){

    if(s > e) return LLONG_MIN ;

    if(s>qe || e < qs) return LLONG_MIN;

    if(s>=qs && e <=qe){
        return seg[index];
    }

    int mid = (s+e)/2;

    int left = query(s,mid,qs,qe,2*index,seg);
    int right = query(mid+1,e,qs,qe,2*index+1,seg);

    return max(left,right);



}

//vi primes;
//vi primesVisited(sz,false);
int32_t main()
{

//    ios_base::sync_with_stdio(false);
//    cin.tie(NULL);

    //    for(int i = 2 ; i < sz ; i++){
    //        if(primesVisited[i]) continue;
    //        primes.pb(i);
    //        for(int j = i*i ; j < sz ; j+=i) primesVisited[j] = true;
    //    }


    int tc;
    cin >> tc;
    while(tc--){
        int n;
        cin >> n;
        vector<int> arr;
        rep(i,30) arr.pb(1<<i);
        for(int i = (int)(1e9),cnt = 70;cnt>0;cnt--,i--){
            if(__builtin_popcount(i) == 1) return 1/0;
            arr.pb(i);
        }

        int sum = 0;
        for(auto node : arr) sum += node;
        rep(i,100) cout << arr[i] << " ";
        vector<int> b;

        cout << endl;
        fflush(stdout);
        rep(i,100){
            int v ;
            cin >> v;
//            if(v == -1){
//                return 1/0;
//            }
            sum += v;
            b.pb(v);
        }

        sum/=2;
        int os =sum;
        int xx = 0;
        
        sort(all(b));
        
        for(int i = 99 ; i>=0 ; i--){
            if(sum>(int)1e9){
                cout << b[i] << " ";    
                sum -= b[i];
            }else break;
            
        }
        
        for(int i = 99 ; i>=0 ; i--){
            if(sum>(int)1e9){
                cout << arr[i] << " ";
                sum -= arr[i];
            }else break;
            
        }
        

        

        for(int i =0 ; i < 30 ; i+=1){
            if((sum&(1<<i))) {
                cout << (1<<i) << " ";
                xx += (1<<i);
            }
        }
        cout << endl;
        fflush(stdout);

        // if(xx!=os) return 1/0;











    }

}
