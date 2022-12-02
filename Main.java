import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    int continueIn = 0;

    System.out.println("Spencer's Computer Hardware");
    System.out.println("------------------------------------------");
    System.out.println("Inventory Management Software alpha");
    System.out.println("------------------------------------------");

    if (Processors.introContinue() == 1) {
      System.out.println("-----Menu-----");
      System.out.println("1: Check Inventory");
      System.out.println("2: Check Price");
      System.out.println("3: View Item Specs");
      System.out.println("4: Edit stock");
    }

    AMD[] AMD_Processors = new AMD[5];

    AMD_Processors[0] = new AMD("Ryzen 3 2200G", 4, 8, "AM4", "3.7GHz", true, 128.99, 6);

    AMD_Processors[1] = new AMD("Ryzen 5 5300G", 4, 8, "AM4", "4.0GHz", true, 160.45, 10);

    AMD_Processors[2] = new AMD("Ryzen 5 7600X", 6, 12, "AM5", "4.7GHz", false, 298.99, 28);

    AMD_Processors[3] = new AMD("Ryzen 9 5900X", 12, 24, "AM4", "3.7GHz", false, 350.00, 4);

    AMD_Processors[4] = new AMD("Ryzen Threadripper 5975WX", 32, 64, "sWRX8", "3.5GHz", false, 3299.00, 1);

    switch (Processors.actionChoice()) {
      case 1:                                  //view inventory
        System.out.println("Processors:");
        for (int count = 0; count < AMD_Processors.length; count++) {
          System.out.println("[" + (count + 1) + "] " + " " + AMD_Processors[count].model + " "
              + AMD_Processors[count].stock + " " + AMD_Processors[count].price);
        }
        break;
      case 2:                                  //Price check
        System.out.println("Enter the number that corresponds to the item that you would like to price check:");
        for (int count = 0; count < AMD_Processors.length; count++) {
          System.out.println("[" + (count + 1) + "] " + AMD_Processors[count].model);
        }
        System.out.println("$" + AMD_Processors[(Processors.getNumberChoice() - 1)].price);
        break;
      case 3:                                  //Specs
        System.out.println("Select an item to view its specifications:");
        for (int count = 0; count < AMD_Processors.length; count++) {
          System.out.println("[" + (count + 1) + "] " + AMD_Processors[count].model);
        }
        break;
      case 4:                                  //Stock modifier
        System.out.println("Enter the number that corresponds to the item whose stock you would like to edit:");
        for (int count = 0; count < AMD_Processors.length; count++) {
          System.out.println("[" + (count + 1) + "] " + AMD_Processors[count].model);
        }

        break;

    }

  }
}