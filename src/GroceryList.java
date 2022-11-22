import util.Input;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryList {



    private static Map<String, Map<String, Integer>> categoriesHashMap;

    private static Map<String, Integer> fruitsCategory;

    private static Map<String, Integer> vegetablesCategory;

    private static Map<String, Integer> cannedGoodsCategory;
    private static Map<String, Integer> dairyCategory;
    private static Map<String, Integer> meatCategory;
    private static Map<String, Integer> fishAndSeafoodCategory;
    private static Map<String, Integer> deliCategory;
    private static Map<String, Integer> condimentsAndSpicesCategory;
    private static Map<String, Integer> snacksCategory;
    private static Map<String, Integer> breadAndBakeryCategory;
    private static Map<String, Integer> beveragesCategory;
    private static Map<String, Integer> pastaRiceCerealCategory;
    private static Map<String, Integer> bakingCategory;
    private static Map<String, Integer> frozenFoodsCategory;
    private static Map<String, Integer> personalCareCategory;
    private static Map<String, Integer> healthCareCategory;
    private static Map<String, Integer> householdAndCleaningSuppliesCategory;
    private static Map<String, Integer> babyItemsCategory;
    private static Map<String, Integer> petCareCategory;


    private static void initializeCategoriesHashmap(){
        if(userContinue("Would you like to create a grocery list?")){
            categoriesHashMap = new HashMap<>();
            boolean userInput = Input.yesNo("Would you like a fruits category in your grocery list?");
            if (userInput == true){
                fruitsCategory = new HashMap<>();
                categoriesHashMap.put("Fruits", fruitsCategory);
            }
            userInput = Input.yesNo("Would you like a vegetables category in your grocery list?");
            if (userInput == true){
                vegetablesCategory = new HashMap<>();
                categoriesHashMap.put("Vegetables", vegetablesCategory);
            }
            promptUserForCategoryItems(categoriesHashMap);
        } else {
            System.out.println("Goodbye!");
        }
    }

    private static void promptUserForCategoryItems(Map<String, Map<String, Integer>> map){
        if (userContinue("Would you like to enter a new item to your grocery list?")){
            System.out.println("Grocery List Categories");
            int i = 0;
            for (Map.Entry<String, Map<String, Integer>> categoryHash : map.entrySet()){
                String category = categoryHash.getKey();
                System.out.println("Enter " + i + " to add to " + category + " category.");
                i++;
            }
            int userInput = Input.getInt(-1, i-1, "Which category would you like to add to? (Enter -1 to view your list)");
            addToCategoryHashMap(userInput);
        } else {
            displayGroceryList(categoriesHashMap);
        }
    }

    private static void promptUserForCategoryItems(Map<String, Map<String, Integer>> map, Boolean bool){
        if (bool){
            System.out.println("Grocery List Categories");
            int i = 0;
            for (Map.Entry<String, Map<String, Integer>> categoryHash : map.entrySet()){
                String category = categoryHash.getKey();
                System.out.println("Enter " + i + " to add to " + category + " category.");
                i++;
            }
            int userInput = Input.getInt(-1, i-1, "Which category would you like to add to? (Enter -1 to view your list)");
            addToCategoryHashMap(userInput);
        } else {
            displayGroceryList(categoriesHashMap);
        }
    }

    private static void displayGroceryList(Map<String, Map<String, Integer>> map){
        for(Map.Entry<String, Map<String, Integer>> categoryMap : map.entrySet()){
            String category = categoryMap.getKey();
            Map <String, Integer> list = categoryMap.getValue();
            if(list.size() > 0){
                System.out.println("Category : " + category);
                TreeMap<String, Integer> sorted = new TreeMap<>();
                sorted.putAll(list);
                for (Map.Entry<String, Integer> entry: sorted.entrySet()){
                    System.out.println("Item Name : " + entry.getKey() + ". Quantity : " + entry.getValue());
                }
            }
        }
        if (userContinue("Would you like to add another item to your list?")) {
            promptUserForCategoryItems(categoriesHashMap);
        } else {
            System.out.println("Goodbye");
        }
    }

    private static boolean userContinue(String prompt){
        boolean userInput = Input.yesNo(prompt);
        return userInput;
    }

    private static void addToCategoryHashMap(int userInput) {
        if (userInput == -1) {
            displayGroceryList(categoriesHashMap);
        } else {
            int j = 0;
            for (Map.Entry<String, Map<String, Integer>> category : categoriesHashMap.entrySet()){
                if (userInput == j){
                    System.out.println("Category : " + category.getKey());
                    String itemName = Input.getString("Item name: ");
                    int itemQuantity = Input.getInt("Item Quantity: ");
                    Map<String, Integer> categoryList = category.getValue();
                    categoryList.putIfAbsent(itemName, itemQuantity);
                    System.out.println("Category: " + category.getKey()+ ". Items : " +  categoryList);
                }
                j++;
            }
            if(userContinue("Select yes to add another item, select no to view your list")){
                promptUserForCategoryItems(categoriesHashMap, true);
            } else {
                displayGroceryList(categoriesHashMap);
            }
        }
    }


    public static void main(String[] args) {
        initializeCategoriesHashmap();
    }
}
