import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList<String> aList = new ArrayList<String>();
  RandomStringChooser(String list){
    for(int i = 0; i < list.length; i++)
      aList.add(list[i]);
  }
  public String getNext(){
    if(aList.size() == 0)
      return "NONE";
    int i = (int)(Math.random()*aList.size());
    return aList.remove(i);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
