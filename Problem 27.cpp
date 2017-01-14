//
//  Problem 27
//
//  Created by MarkMax on 1/13/17.
//  Copyright © 2017 MarkMax. All rights reserved.
//

#include <iostream>
#include <cmath>
using namespace std;

bool isPrime(int num);

int main() {

    bool primes[40000];
    int maxA = 0;
    int maxB = 0;
    int max = 0;
    
    
    
    for (int i = 0; i < 40000; i++) {
        primes[i] = isPrime(i);
    }
    
    for (int a = -999; a <= 999; a++) {
        for (int b = -1000; b <= 1000; b++) {
            
            int count = 0;
            int n = 0;
            int quad = n*n + n*a + b;
            
            while (quad > 0 && primes[quad] == true) {
                quad = n*n + n*a + b;
                count++;
                n++;
            }
        
            if (count > max) {
                max = count;
                maxA = a;
                maxB = b;
            }
            
        }
        
        
    }
    
    cout << maxA * maxB << endl;
    
}


bool isPrime(int num) {
    
    if (num <= 0) {
        return false;
    } else if (num == 1 || num == 2) {
        return true;
    } else if (num%2 == 0) {
        return false;
    } else {
        
        for (int i = 3; i < sqrt((double) num); i++) {
            
            if (num%i == 0) {
                return false;
            }
        }
        
    }
    
    return true;
    
}
