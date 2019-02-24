## 随机加密算法
Random Encryption Algorithms

### 简介
这是一个我也不知道有没有人写过的简单算法  
假设有四个字符需要加密: abcd  
以随机生成数字的方式使其从第0位到最后一位分别随机与其它位置的字符交换。  
并记录其移动到了哪个位置(生成一串私钥)。解密程序可以根据其生成的加密后的字符串和私钥对其进行解密。  
**如果配合base64, md5等加密方式混合加密, 效果更佳.**  
  
### Introduction
For example, the are four character needs to encrypt: abcd  
We let each character random exchange with other character and record it(sum private key).  
The Decoder can decode the characters with Private Key and Text(has been encrypted).  
**If u mix and encrypt with base64, md5 and other encryption methods, the effect will be better.**  
  
### About
By Adler  
Wechat/QQ: 1101635162
