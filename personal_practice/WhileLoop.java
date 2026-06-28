public class WhileLoop{
public static void main(String args[]){
int i = 1;
while (i <= 8){
int j = 1;
while (j <= 9){
if ( j == 5){
System.out.println(i +" "+j+"\n");
break;
}
j++;
}
i++;
}
}

}