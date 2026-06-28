class Book{
String title;
String auther;
}

public class BookTest{
public static void main(String args[]){
Book[] b =new Book[3];
b[0] = new Book();
b[1] = new Book();
b[2] = new Book();
b[0].title = " head first java ";
b[1].title= " head first phythin";
b[2].title =" head first PHP";
b[0].auther = "filo";
b[1].auther= "logoi";
b[2].auther= "kiko";
int i =0;
while(i<3){
System.out.println(b[i].title +" by "+b[i].auther);
i++;
}
}
}