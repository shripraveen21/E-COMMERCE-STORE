import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;
import java.lang.*;

abstract class User {
    String name;
    String email;
    String password;
    String address;
    String phone;
    String dob;
    abstract void login();
    abstract void signup();
    abstract void detailsdisplay();
}

class Customer extends User {
    String cardCVV;
    String bankAccountNumber;
    Double bankAccountBalance;
    String bankAccountHolderPassword;

    void logdetails() {
        bankAccountNumber = "4536234678";
        bankAccountBalance = 100000.0;
        bankAccountHolderPassword = "shen3";
        cardCVV = "649";
    }

    void signdetails() {
        System.out.println("Enter the bank account number: ");
        Scanner sc = new Scanner(System.in);
        bankAccountNumber = sc.next();

        System.out.println("Enter the bank account balance: ");
        bankAccountBalance = sc.nextDouble();

        System.out.println("Enter the bank account holder password: ");
        bankAccountHolderPassword = sc.next();

        System.out.println("Enter the card CVV: ");
        cardCVV = sc.next();
    }
    void login() {
        boolean check1 = false;
        while (!check1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter login credentials: ");
            name = "shenthan";
            address = "hyderbad";
            phone = "9864375648";
            dob = "03/09/2005";
            System.out.println("Enter the email address: ");
            email = sc.nextLine();
            System.out.println("Enter the password: ");
            password = sc.nextLine();
            if (email.equals("shenthan@gmail.com") && password.equals("shenthan123")) {
                System.out.println("Login successful");
                check1 = true;
            } else {
                System.out.println("Login failed");
            }
        }
    }

    void signup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIGNUP CREDENTIALS TO CREATE AN ACCOUNT.");
        boolean test1 = true;
        while (test1) {
            System.out.print("ENTER MAIL ID:- ");
            email = sc.next();
            String sign = "check";
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    sign = email.substring(i, email.length());
                    break;
                }
            }
            if (sign.equals("@gmail.com")) {
                test1 = false;
            } else {
                System.out.println("INVALID MAIL ENTERED");
            }
        }
        boolean test2 = true;
        while (test2) {
            System.out.print("ENTER USERNAME:- ");
            name = sc.next();
            System.out.print("ENTER PASSWORD:- ");
            password = sc.next();
            if (name.length() < 5 || password.length() < 5) {
                System.out.println("INVALID DETAILS ENTERED");
            } else {
                test2 = false;
            }
        }
        boolean test3 = true;
        while (test3) {
            System.out.print("ENTER PHONE NUMBER:- ");
            phone = sc.next();
            int count = phone.length();
            if (count == 10) {
                test3 = false;
            } else {
                System.out.println("INVALID NUMBER ENTERED");
            }
        }
        boolean test4 = true;
        while (test4) {
            System.out.print("ENTER ADDRESS:- ");
            address = sc.next();
            if (address.length() < 5) {
                System.out.println("INVALID ADDRESS ENTERED");
            } else {
                test4 = false;
            }
        }
        boolean test5 = true;
        while (test5) {
            System.out.print("ENTER DATE OF BIRTH:- ");
            dob = sc.next();
            if (dob.length() < 10) {
                System.out.println("INVALID DATE OF BIRTH ENTERED");
            } else {
                test5 = false;
            }
        }
    }
    void detailsdisplay() {
        System.out.println("NAME:- " + name);
        System.out.println("EMAIL:- " + email);
        System.out.println("Address:- " + address);
        System.out.println("PHONE NUMBER:- " + phone);
        System.out.println("DATE OF BIRTH:- " + dob);
    }
}

class Staff extends User {
    String staffID;
    String staffBankAccountNumber;

    Staff() {
        staffBankAccountNumber = "56789546378";
    }
    void login() {
        boolean check1 = false;
        while (!check1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter login credentials: ");
            name = "meghana";
            address = "kakinada";
            phone = "9456428379";
            dob = "30/06/2004";
            System.out.println("Enter the email address: ");
            email = sc.nextLine();
            System.out.println("Enter the password: ");
            password = sc.nextLine();
            if (email.equals("meghana@gmail.com") && password.equals("meghana123")) {
                System.out.println("Login successful");
                check1 = true;
            } else {
                System.out.println("Login failed");
            }
        }
    }

