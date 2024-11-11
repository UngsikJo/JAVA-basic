public class CHP3_5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());

        String result = "hello";
        result += " ";
        result += "jump to java";
        System.out.println(result);

        StringBuilder sb1 = new StringBuilder();
        sb1.append("hello");
        sb1.append(" ");
        sb1.append("jump to java");
        System.out.println(sb1.toString());

        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0,"hello ");
        System.out.println(sb2.toString());

        StringBuffer sb3 = new StringBuffer();
        sb3.append("hello jump to java");
        System.out.println(sb3.substring(0,4));
    }
}
