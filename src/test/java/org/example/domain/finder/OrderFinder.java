package org.example.domain.finder;

import io.ebean.Finder;
import org.example.domain.Order;
import org.example.domain.query.QOrder;

public class OrderFinder extends Finder<Long,Order> {

  /**
   * Construct using the default Database.
   */
  public OrderFinder() {
    super(Order.class);
  }


  /**
   * Start a new typed query.
   */
  protected QOrder where() {
     return new QOrder(db());
  }

  /**
   * Start a new document store query.
   */
  protected QOrder text() {
     return new QOrder(db()).text();
  }
}
