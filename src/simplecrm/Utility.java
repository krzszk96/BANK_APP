package simplecrm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Utility {
    
    public static ArrayList<Accounts> readFile(String fileName){
        
        ArrayList<Accounts> accounts1 = new ArrayList<>();
        
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                String[] currentAccount = line.split("<>");
                String customerNumber = currentAccount[0];
                String customerName = currentAccount[1];
                String customerAdress = currentAccount[2];
                double customerBalance = Double.parseDouble(currentAccount[3]);
                
                Accounts acc = new Accounts(customerNumber , customerName, customerAdress, customerBalance);
                accounts1.add(acc);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        return accounts1;
    }
}
