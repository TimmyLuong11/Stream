import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileExample 
{
	public static void main(String[] args) 
	{
		String fileName = "MyData.txt";
		String data = createTextData();
		writeFile(data,fileName);
		//writeFile(fileName);
	}

	private static void writeFile(String data, String fileName)
	{
		try(FileOutputStream output = new FileOutputStream(fileName)) 
		{
			for(int index = 0; index < 10; ++index)
			{
				output.write(index);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}

	private static String createTextData() 
	{
		String[] values = {"one", "two", "three"};
		
		StringBuffer buffer = new StringBuffer();
		for(String str: values)
		{
			buffer.append(str);
			buffer.append(" ");
		}
		
		return buffer.toString();
	}

}
