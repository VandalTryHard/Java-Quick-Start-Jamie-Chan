/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancedemo;

/**
 *
 * @author Val
 */
public class NormalMember extends Member{
    public NormalMember(){
        System.out.println("Child constuctor with no parameter");
    }
    
    public NormalMember(String pName, int pMemberID, int pMemberSince){
        super(pName, pMemberID, pMemberSince);
        System.out.println("Child Constructor with 3 parameters");
   }
    
    @Override
    public void calculateAnnualFee(){
        annualFee = (1-0.01*getDiscount())*(100+12*30);
    }
}
