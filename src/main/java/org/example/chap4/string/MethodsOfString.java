package org.example.chap4.string;

public class MethodsOfString {
    public static void main(String[] args) {
        new MethodsOfString().replace();
    }
    void replace() {
        String name = "Enrico";
        StringBuilder sb = new StringBuilder("coII");
        //replace take CharSequence as parameters so I can even pass a Substring
        String result = name.replace("co", sb);
        System.out.println(result);
        System.out.println(sb);
        StringWrapper strw = new StringWrapper("Hello");
        System.out.println("toto " + strw);
        String min = "MINIMUM";
        String strMin = min.substring(4, 7);
        System.out.println(strMin);
    }
    public class StringWrapper {
        private String str;
        public StringWrapper(String str){
            this.str = str;
        }
    }
}
