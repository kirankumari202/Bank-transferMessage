Simple Interface

You would have heard many people discussing that Java does not support multiple Inheritance, instead the same can be achieved through Interface. Java Developers always believed that the class could have properties of or have 'is-a' relationship from the parent class, but should not have more than one 'is-a' relationship. But they also are of the opinion that one class can exhibit multiple behaviors (methods), and a class can commit itself to implement all the methods giving the intent of hiding the implementation. Thus Interface was born.

An Interface consists of a contract of a set of methods with the only declaration and no implementation. Any class which implements the interface commits that all methods would be implemented. 

One such practical scenario is the contract between the Banks to perform fund/message transfer. The information has to be confidential and each bank might use its own encryption & decryption techniques. The Reserve Bank might setup an Interface giving the method names and not worrying about the implementation.

1. Create an interface BankTransfers
2. Add two methods with the following prototype
   --- public String encrypt(String a);
  --- public String decrypt(String a);
3. Create class ICICI which implements the BankTransfers Interface & implements a simple encryption technique.
4. Create class HDFC which implements the BankTransfers Interface & implements a simple encryption technique.
5. Encrypt technique followed by both banks:
      ICICI - add 1 with the ASCII value of the character and insert number '1' after every character.
      HDFC - add 1 with the ASCII value of the character in the even Index and subtract 1 with the ASCII value of the character in the odd Index. It does not encrypt the space.
The reverse of both will be decrypted the message (i.e original text)

Input and Output format:
Refer to sample Input and Output for formatting specifications.

Note: All text in bold corresponds to input and the rest corresponds to output.

Sample Input and Output 1:

Select the Bank Name
1.ICICI
2.HDFC
1
Enter the Message to Transfer
welcome all
The Encrypted message is : x1f1m1d1p1n1f1!1b1m1m1
The Decrypted message is : welcome all

Sample Input and Output 2:

Select the Bank Name
1.ICICI
2.HDFC
2
Enter the Message to Transfer
Status is pending
The Encrypted message is : Tsbsvr ht qdocjmh
The Decrypted message is : Status is pending

Sample Input and Output 3:

Select the Bank Name
1.ICICI
2.HDFC
4
Invalid Type
