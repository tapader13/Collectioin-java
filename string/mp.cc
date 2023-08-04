#include <iostream>
#include <unordered_map>
using namespace std;
int main()
{
    int maxCount = 0;
    char ch;
    unordered_map<char, int> mp;
    string str = "mimaaa";
    for (auto i : str)
    {
        mp[i]++;
    }
    for (auto i : mp)
    {
        if (i.second > maxCount)
        {
            ch = i.first;
            maxCount = i.second;
        }
    }
    cout << ch << maxCount;
}