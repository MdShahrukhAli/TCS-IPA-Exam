public class VowInStr {
    public static void main(String[] args) {
        String str="Srk";
        String Nstr=str.toLowerCase();
        boolean Vowel=false;
        for(int i=0; i<Nstr.length(); i++){
            char ch=Nstr.charAt(i);
            if( ch=='a'|| ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                Vowel=true;
            }
        }
        if(Vowel){
            System.out.println("Vowels is present in "+str);
        }
        else{
            System.out.println("Vowels is not present in "+str);
        }

    }
}
