import java.io.*;

public class myexception {
     public void f() throws IOException{
    	 int a = -1;
    	 if(a<0) throw new IOException("����һ���쳣����");
     }
     public static void main(String[] args) throws IOException {
    	 int c;
    	 try {
    		 while((c=System.in.read())!=-1) {
    			 if(c!='a')
    				 throw new Exception("��������ĸa");
    			 System.out.println(c);
    			 
    		 }
    	 }
    	 catch (IOException e){
    		 System.out.println(e);
    	 }
    	 catch (Exception e) {
    		 System.out.println(e);
    	 }  	      	
	}
}
