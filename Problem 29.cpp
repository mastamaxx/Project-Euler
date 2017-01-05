//
//  main.cpp
//  Problem 29
//
//  Created by MarkMax on 1/5/17.
//  Copyright © 2017 MarkMax. All rights reserved.
//

#include <iostream>
#include <cmath>
#include <algorithm>
using namespace std;

int main() {
    
    double array[99*99];
    int answer = 1;
    
    for (int i = 2; i <= 100; i++) {
        for (int j = 2; j <= 100; j++) {
            array[(i-2)*99+(j-2)] = rint(pow(i,j));
        }
    }

    sort(array, array+99*99);

    for (int k = 1; k < 99*99; k++) {
        cout << array[k] << endl;
        
        if (array[k] != array[k-1]) {
            ++answer;
        }
    }
    
    cout << answer << endl;
    
}


