package trash.p3.circle;

public class ObjectDouble {

    public static void type (Object test){
        if (test instanceof Integer) System.out.println("Integer");
        else if (test instanceof Double) System.out.println("Double");
        else if (test instanceof Float) System.out.println("Float");
        else if (test instanceof String) System.out.println("String");
        else if (test instanceof Byte) System.out.println("Byte");
        else if (test instanceof Long) System.out.println("Long");
        else if (test instanceof Short) System.out.println("Short");
        else System.out.println("unknown type");
    }

    public static void main(String[] args){
        String y = "3.25";
        Double x = Double.valueOf(y);
        System.out.print(x + " ");
        type(x);
        System.out.println(Double.parseDouble("12.89"));
        int xint = x.intValue();
        System.out.print(xint + " ");
        type(xint);
        byte xbyte = x.byteValue();
        System.out.print(xbyte + " ");
        type(xbyte);
        short xshort = x.shortValue();
        System.out.print(xshort + " ");
        type(xshort);
        long xlong = x.longValue();
        System.out.print(xlong + " ");
        type(xlong);
        float xfloat = x.floatValue();
        System.out.print(xfloat + " ");
        type(xfloat);

        String d = Double.toString(3.14);
        System.out.print(d + " ");
        type(d);

    }
}
