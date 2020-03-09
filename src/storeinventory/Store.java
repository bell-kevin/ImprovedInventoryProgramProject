package storeinventory;
        
/******************************************************************************
 * Store.java 
 * Programmer: @author jcboyd
 * 
 * This class of objects stores information for a store inventory
 *****************************************************************************/

import java.util.*; //Scanner, ArrayList

public class Store 
{
    Scanner stdIn = new Scanner(System.in);
    private ArrayList<Inventory> items = new ArrayList<>();
    
    public Store()
    {
        String name;
        double price;
        int quantity;
        String answer;
        System.out.print("Stock this inventory\n"
                + "Please add an item to inventory\n");
        do
        {
            System.out.print("Name of inventory item: ");
            name = stdIn.nextLine();
            System.out.print("Price of that item: ");
            price = stdIn.nextDouble();
            stdIn.nextLine(); //flush newline
            System.out.print("Quantity of that item: ");
            quantity = stdIn.nextInt();
            stdIn.nextLine(); //flush newline
            items.add(new Inventory(name, price, quantity));
            System.out.print("Continue? Y/N  ");
            answer = stdIn.nextLine();
            
            //items.set = new Inventory(name, price, quantity);
        } while (answer.equalsIgnoreCase("Y")); //end do while
    } //end Store constructor
    
    public void display()
    {
        System.out.println("Inventory Listing");
        for (Inventory obj : items)
        {
                System.out.println(obj.display());
        } // end for each
    } //end display
    
    public int findItem(String name)
    {
        for (int i = 0; i < items.size(); i++)
        {
            if (items.get(i).getName().equals(name))
            {
                return i;
            } //end if
        } //end for each
        return -1;
    } //end findItem
    
    public double sell(String name, int quantity)
    {
        int i = findItem(name);
        if (i == -1)
        {
            System.out.println("Can't find this item, sorry");
            return 0;
        } //end if
        return items.get(i).sell(quantity);
    } //end sell
    
} //end class Store
