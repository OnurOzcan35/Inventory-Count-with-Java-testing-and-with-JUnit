/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

import java.util.Comparator;

/**
 *
 * @author CAGLAR BEKLEN
 */
public class ProductComparator implements Comparator<Product>{
    
    @Override
    public int compare(Product o1,Product o2) {
              return o1.getBrand().compareTo(o2.getBrand());
    }
    
}
