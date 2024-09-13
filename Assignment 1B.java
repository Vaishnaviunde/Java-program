import java util scanner;
class vowel
{
public static void main (string[] args)
{
string s = new string ();
Scanner sc = new scanner (system.in);
System.out.println("Enter string");
S= sc.nextline();
int v = 0;
char c;
S = S.toLowerCase();
for(int i = 0; i<s.length(); i++)
{
C=s.charAt(i);
if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| ⅖c=='u')
{
    v++;
}
system.out.println("no of vowel:"+v);
}
}
