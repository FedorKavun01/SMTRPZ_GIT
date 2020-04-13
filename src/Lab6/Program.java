package Lab6;

public class Program {
    public static void main(String[] args) {
<<<<<<< HEAD

=======
        String encryptStr = encrypt("Just do it!", (char) 10);
        System.out.println(encryptStr);
        String decryptStr = decrypt(encryptStr, (char) 10);
        System.out.println(decryptStr);
>>>>>>> Lab6
    }

    public static String encrypt(String str, char a) {
        StringBuilder sb = new StringBuilder();
        for (Character b : str.toCharArray()) {
<<<<<<< HEAD
            char result = (char)(b + a);
=======
            char result = b + a > Character.MAX_VALUE ? Character.MAX_VALUE : (char)(b + a);
>>>>>>> Lab6
            sb.append(result);
        }
        return sb.toString();
    }

    public static String decrypt(String str, char a) {
        StringBuilder sb = new StringBuilder();
        for (Character b : str.toCharArray()) {
<<<<<<< HEAD
            char result = (char)(b - a);
=======
            char result = b - a < 0 ? (char) 0 : (char)(b - a);
>>>>>>> Lab6
            sb.append(result);
        }
        return sb.toString();
    }

}