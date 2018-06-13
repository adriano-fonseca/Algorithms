package maharishi.university.sampleTest;

public class SubArrayOfArray {

  public char[ ] f(char[ ] a, int start, int len){
    String stringArray = new String(a);
    String returnArray=null;
    
      if(len==0){
        return new char[0];
      }else if(len-1>stringArray.length()-1){
        return null;
      }else if(start < 0 || len < 0){
        return null;
      }else if(start+len>stringArray.length()){
       return null; 
      }else{
        if(start+len<=stringArray.length()){
          if(len==1){
            returnArray = String.valueOf(stringArray.charAt(start));
          }else{
            if(start==0 && len <= a.length){
              returnArray = stringArray.substring(start, len);
            }else{
              returnArray = stringArray.substring(start, len+1);
            }
          }
        }else{
          return null;
        }
      }
    
    char[] charArrayReturn = returnArray.toCharArray();
    return charArrayReturn;
  }
}
