class RevStr{
    public static void main(String[] args) {
        String str="Shahrukh";
        String nStr="";
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            nStr=ch+nStr;
        }
        System.out.println(nStr);
    }
}
