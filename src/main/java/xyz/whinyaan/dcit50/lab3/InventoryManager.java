package xyz.whinyaan.dcit50.lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class InventoryManager {
    public HashMap<String, HashMap<String, Integer>> brands = new HashMap<>();
    public List<BoxedProduct> boxedProducts = new ArrayList<>();
    public List<SingleProduct> singleProducts = new ArrayList<>();

    private void ifBrandDoesntExist(String brand) {
        HashMap<String, Integer> brandMap = new HashMap<>();
        brandMap.put("Singles", 0);
        brandMap.put("Boxes", 0);
        brandMap.put("Total Pieces", 0);

        brands.put(brand, brandMap);
    }

    public void add(SingleProduct p) {
        int quantity = 1;

        if (!brands.containsKey(p.brand)) {
            ifBrandDoesntExist(p.brand);
        }

        HashMap<String, Integer> brandMap = brands.get(p.brand);
        
        int singles = brandMap.get("Singles");
        int totalPieces = brandMap.get("Total Pieces");

        brandMap.put("Singles", singles + quantity);
        brandMap.put("Total Pieces", totalPieces + quantity);

        singleProducts.add(p);
    }

    public void add(SingleProduct p, int quantity) {
        if (!brands.containsKey(p.brand)) {
            ifBrandDoesntExist(p.brand);
        }

        HashMap<String, Integer> brandMap = brands.get(p.brand);
        
        int singles = brandMap.get("Singles");
        int totalPieces = brandMap.get("Total Pieces");

        brandMap.put("Singles", singles + quantity);
        brandMap.put("Total Pieces", totalPieces + quantity);

        singleProducts.add(p);
    }

    public void add(BoxedProduct p) {
        int quantity = 1;

        if (!brands.containsKey(p.brand)) {
            ifBrandDoesntExist(p.brand);
        }

        HashMap<String, Integer> brandMap = brands.get(p.brand);
        
        int itemsInBox = p.quantity;
        int boxes = brandMap.get("Boxes");
        int itemsTotal = itemsInBox * boxes;
        int totalPieces = brandMap.get("Total Pieces");

        brandMap.put("Boxes", boxes + quantity);
        brandMap.put("Total Pieces", totalPieces + itemsTotal);

        boxedProducts.add(p);
    }

    public void add(BoxedProduct p, int quantity) {
        if (!brands.containsKey(p.brand)) {
            ifBrandDoesntExist(p.brand);
        }

        HashMap<String, Integer> brandMap = brands.get(p.brand);
        
        int itemsInBox = p.quantity;
        int boxes = brandMap.get("Boxes");
        int itemsTotal = itemsInBox * quantity;
        int totalPieces = brandMap.get("Total Pieces");

        brandMap.put("Boxes", boxes + quantity);
        brandMap.put("Total Pieces", totalPieces + itemsTotal);

        boxedProducts.add(p);
    }

    public String[] getBrands() {
        Set<String> keys = brands.keySet();
        List<String> keysList = new ArrayList<>(keys);
        return keysList.toArray(new String[0]);
    }

    public BoxedProduct[] getBoxes(String brand) {
        return boxedProducts.toArray(new BoxedProduct[0]);
    }

    public SingleProduct[] getSingles(String brand) {
        return singleProducts.toArray(new SingleProduct[0]);
    }
}
