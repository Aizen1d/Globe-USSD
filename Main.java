import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 150;

    public static void main(String[] args) {
        ussdmain();
    }
    public static void ussdmain() {
        System.out.println("WELCOME TO PREPAID LOAD");
        System.out.println("ENTER CODE");

        String ussd = scanner.nextLine();

        if (ussd.equalsIgnoreCase("*143#")) {
            globe();
        }
        else {
            System.out.println("INVALID CODE");
        }

    }
    public static void globe() {
        LocalDate currentDate = LocalDate.now();
        int mainMenuChoice;

        System.out.println("WELCOME TO GLOBE PREPAID LOAD");
        int day = currentDate.getDayOfMonth();
        int month = currentDate.getMonthValue();
        int year = currentDate.getYear();

        goToMainMenu: while (true) { // Main menu
        System.out.println("BAL 0 " + day + "/" + month + "/" + String.valueOf(year).substring(2));
            System.out.println("""
                            0 MyAccount
                            1 Go+
                            2 Go
                            3 GoBOOSTERS
                            4 NEW Go 5G
                            5 Surf4All
                            6 GoPREMIUM
                            7 ALLNET
                            8 All-Time Favorites
                            9 GlobeONE
                            10 GCash
                            11 Rewards
                            12 Loans
                            13 Roaming & Int'l""");
        mainMenuChoice = scanner.nextInt();

            goToInnerMainMenu: while (true) { // Return to last selected
            switch (mainMenuChoice) {
                case 0: // My Account
                    int myAccountChoice;
                    System.out.println("1 Data Balance");
                    System.out.println("2 SurfAlert");
                    System.out.println("3 Load Call Card");
                    System.out.println("4 Share-A-Load/Promo/MB");
                    System.out.println("5 LTE SIM Check");
                    System.out.println("6 My Devices");
                    System.out.println("7 Health & Wellness");
                    System.out.println("8 Back");

                    myAccountChoice = scanner.nextInt();
                    switch (myAccountChoice) { // Get user choice from my account
                        case 1: // Data Balance
                            System.out.println("Your balance is: " + balance);
                            System.exit(0);
                            break;

                        case 2: // Surf Alert
                            System.out.println("1 SurfAlert ON\n2 SurfAlert OFF\n3 Back");
                            myAccountChoice = scanner.nextInt();

                            switch (myAccountChoice) {
                                case 1: // ON
                                    System.out.println("Your SurfAlert is turned on");
                                    System.exit(0);
                                case 2: // OFF
                                    System.out.println("Your SurfAlert is turned off");
                                    System.exit(0);
                                case 3: // Back
                                    continue goToInnerMainMenu;
                                default:
                                    System.out.println("INVALID CODE");
                                    System.exit(0);
                            }
                            break;

                        case 8: // Back
                            continue goToMainMenu;
                    }
                    break;

                case 1: // Go+
                    int goPlusChoice;
                    System.out.println("1 Go+99");
                    System.out.println("2 Go+129");
                    System.out.println("3 Go+149");
                    System.out.println("4 Go+250");
                    System.out.println("5 Go+400");
                    System.out.println("6 Back");

                    goPlusChoice = scanner.nextInt();

                    switch (goPlusChoice) { // Get user choice from Go+
                        case 1: // Go+99
                            System.out.println("Enjoy 8GB data for all sites, 8GB mainMenuChoice of apps,\n" +
                                    "1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 7 days.\n" +
                                    "P99 only.\n1 Subscribe\n2 Back");
                            goPlusChoice = scanner.nextInt();

                            handleGoPlusSubscription(goPlusChoice, 99);
                            break;

                        case 2: // Go+129
                            System.out.println("Enjoy 10GB data for all sites, 8GB mainMenuChoice of apps,\n" +
                                    "1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 7 days.\n" +
                                    "P129 only.\n1 Subscribe\n2 Back");
                            goPlusChoice = scanner.nextInt();

                            handleGoPlusSubscription(goPlusChoice, 129);
                            break;

                        case 3: // Go+149
                            System.out.println("Enjoy 12GB data for all sites, 8GB mainMenuChoice of apps,\n" +
                                    "1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 7 days.\n" +
                                    "P149 only.\n1 Subscribe\n2 Back");
                            goPlusChoice = scanner.nextInt();

                            handleGoPlusSubscription(goPlusChoice, 149);

                            break;

                        case 4: // Go+250
                            System.out.println("Enjoy 15GB data for all sites, 15GB mainMenuChoice of apps,\n" +
                                    "1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 15 days.\n" +
                                    "P250 only.\n1 Subscribe\n2 Back");
                            goPlusChoice = scanner.nextInt();

                            handleGoPlusSubscription(goPlusChoice, 250);
                            break;

                        case 5: // Go+400
                            System.out.println("Enjoy 25GB data for all sites, 15GB mainMenuChoice of apps,\n" +
                                    "1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 15 days.\n" +
                                    "P400 only.\n1 Subscribe\n2 Back");
                            goPlusChoice = scanner.nextInt();

                            handleGoPlusSubscription(goPlusChoice, 400);
                            break;

                        case 6: // Back
                            continue goToMainMenu; // Go back to main menu
                    }

                case 2: // Go
                    int goChoice;
                    System.out.println("1 Go50");
                    System.out.println("2 Go75");
                    System.out.println("3 Go90");
                    System.out.println("4 Go120");
                    System.out.println("5 Go140");
                    System.out.println("6 Go250");
                    System.out.println("7 Go400");
                    System.out.println("8 Back");

                    goChoice = scanner.nextInt();

                    switch (goChoice) { // Get user choice from Go
                        case 1: // Go50
                            System.out.println("Enjoy 5GB data for all sites, unli allnet texts and\n" +
                                    "1GB GoWiFi for 3 days. P50 only." +
                                    "\n1 Subscribe\n2 Back");
                            goChoice = scanner.nextInt();

                            handleGoSubscription(goChoice, 50);
                            break;

                        case 2: // Go75
                            System.out.println("Enjoy 5GB data for all sites, unli allnet texts and\n" +
                                    "unli calls to all networks for 3 days. P75 only." +
                                    "\n1 Subscribe\n2 Back");
                            goChoice = scanner.nextInt();

                            handleGoSubscription(goChoice, 75);
                            break;

                        case 3: // Go90
                            System.out.println("Enjoy 8GB data for all sites, unli allnet texts and\n" +
                                    "1GB GoWiFi for 7 days. P90 only." +
                                    "\n1 Subscribe\n2 Back");
                            goChoice = scanner.nextInt();

                            handleGoSubscription(goChoice, 90);
                            break;

                        case 4: // Go120
                            System.out.println("Enjoy 10GB data for all sites, unli allnet texts and\n" +
                                    "2GB GoWiFi for 3 days. P120 only." +
                                    "\n1 Subscribe\n2 Back");
                            goChoice = scanner.nextInt();

                            handleGoSubscription(goChoice, 120);
                            break;

                        case 5: // Go140
                            System.out.println("Enjoy 11GB data for all sites, unli allnet texts and\n" +
                                    "2GB GoWiFi for 3 days. P140 only." +
                                    "\n1 Subscribe\n2 Back");
                            goChoice = scanner.nextInt();

                            handleGoSubscription(goChoice, 140);
                            break;

                        case 6: // Go250
                            System.out.println("Enjoy 15GB data for all sites, unli allnet texts and\n" +
                                    "2GB GoWiFi for 3 days. P250 only." +
                                    "\n1 Subscribe\n2 Back");
                            goChoice = scanner.nextInt();

                            handleGoSubscription(goChoice, 250);
                            break;

                        case 7: // Go400
                            System.out.println("Enjoy 25GB data for all sites, unli allnet texts and\n" +
                                    "2GB GoWiFi for 3 days. P400 only." +
                                    "\n1 Subscribe\n2 Back");
                            goChoice = scanner.nextInt();

                            handleGoSubscription(goChoice, 400);
                            break;

                        case 8: // Back
                            continue goToMainMenu; // Go back to main menu
                    }

                case 3: // GoBoosters
                    int goBoostersChoice;
                    System.out.println("Add more with your Go promo by registering to any of the following\n" +
                            "GoBOOSTERS:");
                    System.out.println("1 GoBOOST15");
                    System.out.println("2 GoWATCH10");
                    System.out.println("3 GoPLAY10");
                    System.out.println("4 GoSHARE10");
                    System.out.println("5 GoLEARN10");
                    System.out.println("6 More");
                    System.out.println("7 Back");

                    goBoostersChoice = scanner.nextInt();

                    switch (goBoostersChoice) { // Get user choice from GoBoosters
                        case 1: // Boost 15
                            System.out.println("""
                                    Additional 1GB for all sites and apps
                                    1 Subscribe
                                    2 Back""");
                            goBoostersChoice = scanner.nextInt();

                            handleGoBoosterSubscription(goBoostersChoice, 15, "GoBoost15");
                            break;

                        case 2: // Watch 10
                            System.out.println("""
                                    Additional 1GB for video apps
                                    1 Subscribe
                                    2 Back""");
                            goBoostersChoice = scanner.nextInt();

                            handleGoBoosterSubscription(goBoostersChoice, 10, "GoWatch10");
                            break;

                        case 3: // Play 10
                            System.out.println("""
                                    Additional 1GB for gaming apps
                                    1 Subscribe
                                    2 Back""");
                            goBoostersChoice = scanner.nextInt();

                            handleGoBoosterSubscription(goBoostersChoice, 10, "GoPlay10");
                            break;

                        case 4: // Share 10
                            System.out.println("""
                                    Additional 1GB for social media apps
                                    1 Subscribe
                                    2 Back""");
                            goBoostersChoice = scanner.nextInt();

                            handleGoBoosterSubscription(goBoostersChoice, 10, "GoShare10");
                            break;

                        case 5: // Learn 10
                            System.out.println("""
                                    Additional 1GB for learning apps
                                    1 Subscribe
                                    2 Back""");
                            goBoostersChoice = scanner.nextInt();

                            handleGoBoosterSubscription(goBoostersChoice, 10, "GoLearn10");
                            break;

                        case 7: // Back
                            continue goToMainMenu; // Go back to main menu
                    }

                case 4: // NEW Go 5G
                    int go5GChoice;
                    System.out.println("""
                                    1 Go 5G 99
                                    2 Go 5G 199
                                    3 Go 5G 299
                                    4 Back""");

                    go5GChoice = scanner.nextInt();

                    switch (go5GChoice) { // Get user choice from Go5G
                        case 1: // Go 5G 99
                            System.out.println("""
                                    Enjoy unlimited, all-access data in the 5G network,
                                    valid for 3 days, P99 only. T&C apply.
                                    1 Subscribe
                                    2 Back""");
                            go5GChoice = scanner.nextInt();

                            handleGo5GSubscription(go5GChoice, 99, "Go5G 99");
                            break;

                        case 2: // Go 5G 199
                            System.out.println("""
                                    Enjoy unlimited, all-access data in the 5G network,
                                    valid for 7 days, P199 only. T&C apply.
                                    1 Subscribe
                                    2 Back""");
                            go5GChoice = scanner.nextInt();

                            handleGo5GSubscription(go5GChoice, 199, "Go5G 199");
                            break;

                        case 3: // Go 5G 299
                            System.out.println("""
                                    Enjoy unlimited, all-access data in the 5G network,
                                    valid for 15 days, P299 only. T&C apply.
                                    1 Subscribe
                                    2 Back""");
                            go5GChoice = scanner.nextInt();

                            handleGo5GSubscription(go5GChoice, 299, "Go5G 299");
                            break;

                        case 4: // Back
                            continue goToMainMenu; // Go back to main menu
                    }

                case 5: // Surf4All
                    int surf4AllChoice;
                    System.out.println("""
                                    1 Surf4All 99
                                    2 Surf4All 299
                                    3 Status
                                    4 Back""");

                    surf4AllChoice = scanner.nextInt();

                    switch (surf4AllChoice) { // Get user choice from Surf4All
                        case 1: // Surf4All 99
                            System.out.println("""
                                    9GB all-access and shareable data for all,
                                    valid for 7 days, P99
                                    1 Subscribe
                                    2 Subscribe and renew
                                    3 Unsubscribe
                                    4 Back""");
                            surf4AllChoice = scanner.nextInt();

                            handleSurf4AllSubscription(surf4AllChoice, 99, "Surf4All 99");
                            break;

                        case 2: // Surf4All 299
                            System.out.println("""
                                    20GB all-access and shareable data for all,
                                    valid for 7 days, P299
                                    1 Subscribe
                                    2 Subscribe and renew
                                    3 Unsubscribe
                                    4 Back""");
                            surf4AllChoice = scanner.nextInt();

                            handleSurf4AllSubscription(surf4AllChoice, 299, "Surf4All 299");
                            break;

                        case 3: // Status
                            System.out.println("You are not registered to Surf4All");
                            break;

                        case 4: // Back
                            continue goToMainMenu; // Go back to main menu
                    }

                    break;
                }
            }
        }
    }

    private static void handleGoPlusSubscription(int choice, int subscriptionCost) {
        while (true) {
            if (choice == 1) { // Subscribe
                if (balance > subscriptionCost) {
                    System.out.println("You are now registered to Go+" + subscriptionCost);
                    System.exit(0);
                }
                else {
                    System.out.println("Sorry, You don't have enough balance");
                    System.exit(0);
                }
                break;
            }
            else if (choice == 2) { // Back
                break;
            }
            else {
                System.out.println("INVALID CODE");
                System.exit(0);
            }
        }
    }

    private static void handleGoSubscription(int choice, int subscriptionCost) {
        while (true) {
            if (choice == 1) { // Subscribe
                if (balance > subscriptionCost) {
                    System.out.println("You are now registered to Go" + subscriptionCost);
                    System.exit(0);
                }
                else {
                    System.out.println("Sorry, You don't have enough balance");
                    System.exit(0);
                }
                break;
            }
            else if (choice == 2) { // Back
                break;
            }
            else {
                System.out.println("INVALID CODE");
                System.exit(0);
            }
        }
    }

    private static void handleGoBoosterSubscription(int choice, int subscriptionCost, String promoName) {
        while (true) {
            if (choice == 1) { // Subscribe
                if (balance > subscriptionCost) {
                    System.out.println("You are now registered to " + promoName);
                    System.exit(0);
                }
                else {
                    System.out.println("Sorry, You don't have enough balance");
                    System.exit(0);
                }
                break;
            }
            else if (choice == 2) { // Back
                break;
            }
            else {
                System.out.println("INVALID CODE");
                System.exit(0);
            }
        }
    }

    private static void handleGo5GSubscription(int choice, int subscriptionCost, String promoName) {
        while (true) {
            if (choice == 1) { // Subscribe
                if (balance > subscriptionCost) {
                    System.out.println("You are now registered to " + promoName);
                    System.exit(0);
                }
                else {
                    System.out.println("Sorry, You don't have enough balance");
                    System.exit(0);
                }
                break;
            }
            else if (choice == 2) { // Back
                break;
            }
            else {
                System.out.println("INVALID CODE");
                System.exit(0);
            }
        }
    }

    private static void handleSurf4AllSubscription(int choice, int subscriptionCost, String promoName) {
        while (true) {
            if (choice == 1) { // Subscribe
                if (balance > subscriptionCost) {
                    System.out.println("You are now registered to " + promoName);
                    System.exit(0);
                }
                else {
                    System.out.println("Sorry, You don't have enough balance");
                    System.exit(0);
                }
                break;
            }
            else if (choice == 2) { // Subscribe and renew
                if (balance > subscriptionCost) {
                    System.out.println("You are now renewed to " + promoName);
                    System.exit(0);
                }
                else {
                    System.out.println("Sorry, You don't have enough balance");
                    System.exit(0);
                }
                break;
            }
            else if (choice == 3) { // Unsubscribe
                System.out.println("You are now unsubscribed to " + promoName);
                System.exit(0);
            }
            else if (choice == 4) { // Back
                break;
            }
            else {
                System.out.println("INVALID CODE");
                System.exit(0);
            }
        }
    }
    
}
