package org.example.domain.query;

import io.ebean.Database;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PTimestamp;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import org.example.domain.OrderDetail;
import org.example.domain.query.assoc.QAssocOrder;
import org.example.domain.query.assoc.QAssocProduct;

/**
 * Query bean for OrderDetail.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QOrderDetail extends TQRootBean<OrderDetail,QOrderDetail> {

  private static final QOrderDetail _alias = new QOrderDetail(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QOrderDetail alias() {
    return _alias;
  }

  public PLong<QOrderDetail> id;
  public PLong<QOrderDetail> version;
  public PTimestamp<QOrderDetail> whenCreated;
  public PTimestamp<QOrderDetail> whenUpdated;
  public QAssocOrder<QOrderDetail> order;
  public PInteger<QOrderDetail> orderQty;
  public PInteger<QOrderDetail> shipQty;
  public PDouble<QOrderDetail> unitPrice;
  public QAssocProduct<QOrderDetail> product;


  /**
   * Construct with a given Database.
   */
  public QOrderDetail(Database database) {
    super(OrderDetail.class, database);
  }

  /**
   * Construct using the default Database.
   */
  public QOrderDetail() {
    super(OrderDetail.class);
  }

  /**
   * Construct for Alias.
   */
  private QOrderDetail(boolean dummy) {
    super(dummy);
  }
}
