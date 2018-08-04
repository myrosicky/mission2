package aa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class m2 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String header;
        try
        {
        	
        	header=URLEncoder.encode("ip", "UTF-8")+"="+URLEncoder.encode("58.248.7.145", "UTF-8")+"&"
        	+URLEncoder.encode("username", "UTF-8")+"="+URLEncoder.encode("myfabregas", "UTF-8")
        	+URLEncoder.encode("mission", "UTF-8")+"="+URLEncoder.encode("yes", "UTF-8");
        	header="ip=58.248.7.145&username=myfabregas";
            URL url=new URL("http://www.enigmagroup.org/missions/programming/1/");
            
            URLConnection connect=url.openConnection();
            connect.addRequestProperty("Cookie", "mission=yes");
            connect.setRequestProperty("ip", "58.248.7.145");
            connect.setRequestProperty("username","myfabregas");
            //connect.setDoOutput(true);
            connect.connect();
            
            /*PrintWriter pw=new PrintWriter(new OutputStreamWriter(connect.getOutputStream()));
            pw.println(header);
            
            pw.close();*/
            System.out.println("ok");
        }catch(UnsupportedEncodingException ee){ee.printStackTrace();}
        catch(MalformedURLException ee){ee.printStackTrace();}
        catch(IOException ee){ee.printStackTrace();}
        
	}

}
