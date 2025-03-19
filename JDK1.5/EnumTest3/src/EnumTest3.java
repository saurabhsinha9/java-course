enum Color{
 WHITE, BLACK, RED, YELLOW, BLUE;  //; is optional
 
}
public class EnumTest3  implements Cloneable{

    public static void main(String[] args) {
        
        Color col1=Color.WHITE;
		Color col2=Color.BLACK;
		Color col3=Color.RED;
		Color col4=Color.YELLOW;
        Color col5=Color.BLUE;
        System.out.println("Color values are "+ col1);
        System.out.println("Color values are "+ col2);
		System.out.println("Color values are "+ col3);
		System.out.println("Color values are "+ col4);
		System.out.println("Color values are "+ col5);
		String name=col1.name();//getting the name
		System.out.println(name);
		String name1=col5.name();
		System.out.println(name1);
		int ord1=col1.ordinal();//getting the constant value assigned
		System.out.println(ord1);
        int ord2=col2.ordinal();
		System.out.println(ord2);
		int ord3=col4.ordinal();
		System.out.println(ord3);
		String str=col3.toString();//converting into String
		System.out.println(str);
		System.out.println(str instanceof String);
		System.out.println(col1 instanceof Color);
		System.out.println(col1.hashCode());
		int x=col3.compareTo(col5);
		System.out.println(x);
		 x=col5.compareTo(col3);
		System.out.println(x);
		x=Color.WHITE.compareTo(Color.YELLOW);
		System.out.println(x);
		Class cls=col1.getDeclaringClass();
		System.out.println(cls);
		System.out.println("******");
		System.out.println(cls.isInterface());
		System.out.println(cls.isPrimitive());
		System.out.println(cls.isAnnotation());
		System.out.println(cls.getName());
		System.out.println(cls.getClassLoader());
		System.out.println(cls.getSuperclass());
		System.out.println(cls.getInterfaces());
		System.out.println(cls.getModifiers());

    }

}


