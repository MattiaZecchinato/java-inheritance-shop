import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // array cart lenght = 1
        Prodotto[] cart = new Prodotto[1];

        // variable condition for while
        boolean exit = true;

        while (exit) {
            System.out.println("Choose an options:\n1)Add an item to cart\n2)Exit");
            int userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    // prevent nextLine() error for string
                    sc.nextLine();

                    System.out.println("Insert the product code:");
                    String prodCode = sc.nextLine();

                    System.out.println("Insert the product name:");
                    String prodName = sc.nextLine();

                    System.out.println("Insert the product brand:");
                    String prodBrand = sc.nextLine();

                    System.out.println("Insert the product price:");
                    BigDecimal prodPrice = sc.nextBigDecimal();

                    System.out.println("Insert the product iva:");
                    BigDecimal prodIva = sc.nextBigDecimal();

                    System.out.println("What type of product is it:\n1)Smartphone\n2)TV\n3)Headphone");
                    int productType = sc.nextInt();

                    switch (productType) {
                        case 1:
                            // prevent nextLine() error for string
                            sc.nextLine();

                            System.out.println("Insert the product IMEIcode:");
                            String prodIMEIcode = sc.nextLine();

                            System.out.println("Insert the product memory:");
                            int prodMemory = sc.nextInt();

                            // smartphone constructor
                            Smartphone smartphone = new Smartphone(prodCode, prodName, prodBrand, prodPrice, prodIva,
                                    prodIMEIcode, prodMemory);

                            cart = addtoCart(cart, smartphone);

                            System.out.println("Smartphone added!");

                            break;
                        case 2:
                            System.out.println("Insert the product width:");
                            double prodWidth = sc.nextDouble();

                            System.out.println("Insert the product heigth:");
                            double prodHeight = sc.nextDouble();

                            System.out.println("Insert the product depth:");
                            double prodDepth = sc.nextDouble();

                            System.out.println("The product is smart:");
                            boolean prodIsSmart = sc.nextBoolean();

                            // televisori constructor
                            Televisori tv = new Televisori(prodCode, prodName, prodBrand, prodPrice, prodIva,
                                    prodWidth, prodHeight, prodDepth, prodIsSmart);

                            cart = addtoCart(cart, tv);

                            System.out.println("TV added!");

                            break;
                        case 3:
                            // prevent nextLine() error for string
                            sc.nextLine();

                            System.out.println("Insert the product colour:");
                            String prodColour = sc.nextLine();

                            System.out.println("The product is wireless:");
                            boolean prodIsWireless = sc.nextBoolean();

                            // cuffie constructor
                            Cuffie headphone = new Cuffie(prodCode, prodName, prodBrand, prodPrice, prodIva,
                                    prodColour, prodIsWireless);

                            cart = addtoCart(cart, headphone);

                            System.out.println("Headphone added!");

                            break;

                        default:
                            System.out.println("Option not valid!");
                            break;
                    }

                    break;
                case 2:
                    exit = false;
                    break;
                default:
                    System.out.println("Option not valid!");
                    break;
            }
        }

        // print the cart
        System.out.println("-------------------");
        for (Prodotto prodotto : cart) {
            if (prodotto != null) {
                System.out.println(prodotto);
                System.out.println("-------------------");
            }
        }

        // scanner close
        sc.close();
    }

    /**
     * Add to the cart a new element and increase the size of it by 1
     *
     * @param oldCart      current array of Prodotto with n size
     * @param productToAdd current Prodotto to add into array
     * @return the new array with the new Prodotto and increased size by 1
     */
    public static Prodotto[] addtoCart(Prodotto[] oldCart, Prodotto productToAdd) {

        oldCart[oldCart.length - 1] = productToAdd;

        Prodotto[] newCart = new Prodotto[oldCart.length + 1];

        for (int i = 0; i < oldCart.length; i++) {
            newCart[i] = oldCart[i];
        }

        return newCart;
    }
}
