# Custom Template

## 设置code fileName

    P$!{question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})

    //示例：
    P67AddBinary
    

## 设置code fileName

    ${question.content}
    package com.wshuo.tservice.leetcode.editor.cn;
    /**
      * @author  YourName
      * @date $!velocityTool.date()
      */
      public class $!velocityTool.camelCaseName(${question.titleSlug}){
        public static void main(String[] args) {
          Solution solution = new $!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
          //log.info("返回结果：{}",result);
        }
      ${question.code}
      }

示例
    
    package com.wshuo.tservice.leetcode.editor.cn;

    import lombok.extern.slf4j.Slf4j;

    /**
      * @author  YourName
      * @date 2022-05-30 19:05:53
      */
      @Slf4j
      public class P67AddBinary{
          public static void main(String[] args) {
          Solution solution = new P67AddBinary().new Solution();
          String result = solution.addBinary("100","110010");
          log.info("返回结果：{}",result);
        }
        //leetcode submit region begin(Prohibit modification and deletion)
        class Solution {
        public String addBinary(String a, String b) {
    
        }
      }
    //leetcode submit region end(Prohibit modification and deletion)

}



