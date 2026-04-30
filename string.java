class stringmathods {
    public static void main(String[] args) {
        String str = "Hello World";
        String str1 = new String("World");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str==str1);
        System.out.println(str.equals(str1));
        System.out.println(str.length());
        System.out.println(str.isEmpty());
        System.out.println(str.isBlank());
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.compareTo(str1));
        System.out.println(str.contains("World"));
        System.out.println(str.charAt(4));
        System.out.println(str.substring(3,8));
        System.out.println(str.indexOf("W"));
        System.out.println(str.lastIndexOf("H"));
        System.out.println(str1.trim());
        System.out.println(str1.strip());
        System.out.println(str.replace("e", "a"));
        System.out.println(str1.repeat(3));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.startsWith("H"));
        System.out.println(str.endsWith("d"));
    }
}