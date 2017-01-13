//
//  Problem 23
//
//  Created by MarkMax on 1/12/17.
//  Copyright © 2017 MarkMax. All rights reserved.
//

#include <iostream>
using namespace std;

int main() {
    int abundent[20000];
    int numAbundent = 0;
    
    int noSums[10000];
    int numNoSums = 0;
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
    
    int target = 1;
    
    // check for no sums
    while (target < 28123) {
        
        int index = 0;
        bool noSum = true;
        
        while (index < numAbundent && abundent[index] < target - 11) {
            
            int index2 = (index + numAbundent) / 2;
            
            
            if (abundent[index] + abundent[index2] > target) {
                while (index2 >= index && abundent[index] + abundent[index2] >= target) {
                    
                    if (abundent[index] + abundent[index2] == target) {
                        noSum = false;
                        break;
                    }
                    
                    --index2;
                }
                
            } else {
                while (index2 < numAbundent && abundent[index] + abundent[index2] <= target) {
                    
                    if (abundent[index] + abundent[index2] == target) {
                        noSum = false;
                        break;
                    }
                    
                    ++index2;
                }
            }
            
            if (abundent[index] + abundent[index2-1] == target || abundent[index] + abundent[index2+1] == target) {
                break;
            }
            
            
            ++index;
        }
        
        if (noSum == true) {
            noSums[numNoSums] = target;
            ++numNoSums;
            answer += target;
        }
                                               
        ++target;
    }
    
    
    cout << answer << endl;

}
