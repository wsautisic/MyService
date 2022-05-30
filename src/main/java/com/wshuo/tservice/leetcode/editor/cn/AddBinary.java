//////给你两个二进制字符串，返回它们的和（用二进制表示）。 
//////
////// 输入为 非空 字符串且只包含数字 1 和 0。 
//////
////// 
//////
////// 示例 1: 
//////
////// 输入: a = "11", b = "1"
//////输出: "100" 
//////
////// 示例 2: 
//////
////// 输入: a = "1010", b = "1011"
//////输出: "10101" 
//////
////// 
//////
////// 提示： 
//////
////// 
////// 每个字符串仅由字符 '0' 或 '1' 组成。 
////// 1 <= a.length, b.length <= 10^4 
////// 字符串如果不是 "0" ，就都不含前导零。 
////// 
////// Related Topics 位运算 数学 字符串 模拟 👍 818 👎 0
////
//

package com.wshuo.tservice.leetcode.editor.cn;

import lombok.extern.slf4j.Slf4j;

/**
 * @author  YourName
 * @date 2022-05-30 19:05:53
 */
 @Slf4j
public class AddBinary{
    public static void main(String[] args) {
        Solution solution = new AddBinary().new Solution();
        String result = solution.addBinary("100","110010");
        log.info("返回结果：{}",result);
   }
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        int strIndex = Math.min(a.length(),b.length());
        StringBuilder sd = new StringBuilder();
        int num = 0;
        int nextNum = 0;
        for (int i = 0; i < strIndex; i++) {
            num = 0;
            if(a.charAt(a.length()-1-i) == '1'){
                num ++;
            }
            if(b.charAt(b.length()-1-i) == '1'){
                num ++;
            }
            if(nextNum == 0){
                sd.insert(0,num == 1 ? 1 : 0);
                nextNum = num == 2 ? 1 : 0;
            }else{
                if(num == 0){
                    sd.insert(0, 1 );
                    nextNum = 0;
                }else{
                    sd.insert(0, (num+nextNum)%2 );
                    nextNum = 1;
                }
            }
            
        }
        String maxStr ;
        if(a.length()> b.length()){
            maxStr = a;
        }else {
            maxStr = b;
        }
        for (int i = strIndex; i < maxStr.length(); i++) {
            if(nextNum > 0){
                if(maxStr.charAt(maxStr.length()-1-i) == '1'){
                    sd.insert(0, 0 );
                }else{
                    sd.insert(0, 1 );
                    nextNum = 0;
                }
            }else{
                sd.insert(0, maxStr.charAt(maxStr.length()-1-i) );
            }
        }
        if(nextNum > 0){
            sd.insert(0, 1 );
        }
        
        return sd.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}