    void signup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIGNUP CREDENTIALS TO CREATE AN ACCOUNT.");
        boolean test1 = true;
        while (test1) {
            System.out.print("ENTER MAIL ID:- ");
            email = sc.next();
            String sign = "check";
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    sign = email.substring(i, email.length());
                    break;
                }
            }
            if (sign.equals("@gmail.com")) {
                test1 = false;
            } else {
                System.out.println("INVALID MAIL ENTERED");
            }
        }
        boolean test2 = true;
        while (test2) {
            System.out.print("ENTER USERNAME:- ");
            name = sc.next();
            System.out.print("ENTER PASSWORD:- ");
            password = sc.next();
            if (name.length() < 5 || password.length() < 5) {
                System.out.println("INVALID DETAILS ENTERED");
            } else {
                test2 = false;
            }
        }
        boolean test3 = true;
        while (test3) {
            System.out.print("ENTER PHONE NUMBER:- ");
            phone = sc.next();
            int count = phone.length();
            if (count == 10) {
                test3 = false;
            } else {
                System.out.println("INVALID NUMBER ENTERED");
            }
        }
        boolean test4 = true;
        while (test4) {
            System.out.print("ENTER ADDRESS:- ");
            address = sc.next();
            if (address.length() < 5) {
                System.out.println("INVALID ADDRESS ENTERED");
            } else {
                test4 = false;
            }
        }
        boolean test5 = true;
        while (test5) {
            System.out.print("ENTER DATE OF BIRTH:- ");
            dob = sc.next();
            if (dob.length() < 10) {
                System.out.println("INVALID DATE OF BIRTH ENTERED");
            } else {
                test5 = false;
            }
        }
    }
    void detailsdisplay() {
        System.out.println("NAME:- " + name);
        System.out.println("EMAIL:- " + email);
        System.out.println("Address:- " + address);
        System.out.println("PHONE NUMBER:- " + phone);
        System.out.println("DATE OF BIRTH:- " + dob);
    }
}

class Admin extends User {
    String adminID;
    String adminPassword;

    void login() {
        boolean check1 = false;
        while (!check1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter login credentials: ");
            name = "bhargav";
            address = "bangalore";
            phone = "6738495430";
            dob = "03/04/2004";
            System.out.println("Enter the email address: ");
            email = sc.nextLine();
            System.out.println("Enter the password: ");
            password = sc.nextLine();
            if (email.equals("bhargav@gmail.com") && password.equals("bhargav0313")) {
                System.out.println("Login successful");
                check1 = true;
            } else {
                System.out.println("Login failed");
            }
        }
    }

    void signup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIGNUP CREDENTIALS TO CREATE AN ACCOUNT.");
        boolean test1 = true;
        while (test1) {
            System.out.print("ENTER MAIL ID:- ");
            email = sc.next();
            String sign = "check";
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    sign = email.substring(i, email.length());
                    break;
                }
            }
            if (sign.equals("@gmail.com")) {
                test1 = false;
            } else {
                System.out.println("INVALID MAIL ENTERED");
            }
        }
        boolean test2 = true;
        while (test2) {
            System.out.print("ENTER USERNAME:- ");
            name = sc.next();
            System.out.print("ENTER PASSWORD:- ");
            password = sc.next();
            if (name.length() < 5 || password.length() < 5) {
                System.out.println("INVALID DETAILS ENTERED");
            } else {
                test2 = false;
            }
        }
        boolean test3 = true;
        while (test3) {
            System.out.print("ENTER PHONE NUMBER:- ");
            phone = sc.next();
            int count = phone.length();
            if (count == 10) {
                test3 = false;
            } else {
                System.out.println("INVALID NUMBER ENTERED");
            }
        }
        boolean test4 = true;
        while (test4) {
            System.out.print("ENTER ADDRESS:- ");
            address = sc.next();
            if (address.length() < 5) {
                System.out.println("INVALID ADDRESS ENTERED");
            } else {
                test4 = false;
            }
        }
        boolean test5 = true;
        while (test5) {
            System.out.print("ENTER DATE OF BIRTH:- ");
            dob = sc.next();
            if (dob.length() < 10) {
                System.out.println("INVALID DATE OF BIRTH ENTERED");
            } else {
                test5 = false;
            }
        }
    }
    void detailsdisplay() {
        System.out.println("NAME:- " + name);
        System.out.println("EMAIL:- " + email);
        System.out.println("Address:- " + address);
        System.out.println("PHONE NUMBER:- " + phone);
        System.out.println("DATE OF BIRTH:- " + dob);
    }
}

