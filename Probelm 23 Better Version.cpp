//
//  Problem 23 Better Version
//
//  Created by MarkMax on 1/13/17.
//  Copyright © 2017 MarkMax. All rights reserved.
//

#include <iostream>
using namespace std;

int main() {
    const int limit = 21381;
    
    int abundent[20000];
    int numAbundent = 0;
    
    bool noSums[limit+1];
    fill(noSums, noSums+21381, true);
    
    int answer = 0;
    
    // create array of abundent numbers
    for (int i = 12; i < 28123 - 12; i++) {
        
        int sumOfFactors = 1;
        
        for (int j = 2; j <= i/2; j++) {
            if (i%j == 0) {
                sumOfFactors += j;
            }
        }
        
        if (sumOfFactors > i) {
            abundent[numAbundent] = i;
            ++numAbundent;
        }
        
    }
    
    for (int i = 0; i < numAbundent; i++) {
        for (int j = i; abundent[i] + abundent[j] < limit; j++) {
            noSums[abundent[i]+abundent[j]] = false;
        }
    }
    
    for (int k = 0; k < limit; k++) {
        if (noSums[k] == true) {
            answer += k;
        }
    }
    
    cout << answer << endl;
    
}
