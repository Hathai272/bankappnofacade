/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
import MyFacade.Facade;
/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Facade obj = Facade.getMyFacadeObject();
        
       ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc = new BankAccount(12345);
//       acc.deposit(500);
       cust1Accounts.add(acc);
       acc = new BankAccount(12346);
//       acc.deposit(1000);
       cust1Accounts.add(acc);
       CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
       
       ArrayList<AccountIf> cust2Accounts = new ArrayList();
       AccountIf acc2 = new BankAccount(12347);
//       acc.deposit(500);
       cust2Accounts.add(acc2);
       acc2 = new BankAccount(12348);
//       acc.deposit(1000);
       cust2Accounts.add(acc2);
       CustomerIf cust2 = new BankCustomer("Daniel", cust2Accounts);
       
       
//       obj.doDeposit(500,cust1,12345);

//       System.out.println("Customer and account information");
//       System.out.println("Name = " + cust1.getCustomerName());
//       System.out.println("Has " + cust1.getNumAccounts() + " accounts");
       
//       acc = cust1.getAccount(12345);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
//       acc = cust1.getAccount(12346);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
        
        
//       acc.deposit(1000);
//       System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
//       ArrayList<AccountIf> accounts = cust1.getllAccounts();
//       for(AccountIf account : accounts) {
//           System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
//       }
       ArrayList<CustomerIf> custl = new ArrayList();
       custl.add(cust1);
       custl.add(cust2);
       Facade obj = Facade.getMyFacadeObject(custl);
        
       obj.doDeposit(500,cust1,12345);
       obj.doDeposit(500,cust1,12346);
       
       obj.doDeposit(500,cust2,12347);
       
       obj.getBankAccount(cust1, 12345);
       obj.getBankAccount(cust1, 12346);

       obj.getBankAccount(cust2, 12347);
       obj.getBankAccount(cust2, 12348);
        
       obj.getBanCustomer("John");
       obj.getBanCustomer("Daniel");
    }
    
}
