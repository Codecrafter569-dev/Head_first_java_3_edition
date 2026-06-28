public class Puzzle4{
public static void main(String args[]){
Value[] v = new Value[6];
int nu = 1;
int i=0;
while(i < 6){
v[i] = new Value();
v[i].intValue = nu;
nu *= 10;
i++;
}
int re = 0;
i =6;
while (i> 0) {
i--;
re +=v[i].doStuff(i);
}
System.out.println("result "+re);
}
}

class Value{
int intValue;
public int doStuff(int factor){
if (intValue > 100){
return intValue * factor;
}else{

return intValue *(5-factor);
}
}
}