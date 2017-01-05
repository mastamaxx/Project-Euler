//
//  Problem 15
//
//  Created by MarkMax on 1/5/17.
//  Copyright © 2017 MarkMax. All rights reserved.
//

#include<iostream>
using namespace std;
    
int main() {
    
    double answer = 1;
        
    for(double i = 40; i != 20; --i) {
        answer *= i/(i-20);
    }
    
    cout << printf("%f", answer) << endl;
    
}

