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
            System.out.println("BAL " + balance + " " + day + "/" + month + "/" + String.valueOf(year).substring(2));
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
                        while (true) {
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
                                    System.out.println("""
                                            Enjoy 8GB data for all sites, 8GB mainMenuChoice of apps,
                                            1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 7 days.
                                            P99 only.
                                            1 Subscribe
                                            2 Back""");
                                    goPlusChoice = scanner.nextInt();

                                    handleGoPlusSubscription(goPlusChoice, 99);
                                    break;

                                case 2: // Go+129
                                    System.out.println("""
                                            Enjoy 10GB data for all sites, 8GB mainMenuChoice of apps,
                                            1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 7 days.
                                            P129 only.
                                            1 Subscribe
                                            2 Back""");
                                    goPlusChoice = scanner.nextInt();

                                    handleGoPlusSubscription(goPlusChoice, 129);
                                    break;

                                case 3: // Go+149
                                    System.out.println("""
                                            Enjoy 12GB data for all sites, 8GB mainMenuChoice of apps,
                                            1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 7 days.
                                            P149 only.
                                            1 Subscribe
                                            2 Back""");
                                    goPlusChoice = scanner.nextInt();

                                    handleGoPlusSubscription(goPlusChoice, 149);

                                    break;

                                case 4: // Go+250
                                    System.out.println("""
                                            Enjoy 15GB data for all sites, 15GB mainMenuChoice of apps,
                                            1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 15 days.
                                            P250 only.
                                            1 Subscribe
                                            2 Back""");
                                    goPlusChoice = scanner.nextInt();

                                    handleGoPlusSubscription(goPlusChoice, 250);
                                    break;

                                case 5: // Go+400
                                    System.out.println("""
                                            Enjoy 25GB data for all sites, 15GB mainMenuChoice of apps,
                                            1 Lifestyle voucher of mainMenuChoice and unli allnet texts for 15 days.
                                            P400 only.
                                            1 Subscribe
                                            2 Back""");
                                    goPlusChoice = scanner.nextInt();

                                    handleGoPlusSubscription(goPlusChoice, 400);
                                    break;

                                case 6: // Back
                                    continue goToMainMenu; // Go back to main menu
                            }
                        }

                    case 2: // Go
                        while (true) {
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
                                    System.out.println("""
                                            Enjoy 5GB data for all sites, unli allnet texts and
                                            1GB GoWiFi for 3 days. P50 only.
                                            1 Subscribe
                                            2 Back""");
                                    goChoice = scanner.nextInt();

                                    handleGoSubscription(goChoice, 50);
                                    break;

                                case 2: // Go75
                                    System.out.println("""
                                            Enjoy 5GB data for all sites, unli allnet texts and
                                            unli calls to all networks for 3 days. P75 only.
                                            1 Subscribe
                                            2 Back""");
                                    goChoice = scanner.nextInt();

                                    handleGoSubscription(goChoice, 75);
                                    break;

                                case 3: // Go90
                                    System.out.println("""
                                            Enjoy 8GB data for all sites, unli allnet texts and
                                            1GB GoWiFi for 7 days. P90 only.
                                            1 Subscribe
                                            2 Back""");
                                    goChoice = scanner.nextInt();

                                    handleGoSubscription(goChoice, 90);
                                    break;

                                case 4: // Go120
                                    System.out.println("""
                                            Enjoy 10GB data for all sites, unli allnet texts and
                                            2GB GoWiFi for 3 days. P120 only.
                                            1 Subscribe
                                            2 Back""");
                                    goChoice = scanner.nextInt();

                                    handleGoSubscription(goChoice, 120);
                                    break;

                                case 5: // Go140
                                    System.out.println("""
                                            Enjoy 11GB data for all sites, unli allnet texts and
                                            2GB GoWiFi for 3 days. P140 only.
                                            1 Subscribe
                                            2 Back""");
                                    goChoice = scanner.nextInt();

                                    handleGoSubscription(goChoice, 140);
                                    break;

                                case 6: // Go250
                                    System.out.println("""
                                            Enjoy 15GB data for all sites, unli allnet texts and
                                            2GB GoWiFi for 3 days. P250 only.
                                            1 Subscribe
                                            2 Back""");
                                    goChoice = scanner.nextInt();

                                    handleGoSubscription(goChoice, 250);
                                    break;

                                case 7: // Go400
                                    System.out.println("""
                                            Enjoy 25GB data for all sites, unli allnet texts and
                                            2GB GoWiFi for 3 days. P400 only.
                                            1 Subscribe
                                            2 Back""");
                                    goChoice = scanner.nextInt();

                                    handleGoSubscription(goChoice, 400);
                                    break;

                                case 8: // Back
                                    continue goToMainMenu; // Go back to main menu
                            }
                        }

                    case 3: // GoBoosters
                        while (true) {
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
                        }

                    case 4: // NEW Go 5G
                        while (true) {
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
                        }

                    case 5: // Surf4All
                        while (true) {
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
                        }

                    case 6: // Go Premium
                        GoPremiumChoices:while (true) {
                            int goPremiumChoice;
                            System.out.println("""
                                    1 Amazon PVME
                                    2 Back""");

                            goPremiumChoice = scanner.nextInt();

                            switch (goPremiumChoice) { // Get user choice from Go Premium
                                case 1: // Amazon PVME
                                    while (true) {
                                        System.out.println("""
                                                1 14-Day Trial
                                                2 PVME50
                                                3 PVME80
                                                4 PVME120
                                                5 APV101
                                                6 BACK""");
                                        goPremiumChoice = scanner.nextInt();

                                        switch (goPremiumChoice) {
                                            case 1: // 14-Day Trial
                                                System.out.println("""
                                                        14 day trial access to Prime Video
                                                        Mobile Edition
                                                        1 Subscribe
                                                        2 Back""");

                                                goPremiumChoice = scanner.nextInt();
                                                handleGoPremiumSubscription(goPremiumChoice, 0, "14-Day Trial Prime Video");
                                                break;

                                            case 2: // PVME50
                                                System.out.println("""
                                                        Enjoy a 7-day subscription to
                                                        Amazon Prime Video Mobile
                                                        Edition PLUS 1GB data for the
                                                        Prime Video app
                                                        1 Subscribe
                                                        2 Back""");
                                                goPremiumChoice = scanner.nextInt();

                                                handleGoPremiumSubscription(goPremiumChoice, 50, "PVME50");
                                                break;

                                            case 3: // PVME80
                                                System.out.println("""
                                                        Enjoy 5GB all-access data PLUS
                                                        a 3-day subscription to Amazon
                                                        Prime Video Mobile Edition, unli
                                                        allnet texts and 1GB for the Prime
                                                        Video app
                                                        1 Subscribe
                                                        2 Back""");
                                                goPremiumChoice = scanner.nextInt();

                                                handleGoPremiumSubscription(goPremiumChoice, 80, "PVME80");
                                                break;

                                            case 4: // PVME120
                                                System.out.println("""
                                                        Enjoy 8GB all-access data PLUS
                                                        a 7-day subscription to Amazon
                                                        Prime Video Mobile Edition, unli
                                                        allnet texts and 3GB for the Prime
                                                        Video app
                                                        1 Subscribe
                                                        2 Back""");
                                                goPremiumChoice = scanner.nextInt();

                                                handleGoPremiumSubscription(goPremiumChoice, 120, "PVME120");
                                                break;

                                            case 5: // APV101
                                                System.out.println("""
                                                        Enjoy a 14-day subscription to
                                                        Amazon Prime Video
                                                        1 Subscribe
                                                        2 Back""");
                                                goPremiumChoice = scanner.nextInt();

                                                handleGoPremiumSubscription(goPremiumChoice, 100, "APV101");
                                                break;

                                            case 6: // Back
                                                continue GoPremiumChoices; // Go back to main menu
                                        }
                                    }
                                case 2: // Back
                                    continue goToMainMenu; // Go back to main menu

                            }
                        }

                    case 7: // Go Unli
                        while (true) {
                            int goUnliChoice;
                            System.out.println("""
                                    The new GoUNLI now has calls &
                                    texts to ALL NETWORKS!
                                    1 GoUNLI20
                                    2 GoUNLI30
                                    3 GoUNLI50
                                    4 GoUNLI95
                                    5 GoUNLI180
                                    6 GoUNLI350
                                    7 Back""");

                            goUnliChoice = scanner.nextInt();

                            switch (goUnliChoice) { // Get user choice from Go Unli
                                case 1: // GoUNLI20
                                    System.out.println("""
                                            GoUNLI20 comes with:
                                            - Unli calls & texts to all networks
                                            - 50MB data for all sites
                                            - P20 valid for 1 day
                                            1 Subscribe
                                            2 Status
                                            3 Back""");
                                    goUnliChoice = scanner.nextInt();

                                    handleGoUNLISubscription(goUnliChoice, 20, "GoUNLI20");
                                    break;

                                case 2: // GoUNLI30
                                    System.out.println("""
                                            GoUNLI30 comes with:
                                            - Unli calls & texts to all networks
                                            - 100MB data for all sites
                                            - P30 valid for 2 days
                                            1 Subscribe
                                            2 Status
                                            3 Back""");
                                    goUnliChoice = scanner.nextInt();

                                    handleGoUNLISubscription(goUnliChoice, 30, "GoUNLI30");
                                    break;

                                case 3: // GoUNLI50
                                    System.out.println("""
                                            GoUNLI50 comes with:
                                            - Unli calls & texts to all networks
                                            - 500MB data for all sites
                                            - P50 valid for 3 days
                                            1 Subscribe
                                            2 Status
                                            3 Back""");
                                    goUnliChoice = scanner.nextInt();

                                    handleGoUNLISubscription(goUnliChoice, 50, "GoUNLI50");
                                    break;

                                case 4: // GoUNLI95
                                    System.out.println("""
                                            GoUNLI95 comes with:
                                            - Unli calls & texts to all networks
                                            - 1GB data for all sites
                                            - P95 valid for 7 days
                                            1 Subscribe
                                            2 Status
                                            3 Back""");
                                    goUnliChoice = scanner.nextInt();

                                    handleGoUNLISubscription(goUnliChoice, 95, "GoUNLI95");
                                    break;

                                case 5: // GoUNLI180
                                    System.out.println("""
                                            GoUNLI180 comes with:
                                            - Unli calls & texts to all networks
                                            - 2GB data for all sites
                                            - P180 valid for 15 days
                                            1 Subscribe
                                            2 Status
                                            3 Back""");
                                    goUnliChoice = scanner.nextInt();

                                    handleGoUNLISubscription(goUnliChoice, 180, "GoUNLI180");
                                    break;

                                case 6: // GoUNLI350
                                    System.out.println("""
                                            GoUNLI350 comes with:
                                            - Unli calls & texts to all networks
                                            - 3GB data for all sites
                                            - P350 valid for 30 days
                                            1 Subscribe
                                            2 Status
                                            3 Back""");
                                    goUnliChoice = scanner.nextInt();

                                    handleGoUNLISubscription(goUnliChoice, 350, "GoUNLI350");
                                    break;


                                case 7: // Back
                                    continue goToMainMenu; // Go back to main menu
                            }
                        }


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

    private static void handleGoPremiumSubscription(int choice, int subscriptionCost, String promoName) {
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

    private static void handleGoUNLISubscription(int choice, int subscriptionCost, String promoName) {
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
            else if (choice == 2) { // Status
                System.out.println("You are not registered to " + promoName);
                System.exit(0);
            }
            else if (choice == 3) { // Back
                break;
            }
            else {
                System.out.println("INVALID CODE");
                System.exit(0);
            }
        }
    }

}
