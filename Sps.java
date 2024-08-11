class Sps{
public static void main(String args[]){int sum=0;
System.out.println("Enter length:"+args.length);
for(int i=0;i<args.length;i++)
{sum+=Integer.parseInt(args[i]);}
System.out.println("Sum of " + args.length + " numbers are:"+sum);
}}