/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
public static void main (String[] args) throws java.lang.Exception
{
Scanner scan    =   new Scanner(System.in);
int T   =   scan.nextInt();
scan.nextLine();
for(int i=0 ; i<T ; i++)
{
String  myString    =   scan.nextLine();
int evn =   0,
odd =   0,
len =   myString.length();
char    strE[]  =   new char[50],
strO[]  =   new char[50];
for(int j=0 ; j<len ; j++)
{
if(j%2 == 0)
{
strE[evn]   =   myString.charAt(j);
evn++;
}
 if(j%2 == 1)
 {
 strO[odd]   =   myString.charAt(j);
 odd++;
 }
 }
 System.out.print(strE);
 System.out.print(" ");
 System.out.println(strO);
	
}
}
}
