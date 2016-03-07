public class myUtil{
	
	public static double twoDecimalPlaces(double number) {
    //返回指定float的两位小数（不四舍五入）
    int index;
    String str = String.valueOf(number);
    index = str.indexOf(".");
    return Double.parseDouble(str.substring(0,index+3));
	//大神代码
	//return (long)(number*100)/100.;
	//return (int)(number*100)/100.0; 
  }
  
    public static int getcounts(String str){
	//返回str中匹配元音的字符的个数
	int count=0;
	char[] ch = str.toCharArray();
	for(char c : ch){
		if(c=='a'||c=='e'||c=='i'||c=='o'||c==''u){
			count++;
		}
	}
	return count;
	//大神代码
	//return str.replaceAll("(?i)[^aeiou]","").length();
  }
  
  public static int numberOfRectangles(int m, int n) {
    // 求mn为长和宽的矩形格子的矩形数量
    return m*n*(m+1)*(n+1)/4;
  }
	
	public int factorial(int n) {
    // 返回n阶乘，n=0时返回1,抛出小于0和大于12的异常
    if(n==0){
    	return 1;
    }else
    return n * factorial(n-1);
  }
  //大神代码
  //if(n < 0 || n > 12) throw new IllegalArgumentException("Useless fuffery!");
  //return n <= 1 ? 1 : n * factorial(n - 1);
  
  //反转字符串
  public static String revertString(String s){
	  char[] ch = s.toCharArray();
	  char[] n = new char[ch.length];
	  for(int i=0;i<ch.length;i++){
		  n[i]=ch[ch.length-i-1];
	  }
	  return String.valueOf(n);
  }
  
  public static void yuanyin(String s){
	  char[] ch = s.toLowerCase().toCharArray();
	  int ca=0,ce=0,ci=0,co=0,cu=0;
	  for(char c : ch){
		  switch(c){
			  case 'a':
				ca++;
				break;
			  case 'e':
				ce++;
				break;
			  case 'i':
				ci++;
				break;
			  case 'o':
				co++;
				break;
			  case 'u':
				cu++;
				break;
			  default:
			   
		  }
	  }
	  System.out.println("sum:" + (ca+ce+ci+co+cu));
	  System.out.println("a:" + ca);
	  System.out.println("e:" + ce);
	  System.out.println("i:" + ci);
	  System.out.println("o:" + co);
	  System.out.println("u:" + cu);
  }
  
  //panduanhuiwen
  public static boolean huiwen(String s){
	  boolean flag=true;
	  char[] ch = s.toCharArray();
	  for(int i=0;i<ch.length/2;i++){
	  if(ch[i]!=ch[ch.length-1-i]){
		  flag=false;
	      break;
	  }
	  else
	  {continue;}
	  }
	  return flag;
  }
  //public static String reverse3(String s) {
  //char[] array = s.toCharArray();
  //String reverse = "";
  //for (int i = array.length - 1; i >= 0; i--)
  //reverse += array[i];
  //return reverse;
}
