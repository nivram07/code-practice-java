package code.practice.problem; /**
We're going to make our own Contacts application! The application must perform two types of operations:

add name, where  is a string denoting a contact name. This must store  as a new contact in the application.
find partial, where  is a string denoting a partial name to src.main.java.code.practice.java.search the application for. It must count the number of contacts starting with  and print the count on a new line.
Given  sequential add and find operations, perform each operation in order.

Input Format

The first line contains a single integer, , denoting the number of operations to perform.
Each line  of the  subsequent lines contains an operation in one of the two forms defined above.

Constraints

It is guaranteed that  and  contain lowercase English letters only.
The input doesn't have any duplicate  for the  operation.
Output Format

For each find partial operation, print the number of contact names starting with  on a new line.

Sample Input

4
add hack
add hackerrank
find hac
find hak
Sample Output

2
0
Explanation

We perform the following sequence of operations:

Add a contact named hack.
Add a contact named hackerrank.
Find and print the number of contact names beginning with hac. There are currently two contact names in the application and both of them start with hac, so we print  on a new line.
Find and print the number of contact names beginning with hak. There are currently two contact names in the application but neither of them start with hak, so we print  on a new line.

**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GetWordCountProblemTriesDS {

 public static class TrieNode {
        HashMap<String, TrieNode> children;
        int count;
        boolean endOfWord;

        public TrieNode() {
            this.children = new HashMap<>();
            this.endOfWord = false;
            this.count = 0;
        }

        public static void insertWord(TrieNode root, String wordToInsert) {
            TrieNode currentNode = root;
            for (int i = 0; i < wordToInsert.length(); i++) {
                String characterToInsert = "" + wordToInsert.charAt(i);
                if (currentNode.children.get(characterToInsert) == null) {
                    TrieNode newNode = new TrieNode();
                    newNode.count = 1;
                    if (i == wordToInsert.length() - 1) {
                        newNode.endOfWord = true;
                    }
                    currentNode.children.put(characterToInsert, newNode);
                    currentNode = newNode;
                } else {
                    TrieNode child = currentNode.children.get(characterToInsert);
                    child.count++;
                    if (i == wordToInsert.length() - 1) {
                        child.endOfWord = true;
                    }
                    currentNode = child;
                }
            }
        }

        public static int getNumberOfWords(TrieNode root, String wordToSearch) {
             TrieNode currentNode = root;
             int minimumCount = 0;
             boolean foundEnd = false;
             for (int i = 0; i < wordToSearch.length(); i++) {
                 String currentCharToSearch = "" + wordToSearch.charAt(i);
                 if(currentNode.children.get(currentCharToSearch) != null) {
                    TrieNode nodeVal = currentNode.children.get(currentCharToSearch);
                    if (i == 0) {
                        minimumCount = nodeVal.count;
                    } else {
                       minimumCount =  minimumCount > nodeVal.count ? nodeVal.count : minimumCount;
                    }
                    currentNode = nodeVal;
                 } else {
                     minimumCount = 0;
                     break;
                 }
             }
            return minimumCount;
        }
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        Solution.TrieNode node = new Solution.TrieNode();
//        for(int a0 = 0; a0 < n; a0++){
//            String op = in.next();
//            String contact = in.next();
//            if (op.equals("add")) {
//                Solution.TrieNode.insertWord(node, contact);
//            }
//            if (op.equals("find")) {
//                System.out.println(Solution.TrieNode.getNumberOfWords(node, contact));
//            }
//        }
    }
}
