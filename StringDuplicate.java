class Ankit{

public void findDuplicate(String str, int n){
char str2[] = str.toCharArray();
int index=0;
String str3="";
int j;
for(int i=0;i<str.length();i++){
    for(j=0;j<i;j++)
	if(str2[i]==str2[j])
	   break;
if(i==j)
  str3 = str3 + str2[i];
}
System.out.println(str3);
}

public static void main(String[] args){
	String str = "geeksforgeeks";
	int n = str.length();
Ankit aa = new Ankit();
	aa.findDuplicate(str, n);
}
}