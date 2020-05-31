import java.io.*;
public class CF_1354_A {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
        while(tc-->0){
        String[] input=br.readLine().split(" ");
        long a=Long.parseLong(input[0]);
        long b=Long.parseLong(input[1]);
        long c=Long.parseLong(input[2]);
        long d=Long.parseLong(input[3]);

        boolean possible=true;
        long sleepTime=0;
        if(b>=a){
            sleepTime=b;
        }
        else{
            sleepTime=b;
            long diff=a-b;
            if(c>d){
                long div=c-d;
                long times=diff/div;

                if(diff%div==0){
                }
                else{
                    times++;
                }
                sleepTime+=(times*c);
            }
            else{
                possible=false;
            }   
        }
        if(possible){
            System.out.println(sleepTime);
        }
        else{
            System.out.println(-1);
        }
    }
    }
}
