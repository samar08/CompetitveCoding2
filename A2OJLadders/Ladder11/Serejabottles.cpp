//
// Created by Mohana samara simha reddy Attunuru on 15/07/25.
//
#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<int> a(n); // brand of each bottle
    vector<int> b(n); // brand that each bottle can open

    for (int i = 0; i < n; ++i) {
        cin >> a[i] >> b[i];
    }

    int unopenable = 0;

    // For each bottle, check if any other bottle can open it
    for (int i = 0; i < n; ++i) {
        bool canBeOpened = false;

        for (int j = 0; j < n; ++j) {
            if (i == j) continue; // A bottle can't open itself

            if (b[j] == a[i]) {
                canBeOpened = true;
                break;
            }
        }

        if (!canBeOpened) {
            ++unopenable;
        }
    }

    cout << unopenable << endl;

    return 0;
}


