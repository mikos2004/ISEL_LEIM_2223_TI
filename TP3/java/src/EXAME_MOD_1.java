public class EXAME_MOD_1 {

    public static boolean isFirstLetterCapitalized(String s) {
        if(s.length() == 0) {
            return false;
        }
        if(s.charAt(0) < 'A' || s.charAt(0) > 'Z'){
            return false;
        }
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == ' ' && (s.charAt(i+1) < 'A' || s.charAt(i+1) > 'Z')) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isFirstLetterCapitalized("O Crime Do Padre Amaro"));
    }
}
