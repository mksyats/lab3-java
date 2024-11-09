/**
 * Represents a cosmetic product with various attributes such as name, brand, type, organic status,
 * and price.
 */
class Cosmetic {

  private final String name;
  private final String brand;
  private final String type;
  private final boolean isOrganic;
  private final double price;

  /**
   * Constructs a new {@code Cosmetic} instance with the specified attributes.
   *
   * @param name      the name of the cosmetic product
   * @param brand     the brand of the cosmetic product
   * @param type      the type of the cosmetic product (for example, LIP_CARE, FACE_CARE)
   * @param isOrganic {@code true} if the cosmetic product is organic; {@code false} otherwise
   * @param price     the price of the cosmetic product
   */
  public Cosmetic(String name, String brand, String type, boolean isOrganic, double price) {
    this.name = name;
    this.brand = brand;
    this.type = type;
    this.isOrganic = isOrganic;
    this.price = price;
  }

  /**
   * Gets the name of this cosmetic product.
   *
   * @return the name of the product
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the brand of this cosmetic product.
   *
   * @return the brand of the product
   */
  public String getBrand() {
    return brand;
  }

  /**
   * Gets the type of this cosmetic product.
   *
   * @return the type of the product
   */
  public String getType() {
    return type;
  }

  /**
   * Checks if this cosmetic product is organic.
   *
   * @return {@code true} if the product is organic; {@code false} otherwise
   */
  public boolean isOrganic() {
    return isOrganic;
  }

  /**
   * Gets the price of this cosmetic product.
   *
   * @return the price of the product
   */
  public double getPrice() {
    return price;
  }

  /**
   * Compares this cosmetic product with another object for equality.
   * <p>
   * Two {@code Cosmetic} objects are considered equal if they have the same values for all their
   * fields.
   *
   * @param obj the object to compare with
   * @return {@code true} if the specified object is equal to this product; {@code false} otherwise
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Cosmetic other)) {
      return false;
    }

    return name.equals(other.name) &&
        brand.equals(other.brand) &&
        type.equals(other.type) &&
        isOrganic == other.isOrganic &&
        price == other.price;
  }

  /**
   * Returns a string representation of this cosmetic product, including its name, brand, type,
   * organic status, and price.
   *
   * @return a formatted string representation of the product
   */
  @Override
  public String toString() {
    String name = "'" + this.name + "'";
    String brand = "'" + this.brand + "'";

    return String.format("Cosmetics{%-20s %-20s %10s %5b %6.2f}",
        name, brand, type, isOrganic, price);
  }
}