class Product {
    String productName;
    String productID;
    Double productPrice;
    String productAvailability;
    String productDescription;
    static int pindex = 10;
}

class Transaction {
    String transactionID;
    String transactionDate;
    Double transactionAmount;

    Transaction(Double transactionamount) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        transactionID = "trans" + dtf.format(now);
        transactionDate = dtf.format(now);
        this.transactionAmount = transactionamount;
    }
}

class Delivery {
    String deliveryID;
    String deliveryDate;
    String deliveryTime;
    String deliveryStatus;

    Delivery(String deliveryid, String deliverydate, String deliverytime, String deliverystatus) {
        this.deliveryID = deliveryid;
        this.deliveryDate = deliverydate;
        this.deliveryTime = deliverytime;
        this.deliveryStatus = deliverystatus;
    }

    void deliverydisplay() {
        System.out.println("Delivery ID: " + deliveryID);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Delivery Time: " + deliveryTime);
        System.out.println("Delivery Status: " + deliveryStatus);
    }
}

class Cart {
    String cartID;
    String productID;
    Double productPrice = 0.0;

    Cart() {
    }

    Cart(String cartid, String productid, Double productprice) {
        this.cartID = cartid;
        this.productID = productid;
        this.productPrice = productprice;
    }
}

class Wishlist {
    String wishlistID;
    String wishlistDate;
    String wishlistTime;
    String wishlistStatus;
    String wishlistproductID;
    Wishlist(String wishlistID, String wishlistStatus, String productID) {
        this.wishlistID = wishlistID;
        this.wishlistStatus = wishlistStatus;
        this.wishlistproductID = productID;
    }
}

