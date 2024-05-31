A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.


===========Solution=============
  class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder s1= new StringBuilder();
        for(int i=0;i<s.length();i++){
            int ascii=s.charAt(i);
            if((ascii<=122 && ascii>=97) || (ascii<=90 && ascii>=65) || Character.isDigit(ascii))
                s1.append(s.charAt(i));
        }
        int i=0;
        s=s1.toString().toLowerCase();
        System.out.println(s);
        int n=s.length();
        if(n==0 || n==1){
            return true;
        }
        else{
            if(n%2==0){
                  while(i<n/2){
                    if(s.charAt(i)!=s.charAt(n-i-1)) return false;
                    i+=1;
                  }  
            }
            else{
                while(i<=n/2){
                    if(s.charAt(i)!=s.charAt(n-i-1)) return false;
                    i+=1;
                  }
            }
            
            return true;
        }
    }
}
