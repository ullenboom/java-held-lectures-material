package de.tutego.appliances;

public class ProductionDate {
  private int month;
  private int year;

  public int month() {
    return month;
  }

  public ProductionDate month( int month ) {
    this.month = month;
    return this;
  }

  public int year() {
    return year;
  }

  public ProductionDate year( int year ) {
    this.year = year;
    return this;
  }
}
