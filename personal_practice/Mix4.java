public class Mix4{
int counter = 0;
public static void main(String args[]){
int count =0;
Mix4[] m = new Mix4[20];
int i =0;
while (i<9){

m[i] = new Mix4();
m[i].counter++;
count++;
count = count + m[i].maybenew(i);
i++;
}
System.out.println(count+" "+m[1].counter);
}
public int maybenew(int index){
if(index < 5){
Mix4 mix = new Mix4();
mix.counter++;
return 1;
}
return 0;
}

}