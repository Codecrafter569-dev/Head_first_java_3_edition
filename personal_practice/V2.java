import java.util.ArrayList;

public class V2{
public static  void main(String args[]){
ArrayList<SimUnit> aList = new ArrayList<>();
V21 v2 = new V21(aList);
V31 v3 = new V31(aList);
for(int z = 0; z < 20 ; z++){
Ret ret = new Ret(aList);

}
}
}
class SimUnit{
String botType;
SimUnit(String t){
botType = t;
}
int powerUse(){
if("Ret".equals(botType)){
return 2;
}else{
return 4;
}
}
}
class V21{
V21(ArrayList<SimUnit> list){
for(int i = 0; i< 5; i++){
list.add(new SimUnit("V21"));
}

}

}
class V31 extends V21{
V31(ArrayList<SimUnit> list1){
super(list1);
for(int i = 0; i< 5; i++){


list1.add(new SimUnit("V31"));
}
}
}
class Ret{
Ret(ArrayList<SimUnit> list2){
list2.add(new SimUnit("Ret"));
}

}