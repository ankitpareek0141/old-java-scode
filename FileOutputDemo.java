import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
class FileDemo{

public static void main(String[] args) throws IOException
{
String name = new String("./FileDemo/ankit.txt");
File ff = new File(name);
FileOutputStream fos = new FileOutputStream(ff,true);
String str = "\nThis is my World";

char ch[] = str.toCharArray();
for(int i=0;i<ch.length;i++)
	fos.write(ch[i]);	
fos.close();
}
}