public class STORE {
    public static void main(String[] args) {
        User customer1=new Customer();
        Customer customer2=(Customer)customer1;
        User staff1=new Staff();
        User admin1=new Admin();
        Product products[] = new Product[15];
        Cart cart[] = new Cart[10];
        Wishlist wishlist[] = new Wishlist[10];
        String profile;
        for (int i = 0; i < 15; i++) {
            products[i] = new Product();
        }
        products[0].productName = "Samsung";
        products[0].productID = "S10";
        products[0].productPrice = 100000.00;
        products[0].productAvailability = "Available";
        products[0].productDescription = "(Prism White, 128 GB) (8 GB RAM)";

        products[1].productName = "Oneplus";
        products[1].productID = "10R";
        products[1].productPrice = 50000.00;
        products[1].productAvailability = "Available";
        products[1].productDescription = "(Pine Green, 216GB) (24 GB RAM)";

        products[2].productName = "Apple";
        products[2].productID = "IP12";
        products[2].productPrice = 120000.00;
        products[2].productAvailability = "Available";
        products[2].productDescription = "(Forest Green, 256GB) (12 GB RAM)";

        products[3].productName = "Lenovo";
        products[3].productID = "IP3";
        products[3].productPrice = 30000.00;
        products[3].productAvailability = "Un-Available";
        products[3].productDescription = "Intel Core i3 10th Gen";

        products[4].productName = "Sony";
        products[4].productID = "DI15";
        products[4].productPrice = 50000.00;
        products[4].productAvailability = "Available";
        products[4].productDescription = "(Lake green, 64 GB) (12 GB RAM)";
        
        products[5].productName = "Realme";
        products[5].productID = "RM10";
        products[5].productPrice = 24000.00;
        products[5].productAvailability = "Available";
        products[5].productDescription="(Cyber Silver, 128 GB) (8 GB RAM)";

        products[6].productName = "GooglePixel";
        products[6].productID = "6A";
        products[6].productPrice = 35699.00;
        products[6].productAvailability ="Un-Available";
        products[6].productDescription="(Charcoal, 128 GB) (6 GB RAM)";

        products[7].productName = "LG";
        products[7].productID = "W41pro";
        products[7].productPrice = 28999.00;
        products[7].productAvailability = "Available";
        products[7].productDescription= "(Laser Blue, 128 GB) (6 GB RAM)";

        products[8].productName = "Motorola";
        products[8].productID = "G32";
        products[8].productPrice = 39999.00;
        products[8].productAvailability = "Available";
        products[8].productDescription="(Mineral Gray, 64 GB) (4 GB RAM)";


        products[9].productName = "Vivo";
        products[9].productID = "V25";
        products[9].productPrice = 35699.00;
        products[9].productAvailability ="Un-Available";
        products[9].productDescription="(Elegant Black, 128 GB) (8 GB RAM)";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Welcome to the Electronic Goods Application");
        System.out.println("Please select the user type");
        System.out.println("1. Customer");
        System.out.println("2. Staff");
        System.out.println("3. Admin");
        System.out.println("4. Exit");
        try{
        Scanner sc = new Scanner(System.in);
        int userType = sc.nextInt();
        switch (userType) {
            case 1:
                Customer customer = new Customer();
                System.out.println("Enter login/signup to access the application:- ");
                String log = sc.next();
                if (log.compareTo("login") == 0) {
                    customer1.login();
                    customer2.logdetails();
                } else if (log.compareTo("signup") == 0) {
                    customer1.signup();
                    customer2.signdetails();
                } else {
                    System.exit(0);
                }
                int f, c = 0,z=0;
                do {
                    System.out.println("Please select the product name to view the details");
                    String choice = sc.next();
                    for (int i = 0; i < products.length; i++) {
                        if (choice.equals(products[i].productName)) {
                            System.out.println("Product Name: " + products[i].productName);
                            System.out.println("Product ID: " + products[i].productID);
                            System.out.println("Product Price: " + products[i].productPrice);
                            System.out.println("Product Availability: " + products[i].productAvailability);
                            System.out.println("Product Description: " + products[i].productDescription);
                            System.out.println("Would you like to add the product to the cart? (Y/N)");
                            String order = sc.next();
                            if (order.compareTo("Y") == 0) {
                                    if (products[i].productAvailability.equals("Available") && customer2.bankAccountBalance >= products[i].productPrice) {
                                        if (c < 10) {
                                            cart[c] = new Cart("CART" + dtf.format(now), products[i].productID,
                                                    products[i].productPrice);
                                            c++;
                                        } else {
                                            System.out.println("Cart is full");
                                        }
                                        System.out.println("Final check-out: ");

                                        System.out.println("**** CART_DETAILS ****");
                                        System.out.println("");
                                        int x = 0;
                                        Double total = 0.0;
                                        for (int k = 0; k < c; k++) {
                                            System.out.print("CART_ID:- ");
                                            System.out.println(cart[k].cartID);
                                            System.out.print("PRODUCT_ID:- ");
                                            System.out.println(cart[k].productID);
                                            System.out.print("PRODUCT_PRICE:- ");
                                            System.out.println(cart[k].productPrice);
                                            total = total + cart[k].productPrice;
                                            System.out.println("");
                                        }
                                        System.out.println("Total amount to be paid: " + total);
                                        System.out.println("Do you want to proceed with the payment? (Y/N)");
                                        String payment = sc.next();

                                        if (payment.compareTo("Y")==0) {
                                            System.out.println("Enter bank account number:- ");
                                            String bankAccountNumber = sc.next();
                                            System.out.println("Enter bank cvv:- ");
                                            String cvv = sc.next();
                                            System.out.println("Enter bank account password:- ");
                                            String password = sc.next();
                                            if (bankAccountNumber.compareTo(customer2.bankAccountNumber) == 0
                                                    && cvv.compareTo(customer2.cardCVV) == 0
                                                    && password.compareTo(customer2.bankAccountHolderPassword) == 0) {
                                                if (customer2.bankAccountBalance >= total) {
                                                    customer2.bankAccountBalance -= total;
                                                    System.out.println("Payment successful");
                                                    Transaction transaction=new Transaction(total);
                                                    System.out.println("****Transaction Details****");
                                                    System.out.println("Transaction ID:- "+transaction.transactionID);
                                                    System.out.println("Transaction Date:- "+transaction.transactionDate);
                                                    System.out.println("Transaction Amount:- "+transaction.transactionAmount);
                                                    int l = 0;
                                                    while (l < c) {
                                                        cart[l] = new Cart();
                                                        l++;
                                                    }
                                                    c = 0;
                                                } else {
                                                    System.out.println("Insufficient balance");
                                                    if (z < 10) {
                                            wishlist[z] = new Wishlist("WISHLIST" + dtf.format(now), 
                                            "ADDED", products[i].productID);
                                            z++;
                                        } else {
                                            System.out.println("Wishlist is full");
                                        }
                                        System.out.println("**** WISHLIST_DETAILS ****");
                                        for (int j = 0; j < z; j++) {
                                            System.out.println(wishlist[j].wishlistID + " " +
                                                    wishlist[j].wishlistStatus+" "+wishlist[j].wishlistproductID);
                                        }
                                                }
                                            } else {
                                                System.out.println("Invalid bank account number, CVV or password");
                                            }
                                        }
                                    } else {                              
                                        if (z < 10) {
                                            wishlist[z] = new Wishlist("WISHLIST" + dtf.format(now), 
                                            "ADDED", products[i].productID);
                                            z++;
                                        } else {
                                            System.out.println("Wishlist is full");
                                        }
                                        System.out.println("**** WISHLIST_DETAILS ****");
                                        for (int j = 0; j < z; j++) {
                                            System.out.print("WISH_LIST ID:- ");
                                            System.out.println(wishlist[j].wishlistID);
                                            System.out.print("WISH_LIST STATUS:- ");
                                            System.out.println(wishlist[j].wishlistStatus);
                                            System.out.println("PRODUCT_ID:- ");
                                            System.out.println(wishlist[j].wishlistproductID);
                                        }
                                    }
                            }
                        }
                    }
                    System.out.println("Do you want to place another order? (1/0)");
                    f = sc.nextInt();
                } while (f == 1);

                String deliveryID = "id";
                String deliveryDate = "date";
                String deliveryTime = "time";
                String deliveryStatus = "status";
                Delivery delivery = new Delivery(deliveryID, deliveryDate, deliveryTime, deliveryStatus);
                delivery.deliverydisplay();
                System.out.println("Do you want to see profile details? (Y/N)");
                    profile = sc.next();
                    if (profile.equals("Y")) {
                        customer1.detailsdisplay();
                    }
                break;
            case 2:
                Staff staff = new Staff();
                staff1.login();

                System.out.println("Do you want to add any products? (Y/N)");
                String addProduct = sc.next();

                if (addProduct.equals("Y")) {
                    String productName;
                    String productID;
                    Double productPrice;
                    String productAvailability;
                    String productDescription;
                    Product product = new Product();
                    System.out.println("Enter number of products to be added:- ");
                    int nopro = sc.nextInt();
                    System.out.println();
                    for (int i = Product.pindex; i < (Product.pindex + nopro); i++) {
                        System.out.println("Enter the product name: ");
                        productName = sc.next();
                        System.out.println("Enter the product ID: ");
                        productID = sc.next();
                        System.out.println("Enter the product price: ");
                        productPrice = sc.nextDouble();
                        System.out.println("Enter the product availability: ");
                        productAvailability = sc.next();
                        System.out.println("Enter the product description: ");
                        productDescription = sc.next();
                        products[i].productName = productName;
                        products[i].productID = productID;
                        products[i].productPrice = productPrice;
                        products[i].productAvailability = productAvailability;
                    }
                }
                System.out.println("Do you want to see profile details? (Y/N)");
                    profile = sc.next();
                    if (profile.equals("Y")) {
                        customer1.detailsdisplay();
                    }
                break;
            case 3:
                Admin admin = new Admin();
                admin1.login();
                boolean check2 = true;
                int nopro=0;
                while(check2){
                    System.out.println("Do you want to add/alter/delete products? (ADD/ALTER/DELETE)");
                    String addAlterDelete = sc.next();
                    int temp1=0;
                    if (addAlterDelete.equals("ADD")) {
                        String productName;
                        String productID;
                        Double productPrice;
                        String productAvailability;
                        String productDescription;
                        Product product = new Product();
                        System.out.println("Enter number of products to be added:- ");
                        nopro = sc.nextInt();
                        for (int i = Product.pindex; i < (Product.pindex + nopro); i++) {
                            System.out.println("Enter the product name: ");
                            productName = sc.next();
                            System.out.println("Enter the product ID: ");
                            productID = sc.next();
                            System.out.println("Enter the product price: ");
                            productPrice = sc.nextDouble();
                            System.out.println("Enter the product availability: ");
                            productAvailability = sc.next();
                            System.out.println("Enter the product description: ");
                            productDescription = sc.next();
                            products[i].productName = productName;
                            products[i].productID = productID;
                            products[i].productPrice = productPrice;
                            products[i].productAvailability = productAvailability;
                        }
                    } else if (addAlterDelete.equals("ALTER")) {
                        System.out.println("Enter the product ID to be altered: ");
                        String productID = sc.next();
                        for (int i = 0; i < Product.pindex; i++) {
                            if (productID.compareTo(products[i].productID) == 0) {
                                System.out.println("Enter the new product name: ");
                                String productName = sc.next();
                                System.out.println("Enter the new product price: ");
                                Double productPrice = sc.nextDouble();
                                System.out.println("Enter the new product availability: ");
                                String productAvailability = sc.next();
                                System.out.println("Enter the new product description: ");
                                String productDescription = sc.next();
                                products[i].productName = productName;
                                products[i].productPrice = productPrice;
                                products[i].productAvailability = productAvailability;
                                products[i].productDescription = productDescription;
                            }
                        }
                    } else if (addAlterDelete.equals("DELETE")) {
                        System.out.println("Enter the product ID to be deleted: ");
                        String productID = sc.next();
                        for (int i = 0; i < Product.pindex; i++) {
                            if(products[i].productID!=null){
                            if (productID.compareTo(products[i].productID) == 0) {
                                products[i]=new Product();
                                temp1=i;
                            }
                        }}
                        for (int i = temp1; i < Product.pindex-1; i++) {
                            products[i].productID= products[i + 1].productID;
                            products[i].productName = products[i + 1].productName;
                            products[i].productPrice = products[i + 1].productPrice;
                            products[i].productAvailability = products[i + 1].productAvailability;
                            products[i].productDescription = products[i + 1].productDescription;
                        }
                    }
                    else {
                        System.out.println("Invalid input");
                    }
                    
                        System.out.println("Do you want to see the updated product list? (Y/N)");
                        String seeProductList = sc.next();
                        if (seeProductList.compareTo("Y") == 0) {
                            System.out.println(
                                    "**** PRODUCT_NAME **** PRODUCT_ID **** PRODUCT_PRICE **** PRODUCT_AVAILABILITY **** PRODUCT_DESCRIPTION ****");
                            for (int i = 0; i < Product.pindex+nopro; i++) {
                                System.out.println(products[i].productName + " " + products[i].productID + " "
                                        + products[i].productPrice + " " + products[i].productAvailability + " "
                                        + products[i].productDescription);
                            }
                        }
                    System.out.println("Do you want to do any other functions? (Y/N)");
                    String otherFunctions = sc.next();

                    if(otherFunctions.compareTo("Y")==0){
                        continue;
                    }
                    else{
                        check2=false;
                    }
                    System.out.println("Do you want to see profile details? (Y/N)");
                    profile = sc.next();
                    if (profile.equals("Y")) {
                        admin1.detailsdisplay();
                    }
                    
                }
                break;
            case 4:
                System.out.println("Thank you for using the application");
                break;
            default:
                System.out.println("Invalid user type");
                break;
        }

    }
    catch(Exception e){
        System.out.println("ERROR OCCURED, TRY AGAIN!!");
    }
}
}