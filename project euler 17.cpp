//
//  main.cpp
//  Project Euler 17
//
//  Created by MarkMax on 8/2/16.
//  Copyright © 2016 MarkMax. All rights reserved.
//

#include <iostream>

using namespace std;

string convertToString (int number);
int countAlpha(string text);

int main() {
    string numberText;
    long totalLetters = 0;
    
    for (int num = 1; num <= 1000; num++) {
        numberText = convertToString(num);

        int countLetters = countAlpha(numberText);

        cout << num << " = " << countLetters << " = " << numberText << endl;

        
        totalLetters += countLetters;
    }
    
    cout << "answer = " << totalLetters << endl;
}

string convertToString (int number) {
    string result;
    
    if (number == 1000) {
        result = "one thousand";
    }
    
    if (number >= 100 && number < 1000) {
        
        switch (number/100) {
            case 9: result = "nine"; break;
            case 8: result = "eight"; break;
            case 7: result = "seven"; break;
            case 6: result = "six"; break;
            case 5: result = "five"; break;
            case 4: result = "four"; break;
            case 3: result = "three"; break;
            case 2: result = "two"; break;
            case 1: result = "one"; break;
            default: result = "";
        }
        
        result += " hundred";
        
        number %= 100;
        
        if (number != 0) {
            result += " and";
        }
    }
    
    if (number >= 20 && number < 1000) {
        
        switch (number/10) {
            case 9: result += " ninety"; break;
            case 8: result += " eighty"; break;
            case 7: result += " seventy"; break;
            case 6: result += " sixty"; break;
            case 5: result += " fifty"; break;
            case 4: result += " forty"; break;
            case 3: result += " thirty"; break;
            case 2: result += " twenty"; break;
            default: result += "";
        }
        
        number %= 10;
    }
    
    switch (number) {
            case 19: result += " nineteen"; break;
            case 18: result += " eighteen"; break;
            case 17: result += " seventeen"; break;
            case 16: result += " sixteen"; break;
            case 15: result += " fifteen"; break;
            case 14: result += " fourteen"; break;
            case 13: result += " thirteen"; break;
            case 12: result += " twelve"; break;
            case 11: result += " eleven"; break;
            case 10: result += " ten"; break;
            case 9: result += " nine"; break;
            case 8: result += " eight"; break;
            case 7: result += " seven"; break;
            case 6: result += " six"; break;
            case 5: result += " five"; break;
            case 4: result += " four"; break;
            case 3: result += " three"; break;
            case 2: result += " two"; break;
            case 1: result += " one"; break;
            default: result += "";
    }
    
    return result;
}


int countAlpha (string text) {
    int countLetters = 0;
    
    for (int i = 0; i < text.length(); i++) {
        if (isalpha(text[i])) {
            ++countLetters;
        }
    }
    
    return countLetters;
}