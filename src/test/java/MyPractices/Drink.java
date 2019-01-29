package MyPractices;

import org.junit.Test;
import static org.junit.Assert.*;

public class Drink {

    String[] drinksStr =
            {"Drink{name='Iced Coffee', cost=4.5, quantity=10}",
                    "Drink{name='Iced Tea', cost=2.5, quantity=5}",
                    "Drink{name='Smart Water', cost=4.0, quantity=20}",
                    "Drink{name='Coke', cost=2.3, quantity=13}",
                    "Drink{name='Fanta', cost=2.3, quantity=10}",
                    "Drink{name='Sprite', cost=2.35, quantity=17}",
                    "Drink{name='Ginger Ale', cost=2.4, quantity=20}"};
/*
    @Test
    public void drinkToStringAndFieldsTest() {
        Drink drink = new Drink("Iced Coffee",4.50,10);

        assertEquals("Drink{name='Iced Coffee', cost=4.5, quantity=10}",drink.toString());
        assertEquals("Iced Coffee",drink.getName());
        assertEquals(4.50,drink.getCost(),0);
        assertEquals(10,drink.getQuantity());
    }

  

    @Test
    public void vendingConstructorTest() {
        DrinkVendingMachine vending = getVendingMachine();
        assertEquals( 7,vending.drinks.size());


        for (int i=0; i< vending.drinks.size(); i++) {
            assertEquals(drinksStr[i],vending.drinks.get(i).toString());
        }

    }

    @Test
    public void vendingSelectTest() {
        DrinkVendingMachine vending = getVendingMachine();

        assertEquals(false, vending.isSelected);


        for (int i=0; i< vending.drinks.size(); i++) {
            vending.select(i);
            assertEquals(true, vending.isSelected);

            assertEquals(drinksStr[i], vending.current.toString());
        }

    }

    @Test
    public void vendingSelectNegativeTest() {
        DrinkVendingMachine vending =  getVendingMachine();

        assertEquals(false, vending.isSelected);

        vending.select(-1);
        assertEquals(false, vending.isSelected);
        assertEquals(null, vending.current);

        vending.select(10);
        assertEquals(false, vending.isSelected);
        assertEquals(null, vending.current);

        vending.drinks.get(1).setQuantity(0);
        vending.select(1);
        assertEquals(false, vending.isSelected);
        assertEquals(null, vending.current);
    }

    @Test
    public void vendingPayTest() {
        DrinkVendingMachine vending = getVendingMachine();
        vending.select(5);
        int count = vending.current.getQuantity();
        assertEquals(2.35,vending.amountLeftToPay,0);
        assertEquals(-2.65,vending.pay(5.0) , 0);
        assertEquals(-2.65 , vending.amountLeftToPay , 0);
        assertEquals(2.65 , vending.change , 0);
        assertEquals(count-1, vending.current.getQuantity());


        vending.select(0);
        count = vending.current.getQuantity();
        assertEquals(4.50,vending.amountLeftToPay,0);
        assertEquals(-0.50,vending.pay(5.0) , 0);
        assertEquals(-0.50 , vending.amountLeftToPay , 0);
        assertEquals(0.50 , vending.change , 0);
        assertEquals(count-1, vending.current.getQuantity());

        vending.select(1);
        count = vending.current.getQuantity();
        assertEquals(2.50,vending.amountLeftToPay,0);
        assertEquals(0.0,vending.pay(2.50) , 0);
        assertEquals(0.0 , vending.amountLeftToPay , 0);
        assertEquals(0.0 , vending.change , 0);
        assertEquals(count-1, vending.current.getQuantity());


    }

    @Test
    public void vendingReturnChangeTest() {
        DrinkVendingMachine vending = getVendingMachine();
        vending.select(5);
        int count = vending.current.getQuantity();
        assertEquals(2.35,vending.amountLeftToPay,0);
        assertEquals(-2.65,vending.pay(5.0) , 0);
        assertEquals(-2.65 , vending.amountLeftToPay , 0);
        assertEquals(2.65 , vending.change , 0);
        assertEquals(count-1, vending.current.getQuantity());

        vending.returnChange();
        assertEquals(0.0 , vending.change , 0);
        assertEquals(0.0 ,vending.amountLeftToPay, 0);


        vending.select(0);
        count = vending.drinks.get(0).getQuantity();
        assertEquals(4.50,vending.amountLeftToPay,0);
        assertEquals(-0.50,vending.pay(5.0) , 0);
        assertEquals(-0.50 , vending.amountLeftToPay , 0);
        assertEquals(0.50 , vending.change , 0);
        assertEquals(count-1, vending.drinks.get(0).getQuantity());

        vending.returnChange();
        assertEquals(0.0 , vending.change , 0);
        assertEquals(0.0 ,vending.amountLeftToPay, 0);


        vending.select(1);
        count = vending.drinks.get(1).getQuantity();
        assertEquals(2.50,vending.amountLeftToPay,0);
        assertEquals(0.0,vending.pay(2.50) , 0);
        assertEquals(0.0 , vending.amountLeftToPay , 0);
        assertEquals(0.0 , vending.change , 0);
        assertEquals(count-1, vending.drinks.get(1).getQuantity());

        vending.returnChange();
        assertEquals(0.0 , vending.change , 0);
        assertEquals(0.0 ,vending.amountLeftToPay, 0);



    }

    @Test
    public void vendingCancelTest() {
        DrinkVendingMachine vending = getVendingMachine();
        vending.select(5);
        int count = vending.current.getQuantity();
        assertEquals(2.35,vending.amountLeftToPay,0);
        assertEquals(-2.65,vending.pay(5.0) , 0);
        assertEquals(-2.65 , vending.amountLeftToPay , 0);
        assertEquals(2.65 , vending.change , 0);
        assertEquals(count-1, vending.current.getQuantity());

        vending.cancel();
        assertEquals(null , vending.current);
        assertEquals(0.0 , vending.amountLeftToPay , 0);
        assertEquals(0.0 , vending.change , 0);
        assertEquals(false , vending.isSelected);





        vending.select(0);
        count = vending.drinks.get(0).getQuantity();
        assertEquals(4.50,vending.amountLeftToPay,0);
        assertEquals(-0.50,vending.pay(5.0) , 0);
        assertEquals(-0.50 , vending.amountLeftToPay , 0);
        assertEquals(0.50 , vending.change , 0);
        assertEquals(count-1, vending.drinks.get(0).getQuantity());

        vending.cancel();
        assertEquals(null , vending.current);
        assertEquals(0.0 , vending.amountLeftToPay , 0);
        assertEquals(0.0 , vending.change , 0);
        assertEquals(false , vending.isSelected);


        vending.select(1);
        count = vending.drinks.get(1).getQuantity();
        assertEquals(2.50,vending.amountLeftToPay,0);
        assertEquals(0.0,vending.pay(2.50) , 0);
        assertEquals(0.0 , vending.amountLeftToPay , 0);
        assertEquals(0.0 , vending.change , 0);
        assertEquals(count-1, vending.drinks.get(1).getQuantity());

        vending.cancel();
        assertEquals(null , vending.current);
        assertEquals(0.0 , vending.amountLeftToPay , 0);
        assertEquals(0.0 , vending.change , 0);
        assertEquals(false , vending.isSelected);

    }

    private DrinkVendingMachine getVendingMachine() {
        DrinkVendingMachine vending = new DrinkVendingMachine(
                new Drink("Iced Coffee",4.50,10),
                new Drink("Iced Tea",2.50,5),
                new Drink("Smart Water",4.0,20),
                new Drink("Coke",2.30,13),
                new Drink("Fanta",2.30,10),
                new Drink("Sprite",2.35,17),
                new Drink("Ginger Ale",2.40,20)
        );
        return vending;
    }

*/


}
