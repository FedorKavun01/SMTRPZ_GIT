package Lab6;

public class Program {
    public static void main(String[] args) {
        String encryptStr = encrypt("Just do it!", (char) 10);
        System.out.println(encryptStr);
        String decryptStr = decrypt(encryptStr, (char) 10);
        System.out.println(decryptStr);
    }

    public static String encrypt(String str, char a) {
        StringBuilder sb = new StringBuilder();
        for (Character b : str.toCharArray()) {
            char result = b + a > Character.MAX_VALUE ? Character.MAX_VALUE : (char)(b + a);
            sb.append(result);
        }
        return sb.toString();
    }

    public static String decrypt(String str, char a) {
        StringBuilder sb = new StringBuilder();
        for (Character b : str.toCharArray()) {
            char result = b - a < 0 ? (char) 0 : (char)(b - a);
            sb.append(result);
        }
        return sb.toString();
    }

}