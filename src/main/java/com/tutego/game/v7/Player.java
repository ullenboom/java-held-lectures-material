package com.tutego.game.v7;

import com.tutego.game.v7.Candy.CandyType;

import java.util.ArrayList;

/**
 * Represents a player in the game who can buy and sell candies.
 * <p>
 * The player maintains an inventory of candies stored in an internal list of {@link Candy} objects.
 */
class Player {

  /**
   * An {@link ArrayList} that stores the player's candy inventory.
   * Each element is a {@link Candy} object.
   */
  private final ArrayList<Candy> candies = new ArrayList<>();

  /**
   * Allows the player to buy a specific type of candy in a certain quantity.
   * <p>
   * If the player already has some candy of the specified type {@code type},
   * the quantity of that existing candy is increased by {@code quantityToAdd}.
   * If the player doesn't have any candy of that type, a new {@link Candy} object
   * with the specified type and quantity is added to the internal list.
   *
   * @param type          The type of candy to buy (from {@link Candy.CandyType}).
   * @param quantityToAdd The quantity of candy to buy (must be positive).
   */
  public void buyCandy( CandyType type, int quantityToAdd ) {
    for ( Candy candyItem : candies ) {
      if ( candyItem.type == type ) {
        candyItem.quantity += quantityToAdd;
        return;
      }
    }
    candies.add( new Candy( type, quantityToAdd ) );
  }

  /**
   * Allows the player to sell a specific type of candy in a certain quantity.
   * <p>
   * If the player has enough candy of the specified type {@code type},
   * the quantity is decreased by {@code quantityToSell}.
   * If the player doesn't have enough candy, the method returns {@code false}.
   * If selling removes all the candy of that type, the corresponding {@link Candy}
   * object is removed from the internal list.
   *
   * @param type           The type of candy to sell (from {@link Candy.CandyType}).
   * @param quantityToSell The quantity of candy to sell (must be positive).
   * @return true if the candy was sold successfully, false otherwise.
   */
  public boolean sellCandy( CandyType type, int quantityToSell ) {

    for ( int i = 0; i < candies.size(); i++ ) {
      Candy candyItem = candies.get( i );
      if ( candyItem.type == type ) {
        if ( candyItem.quantity < quantityToSell )
          return false;
        else if ( candyItem.quantity == quantityToSell )
          candies.remove( i );
        else
          candyItem.quantity -= quantityToSell;
        return true;
      }
      // else candyItem.type != type
    }

    return false;
  }

  /**
   * Prints the player's current candy inventory in a formatted manner.
   */
  public void displayCandies() {
    for ( Candy candy : candies ) {
      System.out.println( "I have " + candy.quantity + " " + candy.type );
    }
  }
}
