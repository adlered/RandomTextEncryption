**随机加密算法**<br>
**Random Encryption Algorithms**<br>
这是一个我也不知道有没有人写过的简单算法<br>
This is a simple algorithms that i don't know who has already wrote that.<br>
`我的思路(My thought)`<br>
假设有四个字符需要加密: abcd<br>
以随机生成数字的方式使其从第0位到最后一位分别随机与其它位置的字符交换。<br>
并记录其移动到了哪个位置(生成一串私钥)。解密程序可以根据其生成的加密后的字符串和私钥对其进行解密。<br>
For example, the are four character needs to encrypt: abcd<br>
We let each character random exchange with other character and record it(sum private key).<br>
The Decoder can decode the characters with Private Key and Text(has been encrypted).<br>
By Adler
Wechat/QQ: 1101635162