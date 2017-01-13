//
//  Problem 25
//
//  Created by MarkMax on 1/11/17.
//  Copyright © 2017 MarkMax. All rights reserved.
//

#include <iostream>
#include <cmath>
using namespace std;

void addBigNums(int num1[], int num2[], int sum[]);

int main() {
    
    int index = 2;
    
    int num1[1001];
    int num2[1001];
    int sum[1001];
    
    fill(num1, num1+1001, 0);
    fill(num2, num2+1001, 0);
    fill(sum, sum+1001, 0);
    
    num1[0] = 1;
    num2[0] = 1;
    
    while (sum[999] == 0) {
        addBigNums(num1, num2, sum);
        copy(num2, num2+1001, num1);
        copy(sum, sum+1001, num2);
        
        ++index;
    }
    
    cout << index << endl;
    
}

void addBigNums(int num1[], int num2[], int sum[]) {
    int index = 0;
    
    sum[index] = num1[index]%10 + num2[index]%10;
    ++index;
    
    while (index < 1001) {
        if (sum[index-1] >= 10) {
            sum[index] = num1[index]%10 + num2[index]%10 + 1;
        } else {
            sum[index] = num1[index]%10 + num2[index]%10;
        }
        
        ++index;
    }
}
