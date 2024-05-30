package pro;

interface Drawablee{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectanglee implements Drawablee{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  class TestInterfaceStatic{  
public static void main(String args[]){  
Drawablee d=new Rectanglee();  
d.draw();  
System.out.println(Drawablee.cube(3));  
}}  