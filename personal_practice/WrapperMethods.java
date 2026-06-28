public class WrapperMethods{
public static void main(String args[]){
//String to primitive
System.out.println(Integer.parseInt("743"));
System.out.println(Float.parseFloat("743.58849"));
System.out.println(Double.parseDouble("5.7568576"));
System.out.println(Short.parseShort("23"));
System.out.println(Byte.parseByte("12"));
System.out.println(Boolean.parseBoolean("true"));
System.out.println(Long.parseLong("743829753983"));
//primitive to String
double d = 42.5;
String doubleString = ""+d;
String doubleString1 = Double.toString(d);
String doubleString2  = String.valueOf(d);
System.out.println(doubleString);
System.out.println(doubleString1);
System.out.println(doubleString2);
}

}