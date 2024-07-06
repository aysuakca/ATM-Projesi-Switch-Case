import java.util.Scanner;

public class test {
}
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;

        Scanner input = new Scanner(System.in);

        while (right > 0) {
            System.out.print("Lütfen Kullanıcı Adını Giriniz :");
            userName = input.nextLine();

            System.out.print("Lütfen Şifrenızı Giriniz :");
            password = input.nextLine();

            if (userName.equals("patika") && (password.equals("123"))) {
                System.out.println("Merhaba! Kodluyoruz Bankasına Hoş Geldiniz!");
                do {
                    System.out.println("1- Para Yatırma\n" +
                            "2- Para Çekme\n" +
                            "3- Bakiye Sorgula\n" +
                            "4- Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz.");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Para Miktarı :");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para Miktarı :");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersizdir.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                        case 4:
                            System.out.println("Tekrar Görüşmek Üzere!");
                            break;

                        default:
                            System.out.println("Hatali Giris Yaptiniz.");
                    }
                }
                    while (select != 4);
                        break;
                }else{
                    right--;
                    System.out.println("Hatalı Kullanıcı Adı veya Şifre Girdiniz! Tekrar Deneyiniz.");
                    if (right == 0) {
                        System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                    } else {
                        System.out.println("Kalan hakkınız : " + right);
                    }
                }
            }
        }











