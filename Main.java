import java.util.Arrays;
import java.util.Comparator;

/**
 * Demonstrates sorting and searching functionality for an array of {@code Cosmetic} objects.
 */
public class Main {

  /**
   * The entry point of the program, which initializes a list of {@code Cosmetic} objects, sorts
   * them by type and price, and searches for an identical cosmetic product.
   *
   * @param args command-line arguments (not used)
   */
  public static void main(String[] args) {
    Cosmetic[] cosmetics = {
        new Cosmetic("Lip Balm", "Nivea", "LIP_CARE", true, 4.99),
        new Cosmetic("Face Cream", "L'Oreal", "FACE_CARE", false, 14.99),
        new Cosmetic("Shampoo", "Dove", "HAIR_CARE", false, 7.49),
        new Cosmetic("Conditioner", "Herbal Essences", "HAIR_CARE", true, 8.99),
        new Cosmetic("Mascara", "Maybelline", "MAKEUP", false, 9.99),
        new Cosmetic("Foundation", "Fenty Beauty", "MAKEUP", false, 35.99),
        new Cosmetic("Hand Cream", "Neutrogena", "BODY_CARE", true, 5.49),
        new Cosmetic("Face Serum", "The Ordinary", "FACE_CARE", true, 12.99),
        new Cosmetic("Body Lotion", "Aveeno", "BODY_CARE", false, 6.99),
        new Cosmetic("Eyeliner", "NYX", "MAKEUP", false, 7.99),
        new Cosmetic("Face Mask", "Garnier", "FACE_CARE", true, 2.99),
        new Cosmetic("Perfume", "Chanel", "FRAGRANCE", false, 120.0),
        new Cosmetic("Nail Polish", "Essie", "NAIL_CARE", false, 5.99),
        new Cosmetic("Shampoo", "Head & Shoulders", "HAIR_CARE", false, 6.49),
        new Cosmetic("Sunscreen", "La Roche-Posay", "SUN_CARE", true, 19.99)
    };

    sortCosmeticsByTypeAndPrice(cosmetics);
    System.out.println("Завдання 1. Відсортований масив косметики:");
    for (Cosmetic cosmetic : cosmetics) {
      System.out.println(cosmetic);
    }

    Cosmetic target = new Cosmetic("Shampoo", "Head & Shoulders", "HAIR_CARE", false, 6.49);
    Cosmetic cosmetic = findIdenticalCosmetic(cosmetics, target);

    if (cosmetic != null) {
      System.out.println("Завдання 2. Косметологічний засіб, ідентичний заданому:");
      System.out.println(cosmetic);
    } else {
      System.err.println("Не вдалося знайти косметологічний засіб, ідентичний заданому.");
      System.exit(1);
    }
  }

  /**
   * Sorts an array of {@code Cosmetic} objects first by type in ascending order, and then by price
   * in descending order.
   *
   * @param cosmetics an array of {@code Cosmetic} objects to be sorted
   */
  static void sortCosmeticsByTypeAndPrice(Cosmetic[] cosmetics) {
    Arrays.sort(cosmetics, Comparator
        .comparing(Cosmetic::getType)
        .thenComparing(Cosmetic::getPrice, Comparator.reverseOrder()));
  }

  /**
   * Searches for an identical {@code Cosmetic} in an array based on its properties. Returns the
   * first matching {@code Cosmetic} object if found; otherwise, returns {@code null}.
   *
   * @param cosmetics an array of {@code Cosmetic} objects to search
   * @param target    the {@code Cosmetic} object to find an identical match for
   * @return the first identical {@code Cosmetic} object if found; {@code null} otherwise
   * @see Cosmetic#equals(Object)
   */
  static Cosmetic findIdenticalCosmetic(Cosmetic[] cosmetics, Cosmetic target) {
    for (Cosmetic cosmetic : cosmetics) {
      if (cosmetic.equals(target)) {
        return cosmetic;
      }
    }
    return null;
  }
}
