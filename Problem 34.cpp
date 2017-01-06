//
//  Problem 34


#include <iostream>
using namespace std;

int main() {
    int factorials[10] = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
    int answer = 0;
    
    for (int i = 11; i <= 2540160; i++) {
        
        int num = i;
        int sum = 0;
        
        while (num > 0 && sum <= i) {
            int digit = num%10;
            sum += factorials[digit];
            num /= 10;
        }
        
        if (sum == i) {
            answer += i;
        }
    }
    
    cout << answer << endl;
    
    
}
