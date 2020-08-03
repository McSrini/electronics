/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.textilesproject;

import static com.mycompany.textilesproject.Constants.*;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Parameters {
    
    public static final String PATH_TO_CSV_FILE = "C:\\91firms_rmrao\\Electronics Data-1.csv";
    
    //if not even this many records, ignore this company
    public static final int MINIMUM_RECORDS_PER_COMPANY = 10 ;
    
    public static final int NUM_CHARECTERS = 14 ;
    
    public static final int START_YEAR = 2000 ;
    public static final int END_YEAR = 2017 ;
    
     public static final  ArrayList<String> companiesOfInterest_Set_Electronics = new ArrayList<String>() { 
        {
            add (           "Aplab Ltd.");
            add (           "Avantel Ltd.");
            add (           "B C C Fuba India Ltd.");
           // add (           "B P L Ltd.");
            add (           "Bharat Electronics Ltd.");
            add (           "Centenial Surgical Suture Ltd.");
            add (           "Centum Electronics Ltd.");
            add (           "Continental Controls Ltd.");
            //add (           "Cosmo Ferrites Ltd.");
            add (           "Fine-Line Circuits Ltd.");
            add (           "Gujarat Poly Electronics Ltd.");
            add (           "Hind Rectifiers Ltd.");
            add (           "Incap Ltd.");
            add (           "J C T Electronics Ltd.");
            add ( "K D D L Ltd.");
            add ( "Moser Baer India Ltd.");
            add ( "Opto Circuits (India) Ltd.");
            add ("Ruttonsha International Rectifier Ltd.");
            add ("S P E L Semiconductor Ltd.");
            //add ("Samtel Color Ltd.");
            add ("Shree Pacetronix Ltd.");
            //add ("T V S Electronics Ltd. [Merged]");
            add ("Timex Group India Ltd.");
            //add ( "Trend Electronics Ltd.");
            add("V X L Instruments Ltd.");
            add ( "Valiant Communications Ltd.");
            add ( "Videocon Industries Ltd.");
            add ("Vintron Informatics Ltd.");
            add ("Zenith Computers Ltd.");
        }
     };
    
      
 
    public static final  ArrayList<String> companiesOfInterest =companiesOfInterest_Set_Electronics ;
    
    public static final  ArrayList<String> columnsOfInterest = new ArrayList<String>() { 
            { 
                add("Id"); 
                add("Company Name"); 
                add("Year"); 
                add("Industry"); 
                
                add("Sales"); 
                add("NFA"); 
                add("Debt"); 
                add("Current_Ratio"); 
                add("Total Capital"); 
                add("Net Worth"); 
                add("Debt to Equity Ratio"); 
                add("Retained Profits"); 
                add("Cash Profit"); 
                add("Total Interest Expenses"); 
                add("Export/Sales"); 
                add("GFA"); 
                //add("CA"); 
                add("Cash/CL"); 
                add("Selling and Distribution Expenses"); 
                add("Depreciation"); 
                add("Total Taxes/Total Income"); 
                add("Cumulative Retained Profits"); 
                add("Operating Expenses/Total Expenses"); 
                add("Inventories"); 
                add("Gross Working Capital"); 
                add("Total Liabilities"); 
                add("Borrowings");                  
                add("Total Interest Expenses"); 
                add("Borrowings");  
            } 
        }; 
 
    
  
}
