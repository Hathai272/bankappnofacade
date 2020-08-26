/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
/**
 *
 * @author hatai
 */
public class Facade {
    private static Facade MyFacadeObj = null;
        ArrayList<CustomerIf> custl = new ArrayList();
        private Facade(ArrayList<CustomerIf> cust) {
            custl = cust;
        }
        public static Facade getMyFacadeObject(ArrayList<CustomerIf> custl) {
            if(MyFacadeObj == null) {
                MyFacadeObj = new Facade(custl);
            }
            return MyFacadeObj;
        }
        public void doDeposit(double amt, CustomerIf cust, int accNo){
            
            AccountIf acc = new BankAccount(accNo);
            acc = cust.getAccount(accNo);
            acc.deposit(amt);
            
        }
        
        public void getBankAccount(CustomerIf cust, int accNo){
            AccountIf acc = new BankAccount(accNo);
            acc = cust.getAccount(accNo);
            System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
        }
        public void getBanCustomer(String custName){
            custl.stream().filter(cust -> (cust.getCustomerName().equals(custName))).map(cust -> {
            System.out.println("Name = " + cust.getCustomerName());
            return cust;
        }).map(cust -> cust.getllAccounts()).forEachOrdered(accounts -> {
            accounts.forEach(account -> {
                System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
            });
        });
            
        }
}
