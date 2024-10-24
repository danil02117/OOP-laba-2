public class Main {
    public static void main(String[] args) {
        String input = "123456";
        if(input.length() == 6 && input.charAt(0) != '0' && input.matches("[0-9]+")) {
            System.out.println("Заданная строка является шестизначным числом, записанным в десятичной системе счисления без нулей в старших разрядах");
        } else {
            System.out.println("Заданная строка не является шестизначным числом, записанным в десятичной системе счисления без нулей в старших разрядахr");
        }
    }
}
