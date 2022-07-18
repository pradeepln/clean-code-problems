package exercise01;

public class DOWFinder {
public String find(int d, int m, int y) {
String res = "";
int n = (y - 1900) * 365;
n += (y - 1900) / 4; 
switch(m) {
case 12:
n += 30;
case 11:
n += 31;
case 10:
n += 30;
case 9:
n += 31;
case 8:
n += 31;
case 7:
n += 30;
case 6:
n += 31;
case 5:
n += 30;
case 4:
n += 31;
case 3:
n += 28;
case 2:
n += 31;
}
n += d;
if(y % 4 == 0 && m <= 2) 
{
n--;
}
int di = n % 7;
String[] str = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
res = str[di];
return res;
}
public static void main(String[] args)
{
DOWFinder f = new DOWFinder();
String dow = f.find(9,3,2021);
System.out.println(dow);
}

}
