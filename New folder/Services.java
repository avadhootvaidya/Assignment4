package services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Services {
	 @SuppressWarnings("resource")
	public void CopyData()
	{
		
		try {
			URL url=new URL("http://www.texla.net");    
			URLConnection urlcon=url.openConnection();    
			InputStream stream=urlcon.getInputStream(); 
            FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\web-content.txt");
            while (true) {
                int i = stream.read();
                if (i == -1)
                    break;
                System.out.print((char) i);//display on cmd
                fos.write(i);// write the source in b.txt

            }
        } catch (IOException e)
		{
        	System.out.print(e);
        }
		
	}

}
