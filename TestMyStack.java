/*U10316048 劉信佑*/
import java.util.*;

public class TestMyStack{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);//Create a Scanner
		NewMyStack object1 = new NewMyStack();//Create a object1
		for(int i = 1;i<=5;i++){
			System.out.print("Input a string: ");
			String s = input.next();
			object1.list.add(s);
		}
		NewMyStack object2 = new NewMyStack();//Create a object2
		object2 = (NewMyStack)object1.clone();//將object1複製給object2
		if(object1 == object2){
			System.out.println("記憶體位置相同");
		}//如果記憶體位置相同print這個
		else{
			System.out.println("記憶體位置不相同");
		}//如果記憶體位置不相同print這個
	}
}

class NewMyStack implements Cloneable{
  
  ArrayList<Object> list = new ArrayList<Object>();
  
  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int getSize() {
    return list.size();
  }

  public Object peek() {
    return list.get(getSize() - 1);
  }

  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public void push(Object o) {
    list.add(o);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Object clone(){
	try{
		NewMyStack ob = (NewMyStack)super.clone();
		ob.list = (ArrayList<Object>)list.clone();//將ArrayList複製給ob物件
		return ob;
	}
	catch(CloneNotSupportedException ex){
		return null;//例外狀況return null
	}
  }
}
