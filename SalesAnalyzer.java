
/**
 * This class can be used to analyze the sales of a group of sales people.
 * You will be completing the methods to find the total sales, average sale,
 * min and max sale and a generating a report that returns a table with each salesperson's
 * name and amount of sales.  The more challenging part of this project is
 * to write the methods that return an array of names that meet certain criteria.
 * These methods include people with sales greater than or equal to a given
 * amount as well as people that have the maximum sales amounts.
 *
 * @author
 * @version 20171025
 */
public class SalesAnalyzer
{
    private String[] names;
    private int[] sales;

    /**
     * Constructor for objects of class SalesForce.
     * @param names is the names of the salespeople.
     * @param sales is the amount of sales for each sales person.
     * Precondition: names and sales must have same length and not null.
     */
    public SalesAnalyzer(String[] names,int[]sales)
    {
        this.names = names;
        this.sales = sales;
    }

    /*#
     * 1. Write the method totalSales
     */
    /**
     * @return  the total sales of all sales people
     */
    public int totalSales()
    {
        int totalSales= 0;
        for(int i =0; i < sales.length; i++)
        {
            totalSales+=sales[i];
        }
        return totalSales;
    }

    /*#
     * 2. Write the method averageSale
     */
    /**
     * @return  the average of the sales from all sales people
     */
    public double averageSale()
    {
        double averageSale = totalSales()/sales.length;
        return averageSale;
    }

    /*#
     * 3. Write the method maxSale
     */
    /**
     * @return  the maximum sales amount from all sales people
     */
    public int maxSale()
    {
        int maxSale = sales[0];
        for(int i = 0; i < sales.length; i++)
        {
            if(sales[i] > maxSale)
            {
                maxSale = sales[i];
            }
        }
        return maxSale;
    }
    /*#
     * 4. Write the method minSale
     */
    /**
     * @return  the minimum sales amount of all sales people
     */
    public int minSale()
    {
        int minSale = sales[0];
        for(int i = 0; i < sales.length; i++)
        {
            if(sales[i] < minSale)
            {
                minSale = sales[i];
            }
        }
        return minSale;
    }

    /*#
     * 5. Write the method numSalesAtOrAbove
     */
    /**
     * @param n is the minimum sales amount to be counted
     * @return  the number of sales amounts that are greater or equal to n.
     */
    public int numSalesAtOrAbove(int minSale)
    {
        int count = 0;
        for(int i = 0; i < sales.length; i++)
        {
            if(sales[i] >= minSale)
            {
                count+=1;
            }
        }
        return count;
    }

    /*#
     * 6. Write the method maxSalesPeople
     */
    /**
     * @return  an array of the names of the salespeople who have the highest sales.
     */
    public String[] maxSalesPeople()
    {
       String maxNames [] = new String [numSalesAtOrAbove(maxSale())];
       //String maxNames [] = new String [names.length];
       //System.out.println("Debug - maxSale:" + maxSale());
       //System.out.println("Debug - numSalesAtorAbove $" + maxSale() + ": "+ numSalesAtOrAbove(maxSale()));
       //System.out.println("Debug - " + names[0]);
       //System.out.println("Debug - " + names[1]);
       //System.out.println("Debug - " + names[2]);
       //System.out.println("Debug - names length: " + names.length);
       //System.out.println("Debug - maxNames length: " + maxNames.length);
       int j=0;
       for(int i = 0; i < names.length; i++)
        {
         //   System.out.println("Debug - names position["+ i + "] " + names[i]);
         //   System.out.println("Debug - sales position["+ i + "] " + sales[i]);
            if(sales[i] >= maxSale())
            {
         //     System.out.println("Debug - " +  sales[i]);
         //     System.out.println("Debug - " +  names[i]);
              maxNames[j] = names[i];
              j=j+1;
            }
        }
        //for(int k = 0; k < maxNames.length; k++)
        //{
          //  System.out.println("Debug - maxNames array at position["+ k + "]" + maxNames[k]);
        //}
        return maxNames;
    }
    /*#
     * 7. Write the method peopleWithSalesAtOrAbove
     */
    /**
     * @param n is the minimum sales amount for sales person to be included
     * @return an array of strings of the names of salespeople that have sales
     *  that are greater than or equal to n.
     */
    public String[] peopleWithSalesAtOrAbove(int n)
    {
       String maxNames [] = new String [numSalesAtOrAbove(n)];
       int j=0;
       for(int i = 0; i < names.length; i++)
        {
            if(sales[i] >= n)
            {
              maxNames[j] = names[i];
              j=j+1;
            }
        }
        return maxNames;
    }
    /*#
     * 8. Complete the report method
     */
    /**
     * @return a string that, when printed, creates a table of salespeople and sales amounts.
     */
    public String report()
    {

        String s= "Salesperson   Sales\n"+
            "--------------------\n";
        //for()
        //{
        //s+=______+"\t\t" + _____+"\n";
        //}
        /*add a loop here to add in the names and sales*/
        //String maxNames [] = new String [numSalesAtOrAbove(maxSale())];

       for(int i = 0; i < names.length; i++)
        {
              s+=names[i] + "\t\t" + sales[i] + "\n";
        }
        return s;
    }
}
